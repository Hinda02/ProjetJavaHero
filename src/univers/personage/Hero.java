package univers.personage;

import java.util.HashMap;

import univers.tools.Item;
import univers.tools.Weapon;

public abstract class Hero extends Personage {
	
	private HashMap<Item, Integer> inventory = new HashMap<Item, Integer>();//<Item, quantity>

	public Hero(String name, Weapon weapon) {
		super(name, weapon);
		this.inventory.put(Item.Papyrus, 1);
	}

	
	public HashMap<Item, Integer> getInventory() {
		return inventory;
	}
	
	@Override
	public void fight(Personage opponent) {
		
		if(this.isAlive()) {
			
			opponent.receiveDamage(this.getWeapon().getPower());
		}
		
	}
	
	@Override
	public void heal() {
		
		if(this.getInventory().containsKey(Item.HealingPotion) && (this.isAlive())) {
			this.setHp(getHp() + 20);
			System.out.println("healing +20 pts");
		}
		
	}

}
