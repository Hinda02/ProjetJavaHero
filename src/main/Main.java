package main;

import univers.tools.*;
import univers.personage.*;
import representation.*;
import univers.Familiar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

		public static List<WeaponType> nonMagicalWeapons = new ArrayList<WeaponType>();
	    
		public static List<WeaponType> magicalWeapons = new ArrayList<WeaponType>();
	    
		public static List<Material> nonMagicalWeaponsMaterial = new ArrayList<Material>();
	    
		public static List<Attribute> magicalWeaponsAttribute = new ArrayList<Attribute>();
	    
		public static List<Familiar> familiar = new ArrayList<Familiar>();
	    
		// player 
		public static Scanner myObj = new Scanner(System.in);
		
		public static String choice;
		public static String nom;
		public static int weaponT;
		public static Hero player = null;
		public static String weaponN;
		public static int weaponM;
		public static int familiarP;
		public static int attribute;
		public static String playerType;

			
	public static void main(String[] args) {
		
		//List 

		nonMagicalWeapons.add(WeaponType.Axe);
		nonMagicalWeapons.add(WeaponType.Bow);
		nonMagicalWeapons.add(WeaponType.Spear);
		nonMagicalWeapons.add(WeaponType.Sword);
		
		magicalWeapons.add(WeaponType.EvilEye);
		magicalWeapons.add(WeaponType.Harp);
		magicalWeapons.add(WeaponType.Orb);
		
		nonMagicalWeaponsMaterial.add(Material.Bronze);
		nonMagicalWeaponsMaterial.add(Material.Gold);
		nonMagicalWeaponsMaterial.add(Material.Iron);
		nonMagicalWeaponsMaterial.add(Material.Silver);
		
		magicalWeaponsAttribute.add(Attribute.Earth);
		magicalWeaponsAttribute.add(Attribute.Fire);
		magicalWeaponsAttribute.add(Attribute.Water);
		magicalWeaponsAttribute.add(Attribute.Wind);
		
		familiar.add(Familiar.Dragon);
		familiar.add(Familiar.FoxSpirit);
		familiar.add(Familiar.Merfolk);
		familiar.add(Familiar.Phoenix);
		familiar.add(Familiar.Serpent);
		
		
		
		    
		
		System.out.println("Choisis ton personnage parmis: (Saisissez une des classes suivantes)");
		System.out.println("Humain _ Mage _ Ange _ Demon");

		//get player input
	    choice = myObj.next(); 
	    
		System.out.println("Personnalise ton personnage:");
		System.out.println("Nom:");
		
		//get player input
		nom = myObj.next();
		
		
		
		//Create player object
	    switch(choice) {
	    
		    case "Humain":
		    	
		    	WeaponType wT = nonMagicalWeapons();
		    	String wN = weaponName();
		    	Material wM = nonMagicalWeaponMaterial();
				NonMagicalWeapon w = new NonMagicalWeapon(wN, wT, wM);
				Familiar fam = familiar();
				
		    	player = new Human(nom, w, fam);
		    	
		    	break;
		    	
		   /* case "Mage":
		    	
		    	
		    	player = new Mage(nom, w, familiarPlayer);
		    	break;
		    	
		    case "Ange":
		    	//player = new Angel(nom, w);
		    	break;
		    	
		    case "Demon":
		    	//player = new Demon(nom, w);
		    	break;
		    	
		    default:
		    	//player = new Human(nom, w, familiarPlayer);
		    	break;*/
	    }
		
	    
		Game game = new Game(player, choice);
				
	}
	
	public static  WeaponType nonMagicalWeapons(){
		System.out.println("Choisis ton arme: (Saisissez le numéro de l'arme)");
    	
		int i = 0;
		for(WeaponType item : nonMagicalWeapons) {
			i++;
			System.out.println(i + ": " + item.toString());
		}
		
		weaponT = myObj.nextInt(); 
		WeaponType wT = nonMagicalWeapons.get(weaponT-1);
		
		return wT;
		
	}
	
	public static  WeaponType magicalWeapons(){
		System.out.println("Choisis ton arme: (Saisissez le numéro de l'arme)");
    	
		int i = 0;
		for(WeaponType item : magicalWeapons) {
			i++;
			System.out.println(i + ": " + item.toString());
		}
		
		weaponT = myObj.nextInt(); 
		WeaponType wT = magicalWeapons.get(weaponT-1);
		
		return wT;
		
	}
	
	public static String weaponName() {
		System.out.println("Choisis le nom de ton arme:");
		weaponN = myObj.next();
		
		return weaponN;
		
	}
	
	public static Material nonMagicalWeaponMaterial() {
		System.out.println("Choisis le matériel de ton arme: (Saisissez le numéro du matériel de l'arme)");
		int j = 0;
		for(Material item : nonMagicalWeaponsMaterial) {
			j++;
			System.out.println(j + ": " + item.toString());
		}
		weaponM = myObj.nextInt();
		Material wM = nonMagicalWeaponsMaterial.get(weaponM-1);
		return wM;
	}
	
	public static Attribute magicalWeaponAttribute() {
		System.out.println("Choisis l'attribut de ton arme: (Saisissez le numéro du matériel de l'arme)");
		int j = 0;
		for(Attribute item : magicalWeaponsAttribute) {
			j++;
			System.out.println(j + ": " + item.toString());
		}
		attribute = myObj.nextInt();
		Attribute wA = magicalWeaponsAttribute.get(attribute-1);
		return wA;
	}
	
	public static Familiar familiar() {
		System.out.println("Choisis ton familier : ");
		
		int k = 0;
		for(Familiar item : familiar) {
			k++;
			System.out.println(k + ": " + item.toString());
		}
		
		familiarP = myObj.nextInt();
		Familiar familiarPlayer = familiar.get(familiarP-1);
		return familiarPlayer;
	}
	
	
}


