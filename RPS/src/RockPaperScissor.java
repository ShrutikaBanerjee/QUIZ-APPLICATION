import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//create an array
		while(true) {
		String [] rps = {"r", "p", "s"};
		//using random generator to get random input 
		String ComputeMove = rps[new Random().nextInt(rps.length)];
		String playerMove;
		while(true) {
		System.out.println("enter your move that is r, p , s ");
		 playerMove= sc.nextLine();
		if(playerMove.equals("r")||playerMove.equals("p")||playerMove.equals("s")) {
			break;// jump statement meaning this loop will run only once 
		}
		System.out.println(playerMove +"  is not valid");
    
	}
		System.out.println("computer played  "+ ComputeMove);
		if(playerMove.equals(ComputeMove)) {
			System.out.println("it was a tie");
		}
		else if(playerMove.equals("r")) {
			if(ComputeMove.equals("p")) {
				System.out.println("you lose!");
			}
			else if(ComputeMove.equals("s")) {
				System.out.println("you win!");
			}
			
		}
		else if(playerMove.equals("p")) {
			if(ComputeMove.equals("r")) {
				System.out.println("you win!");
			}
			else if(ComputeMove.equals("s")) {
				System.out.println("you lose !");
			}
			
		}
		else if(playerMove.equals("s")) {
			if(ComputeMove.equals("p")) {
				System.out.println("you win!");
			}
			else if(ComputeMove.equals("r")) {
				System.out.println("you lose!");
			}
			
		}
		System.out.println("play again?  (y/n)");
		String playAgain= sc.nextLine();
		
		if(!playAgain.equals("y")) {
			System.out.println(" invalid argument!");
			break;
		}
		
	
		
		
	}
	} 
}
