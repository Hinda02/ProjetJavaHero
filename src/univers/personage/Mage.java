package univers.personage;

import univers.Familiar;
import univers.tools.MagicalWeapon;
import univers.tools.Weapon;

//class inherits from Personage
public class Mage extends Hero {
	
	//private attribute
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

	

	
	@Override
	public String toString() {
		
		String result = super.toString() + " \nPouvoir magique: " + familiar + ".";
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(!(obj instanceof Mage)) {
			return false;
		}
		
		Mage mage = (Mage) obj;
		
		if(super.equals(mage) && (this.familiar == mage.familiar)) {
			return true;
		}else {
			return false;
		}
		
	}





}
