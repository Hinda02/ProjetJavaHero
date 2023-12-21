package univers.personage;

import java.util.HashMap;
import univers.tools.Item;
import univers.tools.Weapon;

public abstract class Hero extends Personage {
	
	private HashMap<Item, Integer> inventory = new HashMap<Item, Integer>();//<Item, quantity>
	
	/**
	 * Constructor of Hero class
	 * @param name
	 * @param weapon
	 */
	public Hero(String name, Weapon weapon) {
		super(name, weapon);
		this.inventory.put(Item.Papyrus, 1);
	}

	/**
	 * returns Hero's inventory
	 * @return HashMap<Item,Quantity>
	 */
	public HashMap<Item, Integer> getInventory() {
		return inventory;
	}
	
	/**
	 * deducts damage points from the opponent's hp level
	 */
	@Override
	public void fight(Personage opponent) {
		
		if(this.isAlive()) {
			
			opponent.receiveDamage(this.getWeapon().getPower());
		}
		
	}
	
	/**
	 * heals the hero when the inventory contains an healing potion 
	 */
	@Override
	public void heal() {
		
		if(this.getInventory().containsKey(Item.HealingPotion) && (this.isAlive())) {
			this.setHp(getHp() + 20);
			System.out.println("healing +20 pts");
		}
		
	}
	
	/**
	 * returns the hero's info
	 * @return String
	 */
	@Override
	public String toString() {
		
		String result = super.toString() + "\nEléments dans inventaire = ";
		for (Item name: inventory.keySet()) {
            String key = inventory.toString();
            String value = inventory.get(name).toString();
            result += "\n" + key + "  , quantité  : " + value;
        }
		return result;
	}
	
	/**
	 * compares two objects of type Hero
	 * @return boolean
	 */
	@Override
	public boolean equals(Object obj) {
		if(obj == this) {
			return true;
		}
		
		if (!(obj instanceof Hero)) {
			return false;
		}
		
		Hero hero = (Hero) obj;
		
		if(super.equals(hero) && (this.inventory.equals(hero.inventory))) {
			return true;
		}else {
			return false;
		}
	}
	
}
