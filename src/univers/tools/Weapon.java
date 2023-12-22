package univers.tools;

import java.io.Serializable;

public abstract class Weapon implements Serializable {

	private String name;
	private int power;
	private WeaponType wType;
	
	/**
	 * Constructor of Weapon Class
	 * Every weapon has the same power : 10
	 * @param name
	 * @param wType
	 */
	public Weapon(String name, WeaponType wType) {
		super();
		this.name = name;
		this.power = 10;
		this.wType = wType;
	}
	
	/**
	 * returns the weapon's name
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * returns the weapon's power level
	 * @return power
	 */
	public int getPower() {
		return power;
	}
	
	/**
	 * modifies the weapon's power level to the value put  in entry
	 * @param power
	 */
	public void setPower(int power) {
		this.power = power;
	}
	
	/**
	 * returns the weapon's info
	 */
	@Override
	public String toString() {
		String result = this.name + " est une arme de type " + this.wType + " et dont la puissance est de " + this.power + ".";
		return result;
	}

	/**
	 * compares two objects of class weapon
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Weapon))
			return false;
		Weapon weapon = (Weapon) obj;
		if ((this.name == weapon.name) && (this.power == weapon.power) && (this.wType == weapon.wType)) {
			return true;
		} else {
			return false;
		}
		
	}
	
	

	
	
}
