//Create an array for the game, inclouding print board and place counter
public class Board{
  private char[][] board;
  private int i;  //row
  private int j;  //col
  private int turns; // row*col
  
  public Board(int i, int j) {
    this.i = i;
    this.j = j;

    board = new char[i][j];
    turns = i*j;
  }
  public int getRow(){
    return i;
  }
  public int getCol(){
    return j;
  }
  
  public char[][] getTurns(){
    return board;
  }

  public String printBoard(){
    String returnStr = "";

    returnStr += "\n";
    for(int i=0; i<board.length; i++){
			for(int j=0; j<board[i].length; j++){ 
				if(board[i][j] == 'r'){
					// Print("| r ") in output;
          returnStr += "| r ";
				}
				else if(board[i][j] == 'y'){
					// Print("| y ") in output;
          returnStr += "| y ";
          
				}
				else{
					// Print("|   ") in output;
          returnStr += "|   ";
				}
			}
      returnStr += "|"; // Println("|") in output;
      returnStr += "\n";
			
		}
    
    // Println("  1   2   3   4   5   6   7") in output;
    returnStr += ("  1   2   3   4   5   6   7");
		System.out.println(returnStr);
    
    return returnStr;
  }

  public void placeCounter(char player, int position, Board board){
    boolean placed = false;
  		if(player == 'r'){
        for(int i=board.getRow()-1; i>=0; i--){
          if(!placed){
            // if(board[i][position-1] == 'y'){
            if(board.getTurns()[i][position-1] == 'y'){
              // skip
            }
            else if(board.getTurns()[i][position-1] != 'r'){
              board.getTurns()[i][position-1] = 'r';
              placed = true;
            }
          }
        }
  		}
  		else if(player == 'y'){
  			for(int i=board.getRow()-1; i>=0; i--){
  				if(!placed){
  					if(board.getTurns()[i][position-1] == 'r'){
  						// skip
  					}
  					else if(board.getTurns()[i][position-1] != 'y'){
  						board.getTurns()[i][position-1] = 'y';
  						placed = true;
  					} 
  				}
  			}
  		}
	}
}