package univers.personage;

import univers.tools.Item;
import univers.tools.Weapon;

public class Angel extends Hero{

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
	
	/**
	 * heals the angel if the inventory contains healing power or by using the blessing capacity 
	 * it can be used only once
	 */
	@Override
	public void heal() {
		
		if(this.getInventory().containsKey(Item.HealingPotion)) {
			this.setHp(getHp() + 20);
		}else {
			this.setHp(getHp() + this.getBlessing());
			this.setBlessing(0);
		}
		
	}

	/**
	 * returns the Angel's info
	 */
	@Override
	public String toString() {
		
		String result = super.toString() + " \nPuissance de bénédiction : " + blessing + ".";
		
		return result;
	}
	
	/**
	 * compares two object of type Angel
	 * @param object to compare with 
	 * @return boolean 
	 */
	@Override
	public boolean equals(Object obj) {
		
		if(!(obj instanceof Angel)) {
			return false;
		}
		
		Angel angel = (Angel) obj;
		
		if(super.equals(angel) && (this.blessing == angel.blessing)) {
			return true;
		}else {
			return false;
		}
		
	}


	


	
}
