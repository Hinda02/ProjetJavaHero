package univers.personage;

import univers.Familiar;
import univers.tools.Item;
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
	
	public Familiar getFamiliar() {
		return familiar;
	}

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

	

	



	
	
	

}
