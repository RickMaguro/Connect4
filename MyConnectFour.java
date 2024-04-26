public class MyConnectFour {

	public MyConnectFour(){
		playGame();
	}
	// The main game playing arribute
	private void playGame(){
    Board board = new Board(6, 7);
    P1 P1 = new P1('r');
    Com Com = new Com('y');
		System.out.println("Welcome to Connect 4");
		System.out.println("There are 2 players red and yellow");
		System.out.println("Player1 is Red, Computer is Yellow");
		System.out.println("To play the game type in the number of the column you want to drop you counter in");
		System.out.println("A player wins by connecting 4 counters in a row - vertically, horizontally or diagonally");
		System.out.println("");
		board.printBoard();
		boolean win = false;
		while(!win){
			// Player1 checking process
      System.out.println("Red's (Your) turn");  
			board.placeCounter('r',P1.getMove(), board);
			boolean hasWon = false;
      
			// check horizontal win
      for(int i = 0; i<board.getRow(); i++){
			  for (int j = 0;j < board.getCol() - 3;j++){
  				if (board.getTurns()[i][j] == 'r' && 
  					board.getTurns()[i][j+1] == 'r' &&
  					board.getTurns()[i][j+2] == 'r' &&
  					board.getTurns()[i][j+3] == 'r'){
  					hasWon = true;
  				}
  			}			
		  }

			// check vertical win
			for(int i = 0; i<board.getRow() - 3; i++){
			    for (int j = 0;j < board.getCol();j++){
    				if (board.getTurns()[i][j] == 'r' && 
    					board.getTurns()[i+1][j] == 'r' &&
    					board.getTurns()[i+2][j] == 'r' &&
    					board.getTurns()[i+3][j] == 'r'){
    					hasWon = true;
    				}
    			}			
		    }
      
      // check upward diagonal win
      for(int i = 3; i < board.getRow(); i++){
			  for(int j = 0; j < board.getTurns()[0].length - 3; j++){
  				if (board.getTurns()[i][j] == 'r' && 
  					board.getTurns()[i-1][j+1] == 'r' &&
  					board.getTurns()[i-2][j+2] == 'r' &&
  					board.getTurns()[i-3][j+3] == 'r'){
  					hasWon = true;
  				}
  			}
  		}
      // check downward diagonal win
      for(int i = 0; i < board.getRow() - 3; i++){
			  for(int j = 0; j < board.getTurns()[0].length - 3; j++){
  				if (board.getTurns()[i][j] == 'r' && 
  					board.getTurns()[i+1][j+1] == 'r' &&
  					board.getTurns()[i+2][j+2] == 'r' &&
  					board.getTurns()[i+3][j+3] == 'r'){
  					hasWon = true;
  				}
  			}
  		}
			board.printBoard();
			if(hasWon){
				win = true;
        System.out.println("Red Has Won!!!");
			}
			else{
				//Com checking process
        System.out.println("Yellow's (Computer) turn: Type in a column number");
				board.placeCounter('y',Com.getMove(), board);
				hasWon = false;
				// check horizontal win
        for(int i = 0; i<board.getRow(); i++){
			    for (int j = 0;j < board.getCol() - 3;j++){
    				if (board.getTurns()[i][j] == 'y' && 
    					board.getTurns()[i][j+1] == 'y' &&
    					board.getTurns()[i][j+2] == 'y' &&
    					board.getTurns()[i][j+3] == 'y'){
    					hasWon = true;
    				}
    			}			
		    }

				// check vertical win
				for(int i = 0; i<board.getRow() - 3; i++){
			    for (int j = 0;j < board.getCol();j++){
    				if (board.getTurns()[i][j] == 'y' && 
    					board.getTurns()[i+1][j] == 'y' &&
    					board.getTurns()[i+2][j] == 'y' &&
    					board.getTurns()[i+3][j] == 'y'){
    					hasWon = true;
    				}
    			}			
		    }
        // check upward diagonal win
        for(int i = 3; i < board.getRow(); i++){
  			  for(int j = 0; j < board.getTurns()[0].length - 3; j++){
    				if (board.getTurns()[i][j] == 'y' && 
    					board.getTurns()[i-1][j+1] == 'y' &&
    					board.getTurns()[i-2][j+2] == 'y' &&
    					board.getTurns()[i-3][j+3] == 'y'){
    					hasWon = true;
    				}
    			}
    		}
        // check downward diagonal win
        for(int i = 0; i < board.getRow() - 3; i++){
  			  for(int j = 0; j < board.getTurns()[0].length - 3; j++){
    				if (board.getTurns()[i][j] == 'y' && 
    					board.getTurns()[i+1][j+1] == 'y' &&
    					board.getTurns()[i+2][j+2] == 'y' &&
    					board.getTurns()[i+3][j+3] == 'y'){
    					hasWon = true;
    				}
    			}
    		}
				board.printBoard();
				if(hasWon){
					win = true;
          System.out.println("Yellow Has Won!!!");
				}
			}
		}	
	}
}