package main;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import representation.ChanceNode;
import representation.DecisionNode;
import representation.Event;
import representation.ImageNode;
import representation.InnerNode;
import representation.SoundNode;
import representation.TerminalNode;
import univers.Familiar;
import univers.personage.General;
import univers.personage.Hero;
import univers.personage.Human;
import univers.personage.Minion;
import univers.personage.Supreme;
import univers.personage.Villain;
import univers.tools.Attribute;
import univers.tools.Item;
import univers.tools.MagicalWeapon;
import univers.tools.Material;
import univers.tools.NonMagicalWeapon;
import univers.tools.Weapon;
import univers.tools.WeaponType;

public class Game {
	public Game(Hero gamer, String playerType) {
		
		Scanner myObj = new Scanner(System.in);
		Hero player = gamer;
		
		//Villains
		
		Weapon cerberusW = new MagicalWeapon("cerberus' evil eye", WeaponType.EvilEye, Attribute.Earth); 
		Villain cerberus = new Minion("cerberus", cerberusW, 7);
		Weapon charonW = new NonMagicalWeapon("charon's axe", WeaponType.Axe, Material.Iron);
		Villain charon = new General("charon", charonW, 10, (Minion) cerberus);
		Weapon hadesW = new MagicalWeapon("hades' orb", WeaponType.Orb, Attribute.Fire);
		Villain hades= new Supreme("hades", hadesW, 12, Attribute.Fire);
		
		
		
		
		//Human nodes

		Event node16 = new TerminalNode(16, "Vous avez bien combattu ! Malheureusement, vous n'êtes pas de taille face au roi des Enfers...");
		Event sn16 = new SoundNode(node16, "die.wav");
		
		Event node15 = new TerminalNode(15, "Vous obtenez l'éclair de Zeus.");
		Event sn15 = new SoundNode(node15, "win.wav");
		
		Event node14 = new InnerNode(14, "Admirative de votre bravoure, Perséphonne décide de vous céder gratuitement l'éclair divin.", Arrays.asList(node15));
		Event sn14 = new SoundNode(node14, "win.wav");
	    
	    Event node12 = new InnerNode(12, "Vous décidez de combattre Hades.", Arrays.asList(sn15, sn16) );
	    Event sn12 = new SoundNode(node12, "sword.wav");
		
		Event node10 = new ChanceNode(10, "Hadès se tient face à vous.", Arrays.asList(sn14, sn12));
		//Event sn10 = new SoundNode(node10, "");
		
		Event node5 = new TerminalNode(5, "Votre diversion était parfaite. Malheureusement, vous \ntrébuchez sur une pierre et Cerberus vous attrape! Partie perdue!");
		Event sn5 = new SoundNode(node5, "die.wav");
		
		Event node13 = new TerminalNode(13, "Charon vous tue ! \nC'est la fin ! ");
		Event sn13 = new SoundNode(node13, "die.wav");
	    
	    Event node4 = new InnerNode(4, "En avançant plus profondément, vous vous retrouvez face à Charon.", Arrays.asList(node10, sn13));
	    Event sn4 = new SoundNode(node4, "sword.wav");
	    
	    Event node9 = new InnerNode(9, "En offrant l'obole obtenue lors du précédent combat à Charon, vous parvenez à traverser le Styx. ", Arrays.asList(node10, sn4));
	    Event sn9 = new SoundNode(node9, "heal.wav");
	    
	    Event node6 = new InnerNode(6, "Vous avez gagné le combat ! \nCerberus laisse tomber derrière lui un artéfact qui pourrait vous aider pour la suite. \nSaisissez le nom de cet objet pour l'obtenir : ", Arrays.asList(sn9, sn4));
	    Event sn6 = new SoundNode(node6, "win.wav");
	    sn6 = new ImageNode(node6, "cerberus.png");
	    
	    Event node7 = new TerminalNode(7, "Cerberus vous a battu! :(");
	    Event sn7 = new SoundNode(node7, "die.wav");
	    
	    Event node2 = new ChanceNode(2, "Vous décidez de faire diversion", Arrays.asList(sn4, sn5));
	    //Event sn2 = new SoundNode(node2, "");
	    
	    Event node3 = new InnerNode(3, "Vous décidez de combattre Cerberus", Arrays.asList(sn6, sn7));
	    Event sn3 = new SoundNode(node3, "sword.wav");
	    //sn3 = new ImageNode(node3, "cerberus.png");
	    
	    Event node1 = new DecisionNode(1, "Vous vous retrouvez devant la tanière de Cerberus, que \nsouhaitez vous faire ? Le combattre ou Faire diversion ?", Arrays.asList(node2, sn3));
	    //Event sn1 = new SoundNode(node1, "");
	    
	    
	    //Mage nodes
	    
	    
	    
	    
	    
	    Event currentNode = null;
		
	    
	    
		switch(playerType) {
			    
			case "Humain":
				System.out.println("Vos recherches vous amènent jusqu'aux Enfers, le territoire d'Hades. \nPour entrer il vous faudra passer les serviteurs du roi des Enfers, notamment : \nCerberus et Charon. La première étape est Cerberus");
		    	currentNode = node1;
		    	break;
		    	
			case "Mage":
			   System.out.println("Vos recherches vous amènent jusqu'à l'Olympe, le territoire des Dieux. \nUn des Olympiens (Dieux siègeant à l'Olympe) serait le coupable de ce vol...\nMais qui ?");
			   currentNode = node1;
			   break;
		
		/*case "Ange":
			//player = new Angel(nom, w);
			break;
			
		case "Demon":
			//player = new Demon(nom, w);
			break;*/
			
		   default:
			   System.out.println("Vos recherches vous amènent jusqu'aux Enfers, le territoire d'Hades. \nPour entrer il vous faudra passer les serviteurs du roi des Enfers, notamment : \nCerberus et Charon. La première étape est Cerberus");
			   currentNode = node1;
			   break;
	    	
		}
		
		
	    
	    
	  //Display player data
	    System.out.println(player.toString()); 
	    

	    
	   //Main Code (Game)
	    
	    System.out.println();
	    currentNode.display();
	    currentNode = currentNode.chooseNext();
	    
	    while(!(currentNode.getDecoratedNode() instanceof TerminalNode)) {
	    		    	
	    	
	    	if(!(currentNode.getDecoratedNode() instanceof DecisionNode) && !(currentNode.getDecoratedNode() instanceof ChanceNode) && !(currentNode.equals(sn6)) && !(currentNode.equals(sn9))) {
		    	if(currentNode.equals(sn3)) {
		    		currentNode = currentNode.chooseNext(player, cerberus);
		    	}else if(currentNode.equals(sn4)) {
		    		currentNode = currentNode.chooseNext(player, charon);
		    	}else {
		    		currentNode = currentNode.chooseNext(player, hades);
		    	}
	    		
		    	
		    }else {
		    	if(currentNode.equals(sn6)) {
		    		
		    		String rep = myObj.next();
		    		if(rep.equals("obole")) {
		    			player.getInventory().put(Item.OboleOfCharon, 1);
		    		}
		    		
		    		currentNode = currentNode.chooseNext(player);
		    		
		    	}else {
			    	currentNode = currentNode.chooseNext();

		    	}
		    }
		   
		    
		   currentNode.display();
		    
	    }
	    
	    myObj.close();

	}
	}


	
    
			
			

