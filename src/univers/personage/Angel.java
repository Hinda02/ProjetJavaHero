package univers.personage;

import univers.tools.Item;
import univers.tools.Weapon;

//class inherits from Personage
public class Angel extends Hero{

	//private attribute
	private int blessing;

	/**
	 * Constructor for class Angel
	 * @param name
	 * @param weapon
	 */
	public Angel(String name, Weapon weapon) {
		super(name, weapon);
		super.setHp(100);
		this.blessing = 30;
	}

	/**
	 * returns blessing level
	 * @return int
	 */
	public int getBlessing() {
		return blessing;
	}

	/**
	 * sets blessing level
	 * to be accessed in this class and its inheriting classes
	 * @param blessing
	 */
	protected void setBlessing(int blessing) {
		this.blessing = blessing;
	}


	
	@Override
	public String toString() {
		
		String result = super.toString() + " \nPuissance de b�n�diction : " + blessing + ".";
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(!(obj instanceof Angel)) {
			return false;
		}
		
		Angel thing = (Angel) obj;
		
		if(super.equals(thing) && (this.blessing == thing.blessing)) {
			return true;
		}else {
			return false;
		}
		
	}


	@Override
	public void heal() {
		
		if(this.getInventory().containsKey(Item.HealingPotion)) {
			this.setHp(getHp() + 20);
		}else {
			this.setHp(getHp() + this.getBlessing());
			this.setBlessing(0);
		}
		
	}


	
}
