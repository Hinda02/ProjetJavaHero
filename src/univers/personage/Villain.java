package univers.personage;

import univers.tools.Item;
import univers.tools.Weapon;

public abstract class Villain extends Personage{
	
	private int attackSpeed;
	private int cptAttack = 0;

	

	public Villain(String name, Weapon weapon, int attackSpeed) {
		super(name, weapon);
		this.setAttackSpeed(attackSpeed);
	}
	public int getAttackSpeed() {
		return attackSpeed;
	}

	public void setAttackSpeed(int attackSpeed) {
		this.attackSpeed = attackSpeed;
	}
	
	public int getCptAttack() {
		return cptAttack;
	}

	public void setCptAttack(int cptAttack) {
		this.cptAttack = cptAttack;
	}
	public abstract void speak();
	
	@Override
	public void fight(Personage opponent) {
		
		if(this.isAlive()) {
			
			opponent.receiveDamage(this.getWeapon().getPower());
			this.setCptAttack(this.getCptAttack() + 1);
			this.heal();
		}
		
	}
	
	@Override
	public void heal() {
		
		if((this.getCptAttack() % 4 == 0) && (this.isAlive())) {
			this.setHp(getHp()+ 10);
		}
		
	}

	

}
