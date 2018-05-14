import java.util.Arrays;
import java.util.List;

public class Villains {
	private String villainName;
	private String villainTaunt;
	private List<String> favouriteGames = Arrays.asList();

	
	public Villains(String name, String taunt, List<String> favouriteGames) {
		villainName = name;
		villainTaunt = taunt;
		this.favouriteGames = favouriteGames;
	}
	
	public String getName() {
		return villainName;
	}

	
	public static void main(String[] args) {
		Villains DeGea = new DeGea();
		System.out.println(DeGea.villainName);
		System.out.println(DeGea.villainTaunt);
		System.out.println(DeGea.favouriteGames);
	}
}