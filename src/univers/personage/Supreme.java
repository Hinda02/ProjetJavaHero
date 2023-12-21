package univers.personage;

import univers.tools.Attribute;
import univers.tools.MagicalWeapon;
import univers.tools.Weapon;

public class Supreme extends Villain {

	private Attribute attribute;
	
	/**
	 * Constructor of Supreme Villain class
	 * @param name
	 * @param weapon
	 * @param attackSpeed
	 * @param attribute
	 */
	public Supreme(String name, Weapon weapon, int attackSpeed, Attribute attribute) {
		super(name, weapon, attackSpeed);
		this.setAttribute(attribute);
	}
	
	/**
	 * returns the Supreme villain's attribute
	 * @return attribute
	 */
	public Attribute getAttribute() {
		return attribute;
	}
	
	/**
	 * modifies the supreme villain's attribute value
	 * @param attribute
	 */
	public void setAttribute(Attribute attribute) {
		this.attribute = attribute;
	}
	
	/**
	 * When encountering a supreme villain during a combat, they present themselves
	 */
	@Override
	public void speak() {
		System.out.println("Qui ose venir m'importuner ?\nSeul un grand aventurier serait capable de tenir tête face à moi, " + this.getName() + "\nPréparez-vous à mourir !");
		
	}
	
	/**
	 * Depending on the number of attack delivered, the supreme villain can display his special attack
	 * Beware of the supreme villain !
	 */
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
	
	/**
	 * returns a boolean that activate the special attack
	 * @return boolean
	 */
	public boolean specialAttack() {
		boolean res = false;
		
		if((this.getCptAttack() % 4 == 0) && (this.isAlive())) {
			res = true;
			//selon l'attribut et l'arme 
			//villain utilise blala attaque 
			//nom de l'attaque speciale
			//depend de l'attribut
			String spell = this.getName() + " utilise " ;
			if(this.getAttribute().equals(Attribute.Fire)) {
				spell += "Flamme " + this.weaponAttributeSA();
			}else if(this.getAttribute().equals(Attribute.Water)) {
				spell += "Vague " + this.weaponAttributeSA();
			}else if(this.getAttribute().equals(Attribute.Earth)) {
				spell += "Montagne " + this.weaponAttributeSA();
			}else {
				spell += "Tornade " + this.weaponAttributeSA();
			}
			System.out.println(spell);
		}
		return res;
	}
	
	/**
	 * Used in the special attack method
	 * Depending on the weapon's attribute, the name of the special attack differs
	 */
	public String weaponAttributeSA() {
		String spellAdjective = null ;
		if(this.getWeapon() instanceof MagicalWeapon) {
			if(((MagicalWeapon) this.getWeapon()).getAttribute().equals(Attribute.Fire)) {
				spellAdjective = "du purgatoire.";
			}else if(((MagicalWeapon) this.getWeapon()).getAttribute().equals(Attribute.Water)) {
				spellAdjective = "des abîmes";
			}else if(((MagicalWeapon) this.getWeapon()).getAttribute().equals(Attribute.Wind)) {
				spellAdjective = "céleste";
			}else {
				spellAdjective = "de sable.";
			}
			
	}else {
		spellAdjective = "destructrice !" ;
	}
		return spellAdjective;
	}
	
	
	/**
	 * returns the supreme villain's info
	 * @return String
	 */
	@Override
	public String toString() {
		String result =  super.toString() + "\nAttribut du méchant suprème : " + this.getAttribute();
		return result ;
	}
	
	/**
	 * compares two objects of class supreme
	 * @return boolean
	 */
	@Override
	public boolean equals(Object obj) {
		if(obj == this) {
			return true;
		}
		
		if (!(obj instanceof Supreme)) {
			return false;
		}
		
		Supreme supreme = (Supreme) obj;
		
		if(super.equals(supreme) && (this.attribute.equals(supreme.attribute)) ) {
			return true;
		}else {
			return false;
		}
	}


}
