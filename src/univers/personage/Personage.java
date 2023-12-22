package univers.personage;

import java.io.Serializable;

import univers.tools.Weapon;

public abstract class Personage implements Fighter, Killable, Serializable{
	
	private String name;
	private int hp;
	private Weapon weapon;
	private boolean alive = true;
	
	public Personage(String name, Weapon weapon) {
		this.name = name;
		this.hp = 100;
		this.weapon = weapon;
	}
	
	public boolean isAlive() {
		return alive;
	}

	/**
	 * returns personage's name
	 * @return String
	 */
	public String getName() {
		return name;
	}

	/**
	 * returns personage's hp level
	 * @return int
	 */
	public int getHp() {
		return hp;
	}

	/**
	 * modifies a personage's hp level
	 */
	public void setHp(int hp) {
		this.hp = hp;
	}


	/**
	 * returns personage's weapon of choice
	 * @return Weapon
	 */
	public Weapon getWeapon() {
		return weapon;
	}

	/**
	 * sets alive attribute to false
	 */
	public void die() {
		
		this.alive = false;
		
	}
	
	/**
	 * abstract method that deducts damage points from the opponent's hp level
	 */
	public abstract void fight(Personage opponent);
	
	/**
	 * abstract method that heals the personage
	 */
	public abstract void heal();
	
	
	/**
	 * deducts hp points depending of the enemy's attack
	 */
	public void receiveDamage(int damage) {

		if(this.getHp() > 0) {
			
			this.setHp(getHp() - damage);
			
		}else {
			
			this.die();
		}
		
	}
	

	/**
	 * returns the personage's info
	 * @return String
	 */
	@Override
	public String toString() {

		String result = name + " est ";
		
		if(alive) {
			result += "en vie.\n";
		}else {
			result += "mort.\n";
		}
		
		result += "Points de vie: " + hp  + ". \nArme équipée: " + weapon + ".";
		
		return result;
		
	}
	
	/**
	 * compares two objects of type Personage
	 * @return boolean
	 */
	@Override
	public boolean equals(Object obj) {
		if(obj == this) {
			return true;
		}
		
		if (!(obj instanceof Personage)) {
			return false;
		}
		
		Personage personage = (Personage) obj;
		
		if((this.name == personage.name) && (this.alive == personage.alive) && (this.hp == personage.hp) && (this.weapon.equals(personage.weapon))) {
			return true;
		}else {
			return false;
		}
	}

}
