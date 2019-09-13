/*
 * Pruthvi Punwar
 */
import java.util.Random;

public class CoinToss {
	private String sideUp; // instance varibale
	
	public CoinToss() { // tosses 
		toss();
	}

	public void toss() { // this method randomly tosses the coin
		Random random = new Random();
		int random_int = random.nextInt(2);
		if (random_int == 0)
			this.sideUp = "Heads";
		else
			this.sideUp = "Tails";
	}

	public String getSideUp() { // returns sideUp variable 
		return sideUp;
	}

	

}
