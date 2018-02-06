//This program plays rock paper scissors with the user
import java.util.Scanner;

public class problem3_17 {

	public static void main(String[] args) {
		int comp = (int)(Math.random() * 4);
		
		Scanner input = new Scanner(System.in);
		System.out.print("scissor (0), rock (1), paper (2): ");
		
		int user = input.nextInt();
		
		System.out.print("The computer is " + moveType(comp) + ". " + "You are " 
		+ moveType(user) + ". " + check(comp, user));
	}
	
	private static String moveType(int player) {
		if (player == 0) {
			String moveType = "scissors";
			return moveType;
		} else if (player == 1) {
			String moveType = "rock";
			return moveType;
		} else if (player == 2) {
			String moveType = "paper";
			return moveType;
		} 
//		else {
//			System.out.print("That's not a move!");
//			System.exit(1);
//		}
		return (String) null;
	}
	
	private static String check(int cmpt, int usr) {
		if (cmpt == usr) {
			String check = "It is a tie!";
			return check;
		} else if (cmpt > usr) {
			String check = "You lost!";
			return check;
		} else {
			String check = "You won!";
			return check;
		}
//		return (String) null;
	}

}
