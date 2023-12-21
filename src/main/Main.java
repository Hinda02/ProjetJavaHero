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
		public static String choix;

			
	public static void main(String[] args) {
		
		//Lists

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
		
		
		//Intro to Story 
		
		System.out.println("Zeus a perdu son éclair divin ! Il est sûr que quelqu'un l'a volé pour \nréaliser de mauvais desseins. Il promet d'exaucer le voeu de celui ou celle qui le lui rendra.");
		System.out.println("Vous décidez d'accepter cette quête. ");
		
		
		    
		//Player's class
		System.out.println("Choisis ton personnage parmis: (Saisissez une des classes suivantes)");
		System.out.println("Humain _ Mage _ Ange _ Demon");

		//get player input
	    choice = myObj.next().toLowerCase(); 
	    
		System.out.println("Personnalise ton personnage:");
		System.out.println("Nom:");
		
		//get player input
		nom = myObj.next();
		
		
		
		//Create player object
	    switch(choice) {
	    
		    case "humain":
		    	WeaponType wTHuman = nonMagicalWeapons();
		    	String wN = weaponName();
		    	Material wM = nonMagicalWeaponMaterial();
				NonMagicalWeapon w = new NonMagicalWeapon(wN, wTHuman, wM);
				Familiar fam = familiar();
				
		    	player = new Human(nom, w, fam);
		    	
		    	break;
		    	
		   case "mage":
		    	WeaponType wTMage = magicalWeapons();
		    	String wNMage = weaponName();
		    	Attribute wAMage = magicalWeaponAttribute();
				MagicalWeapon mageWeapon = new MagicalWeapon(wNMage, wTMage, wAMage);
				Familiar mageFam = familiar();
				
		    	player = new Mage(nom, mageWeapon, mageFam);
		    	break;
		    	
		    case "ange":
		    	System.out.println("Souhaitez-vous utiliser une arme magique ou nm (Saisissez m ou nm)");
		    	choix = myObj.next();
		    	WeaponType wTAngel = null;
		    	String wNAngel = null;
		    	Weapon angelWeapon = null;
		    	
		    	if(choix.equals("m")) {
		    		wTAngel = magicalWeapons();
		    		Attribute wAAngel = magicalWeaponAttribute();
		    		wNAngel = weaponName();
		    		angelWeapon = new MagicalWeapon(wNAngel, wTAngel, wAAngel);
		    		
		    	}else if (choix.equals("nm")){
		    		wTAngel = nonMagicalWeapons();
		    		Material wMAngel = nonMagicalWeaponMaterial();
		    		wNAngel = weaponName();
		    		angelWeapon = new NonMagicalWeapon(wNAngel, wTAngel, wMAngel);
		    		
		    	}
		    	
				
		    	player = new Angel(nom, angelWeapon);
		    	
		    	break;
		    	
		    case "demon":
		    	
		    	System.out.println("Souhaitez-vous utiliser une arme magique ou nm (Saisissez m ou nm)");
		    	choix = myObj.next();
		    	WeaponType wTDemon = null;
		    	String wNDemon = null;
		    	Weapon demonWeapon = null;
		    	
		    	if(choix.equals("m")) {
		    		wTDemon = magicalWeapons();
		    		Attribute wADemon = magicalWeaponAttribute();
		    		wNDemon = weaponName();
		    		demonWeapon = new MagicalWeapon(wNDemon, wTDemon, wADemon);
		    		
		    	}else if (choix.equals("nm")){
		    		wTDemon = nonMagicalWeapons();
		    		Material wMDemon = nonMagicalWeaponMaterial();
		    		wNDemon = weaponName();
		    		demonWeapon = new NonMagicalWeapon(wNDemon, wTDemon, wMDemon);
		    		
		    	}
				
		    	player = new Demon(nom, demonWeapon);
		    	
		    	break;
		    	
		    default:
		    	WeaponType wTDefault = nonMagicalWeapons();
		    	String wNameD = weaponName();
		    	Material wD = nonMagicalWeaponMaterial();
				NonMagicalWeapon wDefault = new NonMagicalWeapon(wNameD, wTDefault , wD);
				Familiar famDefault = familiar();
				
		    	player = new Human(nom, wDefault, famDefault);
		    	break;
	    }
		
	    
		Game game = new Game(player, choice);
				
	}
	
	/**
	 * used to customize the player's weapon (only for classes that can't wield magical weapons)
	 */
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
	
	/**
	 * used to customize the player's weapon (only for classes that can wield magical weapons)
	 */
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
	
	/**
	 * used to customize the player's weapon's name 
	 */
	public static String weaponName() {
		System.out.println("Choisis le nom de ton arme:");
		weaponN = myObj.next();
		
		return weaponN;
		
	}
	
	/**
	 * used to customize the player's weapon's material (only for classes that can't wield magical weapons)
	 */
	public static Material nonMagicalWeaponMaterial() {
		System.out.println("Choisis ton arme: (Saisissez le numéro de l'arme)");
		int j = 0;
		for(Material item : nonMagicalWeaponsMaterial) {
			j++;
			System.out.println(j + ": " + item.toString());
		}
		weaponM = myObj.nextInt();
		Material wM = nonMagicalWeaponsMaterial.get(weaponM-1);
		return wM;
	}
	
	/**
	 * used to customize the player's weapon's attribute (only for classes that can wield magical weapons)
	 */
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
	
	/**
	 * used to customize the player's familiar (only for humans and mages)
	 */
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


