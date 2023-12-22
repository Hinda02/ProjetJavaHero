package univers.tools;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MagicalWeaponTest {

	@Test
    public void toString_magicalWeapon_returnsDescription() {
		
        MagicalWeapon magicalWeapon = new MagicalWeapon("Susanoo", WeaponType.Sword, Attribute.Wind);
        assertEquals("Susanoo", magicalWeapon.getName());
        assertEquals(10, magicalWeapon.getPower());
        magicalWeapon.setPower(20);
        assertEquals(20, magicalWeapon.getPower());
        assertEquals(Attribute.Wind, magicalWeapon.getAttribute());
        assertEquals("Susanoo est une arme de type Sword et dont la puissance est de 20.\nC'est une arme magique dont l'attribut est Wind", magicalWeapon.toString());
    
	}
	
	
	@Test
    public void testEquals() {
        MagicalWeapon magicalWeapon1 = new MagicalWeapon("Susanoo", WeaponType.Sword, Attribute.Wind);
        MagicalWeapon magicalWeapon2 = new MagicalWeapon("Susanoo", WeaponType.Sword, Attribute.Wind);
        MagicalWeapon magicalWeapon3 = new MagicalWeapon("Susanoo", WeaponType.Sword, Attribute.Fire);
        MagicalWeapon magicalWeapon4 = new MagicalWeapon("Amaterasu", WeaponType.Orb, Attribute.Fire);
        
        assertTrue(magicalWeapon1.equals(magicalWeapon2));
        assertFalse(magicalWeapon1.equals(magicalWeapon3));
        assertFalse(magicalWeapon1.equals(magicalWeapon4));
    }
	
	

}
