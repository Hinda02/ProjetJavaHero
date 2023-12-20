package univers.tools;

public class NonMagicalWeapon extends Weapon {
	
	private Material material;

	public NonMagicalWeapon(String name, WeaponType wType, Material material) {
		super(name, wType);
		this.material = material;
	}

	public Material getMaterial() {
		return material;
	}


}
