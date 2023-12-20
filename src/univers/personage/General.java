package univers.personage;

import univers.tools.Weapon;

public class General extends Villain{
	
	private Minion minion;

	public General(String name, Weapon weapon, int attackSpeed, Minion minion) {
		super(name, weapon, attackSpeed);
		this.minion = minion;
	}


	public Minion getMinion() {
		return minion;
	}


	public void setMinion(Minion minion) {
		this.minion = minion;
	}

	@Override
	public void speak() {
		
		if(this.getMinion().isAlive()) {
			
			System.out.println("coward");
			
		}else {
			
			System.out.println("how dare you");
			
		}
		
	}


}
