import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.Random; 


public class Rock 
{ 
	private static boolean done = false;
	private static boolean futurePotion = false;
	private static boolean luckPotion = true;
	
	public void RockPaperScissors(String userResponse, String villainResponse) {
		done = true;
		if (userResponse.toUpperCase().equals(villainResponse)) {
			System.out.println("It's a tie, choose again");
			done = false;
		}
		
		else if (userResponse.toUpperCase().equals("R")) {
			if (villainResponse.equals("P")) { 
				System.out.println("Paper beats rock, you LOSE");
			}
			else {
				System.out.println("Rock beats Scissors, you WIN");
			}
		}
		
		else if (userResponse.toUpperCase().equals("P")) {
			if (villainResponse.equals("S")) { 
				System.out.println("Scissors beats paper, you LOSE");
			}
			else {
				System.out.println("Paper beats rock, you WIN");
			}
		}
		
		else if (userResponse.toUpperCase().equals("S")) {
			if (villainResponse.equals("R")) { 
				System.out.println("Rock beats scissors, you LOSE");
			}
			else {
				System.out.println("Scissors beats paper, you WIN");
			}
		}
	}
	
	public static void main(String[] args) 
	{
		Rock game = new Rock();
		List<String> options = Arrays.asList("R", "P", "S", "rock", "paper", "scissors");
		Scanner scanner = new Scanner(System.in);
		while (done == false) {
			System.out.println("Select 'R', 'P', or 'S'");
			String userResponse = scanner.next();
			Random generator = new Random();
			int randomInt = generator.nextInt(3);
			if (luckPotion == true) { //makes villain more likely to chose Rock
				randomInt = generator.nextInt(6);
				if (randomInt >= 3) {
					randomInt = 0;  //makes random integers 3, 4, 5 equal to 0 (Rock)
				}
			}
			if (futurePotion == true) {  //makes villain more likely to chose option that is beaten by hero
				randomInt = generator.nextInt(6);
				if (randomInt >= 3) {
					if (userResponse.toUpperCase().equals("R")) {
						randomInt = 2;
					}
					if (userResponse.toUpperCase().equals("P")) {
						randomInt = 0;
					}
					if (userResponse.toUpperCase().equals("S")) {
						randomInt = 1;
					}
				}
			}
			String villainResponse = options.get(randomInt);
			String villainResponseWord = options.get(randomInt + 3);
			System.out.println("Villain plays " + villainResponseWord);
			game.RockPaperScissors(userResponse, villainResponse);
		}
		scanner.close();
	}
}