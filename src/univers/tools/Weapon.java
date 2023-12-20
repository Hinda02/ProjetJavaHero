package univers.tools;

public abstract class Weapon {

	private String name;
	private int power;
	private WeaponType wType;
	
	public Weapon(String name, WeaponType wType) {
		super();
		this.name = name;
		this.power = 10;
		this.wType = wType;
	}

	public String getName() {
		return name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}
	
	//equals
	//tostring
	
}
