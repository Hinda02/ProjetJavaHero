package univers.personage;

import univers.tools.Weapon;

public abstract class Personage implements Fighter, Killable{
	
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
	
	
	
	public void receiveDamage(int damage) {

		if(this.getHp() > 0) {
			
			this.setHp(getHp() - damage);
			
		}else {
			
			this.die();
		}
		
	}

}
