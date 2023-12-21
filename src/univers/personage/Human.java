package univers.personage;

import univers.Familiar;
import univers.tools.NonMagicalWeapon;

//class inherits from Personage
public class Human extends Hero{

	private Familiar familiar = null;
	
	/**
	 * Constructor for class Human
	 * @param name
	 * @param weapon
	 */
	public Human(String name, NonMagicalWeapon weapon, Familiar familiar) {
		super(name, weapon);
		super.setHp(100);
		this.setFamiliar(familiar);
	}
	
	/**
	 * returns the human's familiar 
	 * @return Familiar 
	 */
	public Familiar getFamiliar() {
		return familiar;
	}
	
	/**
	 * modifies the human's familiar
	 * @param familiar
	 */
	public void setFamiliar(Familiar familiar) {
		this.familiar = familiar;
	}
	
	@Override
	public void fight(Personage opponent) {
		
		if(this.isAlive()) {
			opponent.receiveDamage(this.getWeapon().getPower());
			this.getFamiliar().fight(opponent);
		}
		
	}
	/**
	 * returns the human's info
	 * @return String
	 */
	@Override
	public String toString() {
		
		String result = super.toString()  + "\nVotre familier : " + familiar.toString(); 
		return result;
	}
	
	/**
	 * compares two objects of type Human
	 * @return boolean
	 */
	@Override
	public boolean equals(Object obj) {
		if(obj == this) {
			return true;
		}
		
		if (!(obj instanceof Human)) {
			return false;
		}
		
		Human human = (Human) obj;
		
		if(super.equals(human) && (this.familiar.equals(human.familiar))) {
			return true;
		}else {
			return false;
		}
	}

}
