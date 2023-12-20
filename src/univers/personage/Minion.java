package univers.personage;

import univers.tools.Weapon;

public class Minion extends Villain{
	

	public Minion(String name, Weapon weapon, int attackSpeed) {
		super(name, weapon, attackSpeed);
	}


	public void speak() {
		System.out.println("pour Tiana");
		
	}


	

}
