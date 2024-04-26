import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


//Modularise the main input function, and let player and computer can use it
public class Input{
  private BufferedReader input;

  public void userInput(){
  input = new BufferedReader(new InputStreamReader(System.in));
  }

  public int getColumn(){
		int toReturn = 0;
		try{			
			toReturn = Integer.parseInt(input.readLine());
      return toReturn;
		}
		catch(IOException e){
			return 0;
		}
		
	}
}