import java.util.Random;

//Combine the getMove(), getCounter() into class Player.
//Let P1 and Com inherit the main Player function

public abstract class Player {
 
  private char counter;
  
  public Player(char counter) {
    this.counter = counter;
  }
 
  abstract int getMove();
 
  public char getCounter() {
    return counter;
  }
}

//Player1 function 
class P1 extends Player{

  public P1(char counter) {
    super(counter);
  }

  Input P1Input = new Input();

  public int getMove(){
    P1Input.userInput();
    return P1Input_col();
  }
 
  public int P1Input_col() {
    return P1Input.getColumn();
  }
}

//Computer function
class Com extends Player{
 
  private Random rand;

  public Com(char counter) {
    super(counter);
  }

  Input ComInput = new Input();

  //This is the randomly key in code for Computer
  public int getMove() {
    rand = new Random();
    return (rand.nextInt(7) + 1); 
  }


  //The code below is a manual input code for testing
  
  // public int getMove(){
  //   ComInput.userInput();
  //   return ComInput_col();
  // }
 
  // public int ComInput_col() {
  //   return ComInput.getColumn();
  // }
  
}