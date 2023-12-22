package univers;

import java.io.Serializable;

import univers.personage.Fighter;
import univers.personage.Personage;

public enum Familiar implements Fighter, Serializable{
	
	Dragon(15), FoxSpirit(12), Merfolk(10),Phoenix(11), Serpent(9);

    private final int power;

    private Familiar(int power) {
        this.power = power;
    }

    public int getPower(){
        return this.power;
    }

    /**
     *returns a familiar's characteristics (name + power)
     */
    @Override
	public String toString() {
	    String result = this.name() + " est un familier dont le niveau de puissance est de : " + this.power ;
	    return result;
	}
    
    
	@Override
	public void fight(Personage opponent) {
		opponent.receiveDamage(this.getPower());
		
	}

}
