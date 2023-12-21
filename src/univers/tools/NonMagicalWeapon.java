package univers.tools;

public class NonMagicalWeapon extends Weapon {
	
	private Material material;
	
	/**
	 * Constructor of the non magical weapon class
	 * @param name
	 * @param weapon Type
	 * @param material
	 */
	public NonMagicalWeapon(String name, WeaponType wType, Material material) {
		super(name, wType);
		this.material = material;
	}
	
	/**
	 * returns the non magical weapon's material 
	 * @return material
	 */
	public Material getMaterial() {
		return material;
	}
	
	/**
	 * returns the non magical weapon's info
	 */
	@Override
	public String toString() {
		String result = super.toString() + "\nC'est une arme faite en " + material;
		return result;
	}

	/**
	 * compares two objects of class non magical weapon's
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof NonMagicalWeapon))
			return false;
		NonMagicalWeapon weapon = (NonMagicalWeapon) obj;
		if (super.equals(weapon) && (this.material == weapon.material)) {
			return true;
		} else {
			return false;
		}
		
	}


}
