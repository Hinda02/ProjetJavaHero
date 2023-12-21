package univers.personage;

import univers.tools.MagicalWeapon;
import univers.tools.Weapon;

public class General extends Villain{
	
	private Minion minion;
	
	/**
	 * Constructor of General class
	 * @param name
	 * @param weapon
	 * @param attackSpeed
	 * @param minion
	 */
	public General(String name, Weapon weapon, int attackSpeed, Minion minion) {
		super(name, weapon, attackSpeed);
		this.minion = minion;
	}

	/**
	 * returns the minion under this general's command
	 * @return Minion
	 */
	public Minion getMinion() {
		return minion;
	}

	/**
	 * modifies this general's minion with the value put in entry
	 * @param minion
	 */
	public void setMinion(Minion minion) {
		this.minion = minion;
	}
	
	/**
	 * The general presents himself before attacking 
	 * Depending of the fact that his minion is defeated or not 
	 * he says something different 
	 */
	@Override
	public void speak() {
		System.out.println("Je suis "+ this.getName());
		if(this.getMinion().isAlive()) {
			if(this.getWeapon() instanceof MagicalWeapon) {
				System.out.println("Approche que je te fasse disparaître de ce monde à l'aide de mon arme magique, " + this.getWeapon().getName());
			}
				System.out.println("Approche que je te fasse mordre la poussière avec mon arme, " + this.getWeapon().getName());

		}else {
			
			System.out.println("Comment oses-tu t'en prendre à mon subordonné, " + this.getMinion().getName() +"\nJe promets de le venger !\nPrends garde à toi !");
		}
		
	}
	
	/**
	 * returns the general's info
	 * @return String
	 */
	@Override
	public String toString() {
		String result =  super.toString() + "\nSubordonné : " + this.minion.toString() ;
		return result ;
	}
	
	/**
	 * compares two objects of type general
	 * @return boolean
	 */
	@Override
	public boolean equals(Object obj) {
		if(obj == this) {
			return true;
		}
		
		if (!(obj instanceof General)) {
			return false;
		}
		
		General general = (General) obj;
		
		if(super.equals(general) && (this.minion.equals(general.minion)) ) {
			return true;
		}else {
			return false;
		}
	}


}
