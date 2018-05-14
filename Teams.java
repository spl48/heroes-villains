import java.util.ArrayList;
import java.util.Scanner;

public class Teams {
	
	private ArrayList < String > listHeroes = new ArrayList < String > ();
	private ArrayList < String > listPowerUps = new ArrayList < String > ();
	private ArrayList < String > listHealing = new ArrayList < String > ();
	private ArrayList < String > listMaps = new ArrayList<String> ();
	private int money = 500;
	private String teamName;
	
	public void setName() {
		Scanner scanner = new Scanner(System.in);
		teamName = scanner.nextLine();
		if (teamName.length() < 2 | teamName.length() > 10) {
			System.out.println("Try again, Team name must be between 2 and 10 characters long");
			setName();
		}
		scanner.close();
	}
	
	public String getName() {
		return teamName;
	}
	
	public ArrayList<String> getPowerUps() {
		return listPowerUps;
	}
	
	public ArrayList<String> getHealing() {
		return listHealing;
	}
	
	public ArrayList<String> getMaps() {
		return listMaps;
	}
	
	public int getMoney() {
		return money;
	}
	
	public void addHero(String hero) { /** adds hero to list of heroes*/
		listHeroes.add(hero);
	}

	public static void main(String[] args) {
		Teams team = new Teams();
		team.setName();
	}

}
