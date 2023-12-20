package univers.personage;

import java.util.Random;
import univers.tools.Weapon;

//class inherits from Angel
public class Demon extends Angel {
	
	//private attribute
	private int curse;

	/**
	 * Constructor for class Demon
	 * @param name
	 * @param weapon
	 */
	public Demon(String name, Weapon weapon) {
		super(name, weapon);
		super.setHp(100);
		super.setBlessing(20);
		//random curse number between -30 and 30
		Random rand = new Random();
		this.curse = rand.nextInt(20) - 10;
	}
	
	@Override
	public void fight(Personage opponent) {

		opponent.receiveDamage(this.getWeapon().getPower() + this.getCurse());
	}
	
	public int getCurse() {
		return curse;
	}

	@Override
	public String toString() {
		
		String result = super.toString() + " \nPuissance de mal�diction: " + curse + ".";
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(!(obj instanceof Demon)) {
			return false;
		}
		
		Demon thing = (Demon) obj;
		
		if(super.equals(thing) && (this.curse == thing.curse)) {
			return true;
		}else {
			return false;
		}
		
	}

}
