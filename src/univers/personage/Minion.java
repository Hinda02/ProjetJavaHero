package univers.personage;

import univers.tools.Weapon;

public class Minion extends Villain{
	
	/**
	 * Constructor of Minion class
	 * @param name
	 * @param weapon
	 * @param attackSpeed
	 */
	public Minion(String name, Weapon weapon, int attackSpeed) {
		super(name, weapon, attackSpeed);
	}

	/**
	 * Before a combat, the minion presents himself 
	 */
	public void speak() {
		System.out.println("Mon nom est "+ this.getName()+" !\nComment oses-tu mettre les pieds sur mon territoire !\nJe vais te punir à l'aide de mon arme, "+this.getWeapon());
	}
	
	

}
