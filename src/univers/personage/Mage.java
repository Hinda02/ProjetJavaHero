package univers.personage;

import univers.Familiar;
import univers.tools.MagicalWeapon;

public class Mage extends Hero {
	
	private Familiar familiar = null;

	/**
	 * Constructor for class Mage
	 * @param name
	 * @param weapon
	 */
	public Mage(String name, MagicalWeapon weapon, Familiar familiar) {
		super(name, weapon);
		super.setHp(100);
		this.familiar = familiar;
		
	}
	
	/**
	 * returns the mage's familiar 
	 * @return Familiar 
	 */
	public Familiar getFamiliar() {
		return familiar;
	}
	
	/**
	 * modifies the mage's familiar
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
	 * returns the mage's info
	 * @return String
	 */
	@Override
	public String toString() {
		
		String result = super.toString()  + "\nVotre familier : " + familiar.toString(); 
		return result;
	}
	
	/**
	 * compares two objects of type Mage
	 * @return boolean
	 */
	@Override
	public boolean equals(Object obj) {
		if(obj == this) {
			return true;
		}
		
		if (!(obj instanceof Mage)) {
			return false;
		}
		
		Mage mage = (Mage) obj;
		
		if(super.equals(mage) && (this.familiar.equals(mage.familiar))) {
			return true;
		}else {
			return false;
		}
	}




}
