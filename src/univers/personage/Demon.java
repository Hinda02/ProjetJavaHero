package univers.personage;

import java.util.Random;
import univers.tools.Weapon;

//class inherits from Angel
public class Demon extends Angel {
	
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
		//random curse number between -10 and 10
		Random rand = new Random();
		this.curse = rand.nextInt(20) - 10;
	}
	
	@Override
	public void fight(Personage opponent) {

		opponent.receiveDamage(this.getWeapon().getPower() + this.getCurse());
	}
	
	/**
	 * returns the demon's curse's level
	 * @return curse level
	 */
	public int getCurse() {
		return curse;
	}
	
	/**
	 * returns the Demon's info
	 */
	@Override
	public String toString() {
		
		String result = super.toString() + " \nPuissance de malédiction: " + curse + ".";
		
		return result;
	}
	
	/**
	 * Compare if two objects are equal 
	 */
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
