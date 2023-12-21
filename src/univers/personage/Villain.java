package univers.personage;


import univers.tools.Weapon;

public abstract class Villain extends Personage{
	
	private int attackSpeed;
	private int cptAttack = 0;
	
	/**
	 * Constructor of class Villain
	 * @param name
	 * @param weapon
	 * @param attackSpeed
	 */
	public Villain(String name, Weapon weapon, int attackSpeed) {
		super(name, weapon);
		this.setAttackSpeed(attackSpeed);
	}
	
	/**
	 * returns villain's attack Speed	 
	 * @return int
	 */
	public int getAttackSpeed() {
		return attackSpeed;
	}
	

	/**
	 * modifies a villain's attack speed
	 */
	public void setAttackSpeed(int attackSpeed) {
		this.attackSpeed = attackSpeed;
	}
	
	/**
	 * returns villain's attack number 	 
	 * used for the healing
	 * @return int
	 */
	public int getCptAttack() {
		return cptAttack;
	}
	
	/**
	 * modifies a villain's attack number
	 */
	public void setCptAttack(int cptAttack) {
		this.cptAttack = cptAttack;
	}
	
	/**
	 * before attacking, the villain announces himself
	 */
	public abstract void speak();
	
	
	@Override
	public void fight(Personage opponent) {
		
		if(this.isAlive()) {
			
			opponent.receiveDamage(this.getWeapon().getPower());
			this.setCptAttack(this.getCptAttack() + 1);
			this.heal();
		}
		
	}
	
	/**
	 * Every 4 attacks, the villain heals himself by 10 point 
	 */
	@Override
	public void heal() {
		
		if((this.getCptAttack() % 4 == 0) && (this.isAlive())) {
			this.setHp(getHp()+ 10);
		}
		
	}
	
	/**
	 * returns the villain's info
	 * @return String
	 */
	@Override
	public String toString() {
		String result =  super.toString() + "\nVitesse d'attaque : " + attackSpeed +"\nNombres d'attaques réalisées : " + cptAttack ;
		return result ;
	}
	
	/**
	 * compares two objects of type villain
	 * @return boolean
	 */
	@Override
	public boolean equals(Object obj) {
		if(obj == this) {
			return true;
		}
		
		if (!(obj instanceof Villain)) {
			return false;
		}
		
		Villain villain = (Villain) obj;
		
		if(super.equals(villain) && (this.attackSpeed == villain.attackSpeed) && (this.cptAttack == villain.cptAttack)) {
			return true;
		}else {
			return false;
		}
	}
	
	

}
