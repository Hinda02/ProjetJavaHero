package univers.personage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import univers.tools.Attribute;
import univers.tools.MagicalWeapon;
import univers.Familiar;
import univers.tools.Material;
import univers.tools.NonMagicalWeapon;
import univers.tools.WeaponType;

public class HumanTest {

    @Test
    public void testFight_twoOpponentsFight_DiminishTheHpOfTheOpponent() {
    	
        NonMagicalWeapon weapon = new NonMagicalWeapon("Benizakura", WeaponType.Sword, Material.Iron); //power = 10
        Familiar familiar = Familiar.Dragon ; // power = 15
        Human human = new Human("Erza", weapon, familiar); //hp = 100 
        MagicalWeapon mWeapon = new MagicalWeapon("Utahime", WeaponType.Harp, Attribute.Wind); //power = 10
        Villain opponent = new Minion("Urahara", mWeapon, 5); //hp = 100

        human.fight(opponent);

        assertEquals(opponent.getHp(), 75);
    }

    @Test
    public void testToString() {
    	
    	NonMagicalWeapon weapon = new NonMagicalWeapon("Benizakura", WeaponType.Sword, Material.Iron);
    	Familiar familiar = Familiar.Dragon ;
    	Human human = new Human("Erza", weapon, familiar);

        String expected = "Erza est en vie.\nPoints de vie: 100. "
        		+ "\nArme équipée: Benizakura est une arme de type Sword et dont la puissance est de 10."
        		+ "\nC'est une arme faite en Iron."
        		+ "\nEléments dans inventaire = "
        		+ "\nPapyrus, quantité  : 1"
        		+ "\nVotre familier : Dragon est un familier dont le niveau de puissance est de : 15";
       
        assertEquals(human.toString(), expected);
    }

    @Test
    public void testEquals() {
    	NonMagicalWeapon weapon1 = new NonMagicalWeapon("Benizakura", WeaponType.Sword, Material.Iron);
    	Familiar familiar1 = Familiar.Dragon ;
    	Human human1 = new Human("Erza", weapon1, familiar1);

    	NonMagicalWeapon weapon2 = new NonMagicalWeapon("Benizakura", WeaponType.Sword, Material.Iron);
    	Familiar familiar2 = Familiar.Dragon ;
    	Human human2 = new Human("Erza", weapon2, familiar2);
    	
    	NonMagicalWeapon weapon3 = new NonMagicalWeapon("Benizakura", WeaponType.Sword, Material.Gold);
    	Familiar familiar3 = Familiar.Dragon ;
    	Human human3 = new Human("Rukia", weapon3, familiar3);
    	
    	NonMagicalWeapon weapon4 = new NonMagicalWeapon("Sode no Shirayuki", WeaponType.Spear, Material.Gold);
    	Familiar familiar4 = Familiar.Serpent ;
    	Human human4 = new Human("Rukia", weapon4, familiar4);
    	
        assertTrue(human1.equals(human2));
        assertFalse(human1.equals(human3));
        assertFalse(human1.equals(human4));
    }
}
