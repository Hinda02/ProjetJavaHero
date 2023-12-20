package univers.tools;

public class MagicalWeapon extends Weapon {
	
	private Attribute attribute;

	public MagicalWeapon(String name, WeaponType wType, Attribute attribute) {
		super(name, wType);
		this.attribute = attribute;
	}

	public Attribute getAttribute() {
		return attribute;
	}


}
