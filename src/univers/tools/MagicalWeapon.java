package univers.tools;

public class MagicalWeapon extends Weapon {
	
	private Attribute attribute;
	/**
	 * Constructor of MagicalWeapon class
	 * @param name
	 * @param wType
	 * @param attribute
	 */
	public MagicalWeapon(String name, WeaponType wType, Attribute attribute) {
		super(name, wType);
		this.attribute = attribute;
	}
	
	/**
	 * return's the weapon's attribute
	 * @return Attribute
	 */
	public Attribute getAttribute() {
		return attribute;
	}
	
	/**
	 * returns the weapon's info
	 */
	@Override
	public String toString() {
		String result = super.toString() + "\nC'est une arme magique dont l'attribut est " + attribute;
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
		if (!(obj instanceof MagicalWeapon))
			return false;
		MagicalWeapon mWeapon = (MagicalWeapon) obj;
		if (super.equals(mWeapon) && (this.attribute == mWeapon.attribute)) {
			return true;
		} else {
			return false;
		}
		
	}
	


}
