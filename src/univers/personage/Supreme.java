package univers.personage;

import univers.tools.Attribute;
import univers.tools.Weapon;

public class Supreme extends Villain {

	private Attribute attribute;
	
	public Supreme(String name, Weapon weapon, int attackSpeed, Attribute attribute) {
		super(name, weapon, attackSpeed);
		this.setAttribute(attribute);
	}

	public Attribute getAttribute() {
		return attribute;
	}

	public void setAttribute(Attribute attribute) {
		this.attribute = attribute;
	}

	@Override
	public void speak() {
		System.out.println("too strong for this");
		
	}
	
	@Override
	public void fight(Personage opponent) {
		
		if(this.isAlive()) {
			
			this.setCptAttack(this.getCptAttack() + 1);
			this.heal();
			if(this.specialAttack()) {
				opponent.receiveDamage(this.getWeapon().getPower() + 20);
			}else {
				opponent.receiveDamage(this.getWeapon().getPower());
			}
		}
		
	}
	
	public boolean specialAttack() {
		boolean res = false;
		
		if((this.getCptAttack() % 4 == 0) && (this.isAlive())) {
			res = true;
			System.out.println("blabla uses blabla attack (use to string method)");
		}
		return res;
	}

}
