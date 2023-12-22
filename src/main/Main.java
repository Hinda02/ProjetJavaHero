package main;

import univers.tools.*;
import univers.personage.*;
import representation.*;
import univers.Familiar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import javax.swing.SwingUtilities;

public class Main {

		public static List<WeaponType> nonMagicalWeapons = new ArrayList<WeaponType>();
	    
		public static List<WeaponType> magicalWeapons = new ArrayList<WeaponType>();
	    
		public static List<Material> nonMagicalWeaponsMaterial = new ArrayList<Material>();
	    
		public static List<Attribute> magicalWeaponsAttribute = new ArrayList<Attribute>();
	    
		public static List<Familiar> familiar = new ArrayList<Familiar>();
	     
		public static Scanner myObj = new Scanner(System.in);
		
		public static String choice = null;
		public static String nom;
		public static int weaponT;
		public static Hero player = null;
		public static String weaponN;
		public static int weaponM;
		public static int familiarP;
		public static int attribute;
		public static String choix;
		public static GameGUI gg;
		
		
		
		public static Weapon cerberusW;
		public static Villain cerberus;
		public static Weapon charonW;
		public static Villain charon;
		public static Weapon hadesW;
		public static Villain hades;
		
		public static Weapon peopleW;
		public static Villain people;
		public static Weapon titansW;
		public static Villain titans;
		public static Weapon gAngelW;
		public static Villain gAngel;
		public static Weapon oracleW;
		public static Villain oracle;
		
		public static Weapon hephaistosW;
		public static Villain hephaistos;
		public static Weapon aresW;
		public static Villain ares;
		public static Weapon heraW;
		public static Villain hera;
		public static Weapon mistressW;
		public static Villain mistress;
		public static Weapon achillesW;
		public static Villain achilles;
		public static Weapon posseidonW;
		public static Villain posseidon;
		public static Weapon zeusW;
		public static Villain zeus;
		
		public static Event node16;
		public static Event node15;
		public static Event node14;
		public static Event node12;
		public static Event node10;
		public static Event node5;
		public static Event node13;
		public static Event node4;
		public static Event node9;
		public static Event node6;
		public static Event node7;
		public static Event node3;
		public static Event node2;
		public static Event node1;
		public static Event sn16;
		public static Event sn15;
		public static Event sn14;
		public static Event sn12;
		public static Event sn5;
		public static Event sn13;
		public static Event sn4;
		public static Event sn9;
		public static Event sn6;
		public static Event sn7;
		public static Event sn3;
		
		public static Event line1;
		public static Event line2;
		public static Event line3;
		public static Event line4;
		public static Event line5;
		public static Event line6;
		public static Event line7;
		public static Event line8;
		public static Event line9;
		public static Event line10;
		public static Event line11;
		public static Event line12;
		public static Event line13;
		public static Event line14;
		public static Event line15;
		public static Event line16;
		public static Event line17;
		public static Event line18;
		public static Event line19;
		
		public static Event mageKeepStormDesc;
		public static Event mageGiveStormDesc;
		public static Event mageKeepStorm;
		public static Event mageGiveStorm;
		public static Event mageZeusLose;
		public static Event mageZeusWin;
		public static Event mageZeusFight;
		public static Event mageWomenLose;
		public static Event mageWomenWin;
		public static Event mageWomenFight;
		public static Event mageFollowWomen;
		public static Event mageThetisTalk;
		public static Event mageAchillesLose;
		public static Event mageThetisRevenge;
		public static Event mageHeadlessImpossible;
		public static Event mageAchillesHeadChop;
		public static Event mageAchillesClemence;
		public static Event mageAchillesStandUp;
		public static Event mageAchillesNothing;
		public static Event mageAchillesHeel;
		public static Event mageAchillesWin;
		public static Event mageAchillesFight;
		public static Event mageThetisMeet;
		public static Event mageThetisFight;
		public static Event mageThetis;
		public static Event mageThetisCoupable;
		public static Event mageLetStormDesc; 
		public static Event mageLetStormHeraDesc;
		public static Event mageLetStorm;
		public static Event mageLetStormHera;
		public static Event mageStormChoice;
		public static Event mageAresDeath;
		public static Event mageAresFight;
		public static Event mageHeraDeath ;
		public static Event mageHeraStormChoice;
		public static Event mageHeraFight ;
		public static Event mageAresOrHera;
		public static Event mageHephaLost;
		public static Event mageHephaWin;
		public static Event mageHephaistosFight;
		public static Event mageHephaistosMeet;
		public static Event mageHeraHepha;
		public static Event mageAgreeHera;
		public static Event mageDisagreeDeath;
		public static Event mageHypnosis;
		public static Event mageNymphes;
		public static Event mageDisagreeMiracle;
		public static Event mageHeraKill;
		public static Event mageHeraNotTalk;
		public static Event mageOpinionHera;
		public static Event mageDisagreeHera;
		public static Event mageHeraTalk ;
		public static Event mageHeraMeet;
		public static Event mageFlowerPath;
		public static Event mageHera;
		public static Event magePosseidonWin;
		public static Event magePosseidonLose;
		public static Event magePosseidonFight;
		public static Event magePosseidonMood;
		public static Event magePosseidonTalk;
		public static Event magePosseidonMeet;
		public static Event mageFountainPath; 
		public static Event mageOutLibrary;
		public static Event mageJustAnOwl; 
		public static Event mageAthenaClue; 
		public static Event mageNotJustAnOwl;
		public static Event mageOwlMeta; 
		public static Event mageOwlScream; 
		public static Event mageOwlHungry;
		public static Event mageOwlFeed ;
		public static Event mageOwlApproach; 
		public static Event mageOwlNoApproach;
		public static Event mageGoNextOwl;
		public static Event mageNobody;
		public static Event mageLibraryEntry;
		public static  Event mage1 ;
		
		
			
	public static void main(String[] args) {
		
		
		gg = new GameGUI();
        gg.display();
        
        
        
		/*SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                gg = new GameGUI();
                gg.display();
            }
        });*/
        
		
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
		
		
		
		
		Game game = new Game(player, choice); 
		gg.setGame(game);
		
		
		//Villains Human 
				cerberusW = new MagicalWeapon("cerberus' evil eye", WeaponType.EvilEye, Attribute.Earth); 
				cerberus = new Minion("Cerberus", cerberusW, 7);
				
				charonW = new NonMagicalWeapon("charon's axe", WeaponType.Axe, Material.Silver);
				charon = new General("Charon", charonW, 10, (Minion)cerberus);
				
				hadesW = new MagicalWeapon("hades' orb", WeaponType.Orb, Attribute.Fire);
				hades = new Supreme("Hades", hadesW, 12, Attribute.Fire);
				
				
				
				//Villains Angel, Demon
				
				peopleW = new NonMagicalWeapon("Mediocre swords", WeaponType.Sword, Material.Iron);
				people= new Minion("People", peopleW, 7);
				
				titansW = new NonMagicalWeapon("Titans' axes", WeaponType.Axe, Material.Iron);
				titans = new General("Titans", titansW, 10, (Minion)people);
				
				gAngelW = new MagicalWeapon("Angel's Harp", WeaponType.Harp, Attribute.Wind);
				gAngel = new General("Gardian Angel", gAngelW, 10, (Minion)people);
				
				oracleW = new MagicalWeapon("Oracle's Wrath", WeaponType.EvilEye, Attribute.Fire);
				oracle= new Supreme("Oracle", oracleW, 10, Attribute.Earth);
				
				
				
				//Villains Mage
				/*
				Personage zeus = new Enemy("Zeus", Weapon.NULL, 20, 20);
				*/
				
				 hephaistosW = new MagicalWeapon("Hephaistos' orb", WeaponType.Orb, Attribute.Fire);
				 hephaistos = new Minion("Hephaistos", hephaistosW, 8);
				
				 aresW = new NonMagicalWeapon("Ares' spear", WeaponType.Spear, Material.Iron);
				 ares = new General("Ares", aresW, 10, (Minion) hephaistos);
				
				 heraW = new MagicalWeapon("Hera's orb", WeaponType.Orb, Attribute.Water);
				 hera= new Supreme("Hera", heraW, 13, Attribute.Earth);
				
				 mistressW = new NonMagicalWeapon("Epée de statue", WeaponType.Sword, Material.Bronze);
				 mistress= new Minion("Maîtresse de Zeus", mistressW, 10);
				
				 achillesW = new NonMagicalWeapon("Lance du guerrier", WeaponType.Spear, Material.Gold);
				 achilles= new Minion("Achille", achillesW, 9);
				
				 posseidonW = new MagicalWeapon("Larme du dragon", WeaponType.Orb , Attribute.Water);
				 posseidon = new Supreme("Posseidon", posseidonW, 12, Attribute.Water);
				
				 zeusW = new MagicalWeapon("Harpe céleste", WeaponType.Harp , Attribute.Fire);
				 zeus = new Supreme("Zeus", zeusW, 12, Attribute.Water);
				
				
				//Human nodes

				 node16 = new TerminalNode(16, "Vous avez bien combattu ! Malheureusement, vous n'êtes pas de taille face au roi des Enfers...");
				 sn16 = new SoundNode(node16, "die.wav");
				
				 node15 = new TerminalNode(15, "Vous obtenez l'éclair de Zeus.");
				 sn15 = new SoundNode(node15, "win.wav");
				
				 node14 = new InnerNode(14, "Admirative de votre bravoure, Perséphonne décide de vous céder gratuitement l'éclair divin.", Arrays.asList(node15));
				 sn14 = new SoundNode(node14, "win.wav");
			    
			     node12 = new InnerNode(12, "Vous décidez de combattre Hades.", Arrays.asList(sn15, sn16) );
			     sn12 = new SoundNode(node12, "sword.wav");
				
				 node10 = new ChanceNode(10, "Hadès se tient face à vous.", Arrays.asList(sn14, sn12));
				//Event sn10 = new SoundNode(node10, "");
				
				 node5 = new TerminalNode(5, "Votre diversion était parfaite. Malheureusement, vous \ntrébuchez sur une pierre et Cerberus vous attrape! Partie perdue!");
				 sn5 = new SoundNode(node5, "die.wav");
				
				 node13 = new TerminalNode(13, "Charon vous tue ! \nC'est la fin ! ");
				 sn13 = new SoundNode(node13, "die.wav");
			    
			     node4 = new InnerNode(4, "En avançant plus profondément, vous vous retrouvez face à Charon.", Arrays.asList(node10, sn13));
			     sn4 = new SoundNode(node4, "sword.wav");
			    
			     node9 = new InnerNode(9, "En offrant l'obole obtenue lors du précédent combat à Charon, vous parvenez à traverser le Styx. ", Arrays.asList(node10));
			     sn9 = new SoundNode(node9, "heal.wav");
			    
			     node6 = new InnerNode(6, "Vous avez gagné le combat ! \nCerberus laisse tomber derrière lui un artéfact qui pourrait vous aider pour la suite. \nSaisissez le nom de cet objet pour l'obtenir : ", Arrays.asList(sn9, sn4));
			     sn6 = new SoundNode(node6, "win.wav");
			     sn6 = new ImageNode(node6, "cerberus.png");
			    
			     node7 = new TerminalNode(7, "Cerberus vous a battu! :(");
			     sn7 = new SoundNode(node7, "die.wav");
			    
			     node2 = new ChanceNode(2, "Vous décidez de faire diversion", Arrays.asList(sn4, sn5));
			    //Event sn2 = new SoundNode(node2, "");
			    
			     node3 = new InnerNode(3, "Vous décidez de combattre Cerberus", Arrays.asList(sn6, sn7));
			     sn3 = new SoundNode(node3, "sword.wav");
			    //sn3 = new ImageNode(node3, "cerberus.png");
			    
			     node1 = new DecisionNode(1, "Vous vous retrouvez devant la tanière de Cerberus, que \nsouhaitez vous faire ? Le combattre ou Faire diversion ?", Arrays.asList(node2, sn3));
			    //Event sn1 = new SoundNode(node1, "");
			    
			    
			    // Angel, Demon -> Graph
			    
			     line18 = new TerminalNode(218, "Death by Zeus");
			     line17 = new TerminalNode(217, "Saved Humanity");
			     line14 = new TerminalNode(214, "Acquire thunderbolt");
			     line15 = new TerminalNode(215, "Death by Oracle");
			    
			     line16 = new InnerNode(216, "You decide to help fight Zeus", Arrays.asList(line17, line18));
			     line13 = new InnerNode(213, "You decide to fight the Oracle", Arrays.asList(line14, line15));
			     line19 = new TerminalNode(219, "Death by Gardian Angel");
			    
			     line11 = new DecisionNode(211, "Meeting the Orale: he explains Zeus' will to exterminate humans.", Arrays.asList(line16, line13));
			     line12 = new InnerNode(212, "You need to fight the gardian angel", Arrays.asList(line11, line19));

			     line10 = new InnerNode(210, "You come across a gardian angel.", Arrays.asList(line11, line12));
			     line9 = new TerminalNode(209, "Death by Titans");
			     line6 = new InnerNode(206, "Humans are distressed over a certain rumor circulating about Zeus.", Arrays.asList(line10));
			     line8 = new TerminalNode(208, "Death by Humans");
			    
			     line7 = new InnerNode(207, "Fight the titans blocking your path.", Arrays.asList(line10, line9));
			     line5 = new InnerNode(205, "You try to discuss  things with the humans.", Arrays.asList(line6));
			     line4 = new InnerNode(204, "Looks like you'll have to fight your way out.", Arrays.asList(line10, line8));
			    
			     line2 = new InnerNode(202, "You decide to look for the Oracle.", Arrays.asList(line7));
			     line3 = new DecisionNode(203, "You decide to ask the people about the rumors you heard.", Arrays.asList(line2, line4, line5));
			    
			     line1 = new DecisionNode(201, "Upon descension to Earth you hear rumors about an Oracle suddenly becoming overpowered.", Arrays.asList(line2, line3));




			    
			    
			    
			    //Mage nodes
			    
			     // Mage
			    
			     mageKeepStormDesc = new TerminalNode(101, "Vous decidez de garder l'éclair de Zeus. \nEn effet, c'est la juste récompense pour avoir traversé tous ses obstacles. \nVotre décision plonge le monde dans le chaos et provoque la colère de Zeus et des autres Dieux. \nVous survivez au chaos grâce à l'éclair.");
			     mageGiveStormDesc = new TerminalNode(102, "Vous rendez l'éclair divin à son propriétaire. \nAinsi, vous ramenez le calme dans la monde. \nDe plus, Zeus vous exauce votre voeu le plus cher. \nVOUS ÊTES UN GRAND HEROS !");
			    
			     mageKeepStorm = new InnerNode(103, "Vous decidez de garder l'éclair de Zeus. ",Arrays.asList(mageKeepStormDesc));
			     mageGiveStorm = new InnerNode(104, "Vous rendez l'éclair divin à son propriétaire.", Arrays.asList(mageGiveStormDesc));
			    
			    
			    //// Fountain Path
			    
			     mageZeusLose = new TerminalNode(105, "Vous perdez contre Zeus ! Pour punition contre cette affront, votre âme connaitra le tourment éternel.");
			     mageZeusWin = new TerminalNode(106, "INCROYABLE ! Ce jour est à marqué d'une pierre blanche ! \nVOUS êtes le nouveau roi des Dieux");
			     mageZeusFight = new InnerNode(107,"Vous décidez de combattre Zeus pour mettre fin à toute cette injustice en vous alliant à ses différentes maitresses!", 
			    		Arrays.asList(	mageZeusWin,
			    						mageZeusLose)
			    		);
			     mageWomenLose = new TerminalNode(108, "Vous vous êtes battu comme vous le pouviez malheureusement, elles étaient trop nombreuses. Vous êtes vaincu...");
			     mageWomenWin = new DecisionNode(109, "Vous vous êtes bien battu. Vous avez gagné contre les maitresses de Zeus et repartez avec l'éclair.",
			    		Arrays.asList(mageKeepStorm,
			    		mageGiveStorm));
			     mageWomenFight = new InnerNode(110, "Vous refusez de vous ranger aux côtés des femmes. Elles se réunissent autour de vous et vous attaquent. Défendez-vous! ",
			    		Arrays.asList(mageWomenWin,
			    		mageWomenLose));
			     mageFollowWomen = new InnerNode(111, "Vous décidez de suivre le mouvement de ses femmes dont Zeus a fait du tord !", Arrays.asList(mageZeusFight) );
			     mageThetisTalk = new DecisionNode(112, "Thétis vous avoue qu'elle et plusieurs femmes se sont réunies pour battre Zeus. \n \" Oh grand héros ! Rejoins-nous pour faire face à cette injustice !\" ", 
			    		Arrays.asList(mageFollowWomen,
			    		mageWomenFight)
			    		);
			     mageAchillesLose = new TerminalNode(113, "Vous vous êtes battu comme vous le pouviez malheureusement, Achille n'a pas volé son titre de héros. \nDans une autre vie peut être que vous auriez gagné... ");
			    
			     mageThetisRevenge = new TerminalNode(114, "Thetis s'effondre. Elle se retrouve sans enfant. Elle décide de sauter  dans le lac en vous tenant afin de vous donner la mort avec elle.");
			     mageHeadlessImpossible = new TerminalNode(115, "N'avez vous jamais entendu parlé de talon d'Achille ? \nC'est son point faible! \nNe pas savoir cela vous a couté la vie. ");
			     mageAchillesHeadChop = new InnerNode(116, "Vous décidez de couper la tête d'Achille", Arrays.asList(mageHeadlessImpossible));
			     mageAchillesClemence = new InnerNode(117,"Pour votre clémence, Thétis vous propose de vous donner de l'eau d'une source pour soigner vos blessures. ",Arrays.asList(mageThetisTalk));	
			     mageAchillesStandUp = new InnerNode(118,"Achilles se relève. Cette fois-ci il ne rate pas votre tête. \nVous êtes mort.", Arrays.asList(mageAchillesLose));	
			     mageAchillesNothing = new ChanceNode(119, "Vous décidez de le laisser tranquille",
			    		Arrays.asList(mageAchillesClemence,
			    		mageAchillesStandUp)
			    		);
			     mageAchillesHeel = new InnerNode(120,"Vous décidez de couper les chevilles d'Achille", Arrays.asList(mageThetisRevenge));
			     mageAchillesWin = new DecisionNode(121, "Quand 2 héros s'affrontent, celui qui gagne se doit de couper la tête du perdant. Qu'allez-vous faire ?",
			    		Arrays.asList(mageAchillesHeadChop,
			    	    		mageAchillesHeel,
			    	    		mageAchillesNothing)
			    		);
			     mageAchillesFight = new InnerNode(122, "En provoquant Thétis, vous provoquez la colère de son fils qui décide de vous combatre à sa place",
			    		Arrays.asList(mageAchillesWin,
			    		mageAchillesLose));
			     mageThetisMeet = new InnerNode(123,"Vous décidez de parler à Thétis", Arrays.asList(mageThetisTalk) );
			     mageThetisFight = new InnerNode(124, "Vous décidez d'attaquer Thétis.", Arrays.asList(mageAchillesFight));
			     mageThetis = new DecisionNode(125,"Vous retrouvez Thétis face à un lac.",
			    		Arrays.asList(mageThetisMeet,
			    		mageThetisFight)
			    		);
			     mageThetisCoupable = new InnerNode(126, "Thétis", Arrays.asList(mageThetis));
			    
			    //// Flower Path
			     mageLetStormDesc = new TerminalNode(127, "Vous décidez de les laisser se venger de Zeus. \nVOUS N'AUREZ JAMAIS VOTRE NOM INSCRIS \nDANS LES PLUS GRANDS LIVRES D'HISTOIRE !");
			     mageLetStormHeraDesc = new TerminalNode(128, "La vengeance d'Héra est fondée. Zeus mérite une punition ! \nVous décidez de la laisser faire en oubliant tout vos désirs d'entrer dans la légende. ");
			    
			     mageLetStorm = new InnerNode(129, "Vous comprenez l'objectif des fils d'Héra.", Arrays.asList(mageLetStormDesc));
			     mageLetStormHera = new InnerNode(130, "Vous ne reprenez pas la foudre. ", Arrays.asList(mageLetStormHeraDesc));
			     mageStormChoice = new DecisionNode(131, "Vous avez gagné le combat contre Arès ! ", 
			    		Arrays.asList(mageKeepStorm, mageGiveStorm,mageLetStorm)
			    		);
			     mageAresDeath = new TerminalNode(132, "Arès vous a battu :( ");
			     mageAresFight = new InnerNode(133, "Arès, le Dieu de la guerre.\nC'est lui qui, poussé par la colère, a volé le trèsor du souverain des Dieux. \nPrévenu de votre venu, il vous accueille la lance à la main ! \nBattez-vous pour récupérer la foudre !", 
			    		Arrays.asList(mageStormChoice,
			    		mageAresDeath));
			     mageHeraDeath = new TerminalNode(134, "Hera vous a battu :( ");
			     mageHeraStormChoice = new DecisionNode(135, "Héra est vaincue ! ", 
			    		Arrays.asList(mageKeepStorm, mageGiveStorm,mageLetStormHera)
			    		);
			     mageHeraFight = new InnerNode(136,"Depuis le début, c'était Héra qui possédait la foudre ! \nPrévenue de votre arrivée par son fils, elle se jette sur vous, son sceptre à la main. ", 
			    		Arrays.asList(mageHeraStormChoice,
			    		mageHeraDeath)
			    		);
			     mageAresOrHera = new ChanceNode(137, "Vous décidez de parler avec Hephaistos. \nIl vous donne le nom du détenteur de l'écair. Vous n'en croyez pas vos oreilles...", 
			    		Arrays.asList(mageAresFight,
			    		mageHeraFight)
			    		);
			     mageHephaLost = new TerminalNode(138, "Hephaistos vous tue à l'aide de son marteau. Il ne reste plus rien de vous...");
			     mageHephaWin = new InnerNode(139, "Vous avez gagné le combat contre Hephaistos :) \nEn échange de votre bravoure, il vous livre le nom de son frère. ", Arrays.asList(mageAresFight));
			     mageHephaistosFight = new InnerNode(140, "Vous décidez de combattre Hephaistos.",
			    		Arrays.asList(mageHephaWin,
			    		mageHephaLost)
			    		);
			     mageHephaistosMeet = new DecisionNode(141, "Vous vous dirigez vers la forge, le territoire d'Hephaistos. Vous avez le choix entre lui demander de l'aide et le combattre. ", 
			    		Arrays.asList(mageAresOrHera,
			    		mageHephaistosFight)
			    		);
			     mageHeraHepha = new InnerNode(142, "Héra est touchée par votre sensibilité vis-à-vis de sa situation. \nElle n'avait jamais croisé un inconnu avec une âme aussi pure. \nEn pleurs, elle avoue que par amour ses fils ont décidé de la venger de Zeus.", Arrays.asList(mageHephaistosMeet));
			     mageAgreeHera = new InnerNode(143, "Vous êtes d'accord avec elle ! Elle n'a pas à subir l'adultère de Zeus !", Arrays.asList(mageHeraHepha));
			     mageDisagreeDeath = new TerminalNode(144, "Vous mourez empoisonné, seul,  dans ce labyrinthe de fleurs ensanglantées de votre propre sang... ");	    
			    
			    /// Fountain Path suite 
			    
			    // Nymphes
			    
			     mageHypnosis = new TerminalNode(145,"Les nymphes aquatiques vous offrent des friandises aux fleurs de lotus. \nVous ne voyez pas le temps passer. \nVous finnissez par être emprisonné dans une illusion sans fin. \nFIN");
			     mageNymphes = new InnerNode(146,"Vous vous retrouvez entouré de nymphes auqatiques.",Arrays.asList(mageHypnosis));
			    
			    
			    // Hera suite
			    
			     mageDisagreeMiracle = new InnerNode(147, "Une petite nymphe aquatique vous a suivi pendant tout votre périple et s'est pris d'affection pour vous ! \n Elle soigne tant bien que mal vos blessures. \n Elle vous ramène près d'une source d'eau où se trouvent d'autres nymphes. ", Arrays.asList(mageNymphes));
			     mageHeraKill = new ChanceNode(148,"Héra est en FURIEUSE ! Elle décide de lancer ses serpents sur vous. \nIls vous mordent et vous empoisonnent.", Arrays.asList(mageDisagreeDeath,mageDisagreeMiracle));
			     mageDisagreeHera = new InnerNode(149, "Vous n'êtes pas d'accord avec elle ! Bien que Zeus continue à courtiser d'autres femmes, c'est le privilège du Roi !", Arrays.asList(mageHeraKill));
			    
			   //Attention ! Risque de cycle ! 
			     mageHeraNotTalk = new InnerNode(150, "Vous décidez de ne pas parler à Héra. Elle fait bient trop peur ! Vous reborussez chemin...", Arrays.asList(mageThetis)); 
			     mageOpinionHera = new DecisionNode(151, "Héra vous explique sa situation : \nZeus, son mari, la trompe une fois encore. \nElle ne sait plus quoi faire pour l'empêcher de continuer. \nElle veut que Zeus souffre mais ne sait pas si c'est une bonne idée de s'attirer les foudres du dieu de la foudre en ce moment...",
			    		Arrays.asList(mageDisagreeHera,
			    		mageAgreeHera)
			    		); 
			     mageHeraTalk = new InnerNode(152, "Vous décidez de parler à Héra", Arrays.asList(mageOpinionHera));  
			     mageHeraMeet = new DecisionNode(153,"En avançant, vous remarquez que l'allée de fleurs menait en fait vers un labyrithe de hautes herbes. \nVous vous retrouvez face à une femme magnifique. \nSans aucun doute, il s'agit bien de Héra, la déesse du foyer.",
			    		Arrays.asList(mageHeraTalk,
			    		mageHeraNotTalk)
			    		); 
			     mageFlowerPath = new InnerNode(154, "Vous décidez de marcher vers l'allée de fleurs. ", Arrays.asList(mageHeraMeet));
			     mageHera = new InnerNode(155, "Héra", Arrays.asList(mageFlowerPath));
			    
			    // Suite posseidon
			    
			     magePosseidonWin = new ChanceNode(156,"Suite à votre victoire, Posséidon vous confie l'identité du voleur de foudre. \nIl s'agit de : ",
			    		Arrays.asList(mageHera,
			    		mageThetisCoupable));
			     magePosseidonLose = new TerminalNode(157, "Vous perdez contre Posséidon ! Pour punition contre cette affront, votre âme connaitra le tourment éternel.");
			     magePosseidonFight = new InnerNode(158,"Vous décidez de combattre Posseidon", 
			    		Arrays.asList(magePosseidonWin,
			    		magePosseidonLose)
			    		);
			     magePosseidonMood = new ChanceNode(159, "Posséidon est occupé à parler avec une autre divinité. \nIl pointe une direction pour que vous y aller. ",
			    		Arrays.asList(mageNymphes,
			    		mageHeraMeet));
			     magePosseidonTalk = new InnerNode(160,"Vous décidez de parler avec Posséidon.", Arrays.asList(magePosseidonMood));
			     magePosseidonMeet = new DecisionNode(161,"En avançant, vous vous retrouvez face à Posséidon, le dieu des Océans. \nDes rumeurs circulent que c'est lui qui détient l'éclair. \nGrâce à cette dernière, il pourrait descendre dans \nle monde des humains sans difficultés pour revoir son fils et sa femme \nque Zeus lui aurait interdit de voir...",
			    		Arrays.asList(magePosseidonTalk,
			    		magePosseidonFight
			    		)); 
			     mageFountainPath = new InnerNode(162, "Vous décidez de marcher vers la fontaine d'eau. ", Arrays.asList(magePosseidonMeet));
			    	    
			    
			    //// Library Path
			    
			     mageOutLibrary = new DecisionNode(163,"Vous vous faites jeter de la bibliothèque. Où allez vous maintenant ?", 
			    		Arrays.asList(mageFountainPath,
			    		mageFlowerPath));
			     mageJustAnOwl = new InnerNode(164,"C'était une simple chouette...Rien de surnaturel...", Arrays.asList(mageOutLibrary));
			     mageAthenaClue = new InnerNode(165, "Pour vous remercier de votre générosité, elle vous mène vers le coupable.", Arrays.asList(mageHephaistosMeet));
			     mageNotJustAnOwl = new InnerNode(166, "Il s'agissait d'Athéna déguisée !!", Arrays.asList(mageAthenaClue));
			     mageOwlMeta = new ChanceNode(167,"Vous donnez à manger à la chouette en espérant un miracle.", Arrays.asList(mageJustAnOwl, mageNotJustAnOwl));
			     mageOwlScream = new InnerNode(168,"L'oiseau cri. Un responsable arrive :(", Arrays.asList(mageOutLibrary));
			     mageOwlHungry = new InnerNode(169,"La chouette n'est pas à vous, pas besoin d'y faire attention.", Arrays.asList(mageOwlScream));
			     mageOwlFeed = new DecisionNode(170, "L'oiseau a l'air affamé. ", Arrays.asList(mageOwlMeta,mageOwlHungry));
			     mageOwlApproach = new InnerNode(171,"Vous décidez de vous rapprocher de la chouette pour l'admirer.", Arrays.asList(mageOwlFeed));
			     mageOwlNoApproach = new InnerNode(172,"Vous décidez de ne pas vous approcher de la chouette. Vous en avez peur...", Arrays.asList(mageOwlScream));
			     mageGoNextOwl = new DecisionNode(173,"Vous apercevez une chouette suspendue à un perchoir au fond de la salle. ", Arrays.asList(mageOwlApproach, mageOwlNoApproach));
			     mageNobody = new InnerNode(174, "Il n'y a personne ici...", Arrays.asList(mageOutLibrary));
			     mageLibraryEntry = new ChanceNode(175,"Vous entrez dans la bibliothèque.", Arrays.asList(mageNobody,mageGoNextOwl) );
			    
			     mage1 = new DecisionNode(100, "Ou commenceriez-vous vos recherches ? ",
			    		Arrays.asList(mageFountainPath,
			    				mageFlowerPath,
			    	    		mageLibraryEntry)
			    		);
		        
		        
				
	}
	
	/**
	 * used to customize the player's weapon (only for classes that can't wield magical weapons)
	 */
	public static  WeaponType nonMagicalWeapons(){
		System.out.println("Choisis ton arme: (Saisissez le numéro de l'arme)");
		WeaponType wT = null;
		int i = 0;
		for(WeaponType item : nonMagicalWeapons) {
			i++;
			System.out.println(i + ": " + item.toString());
		}
	
		while(true) {    
		    try {
		        //System.out.println("Please enter a number: ");
		        myObj = new Scanner(System.in);
		        weaponT = myObj.nextInt();
		        wT = nonMagicalWeapons.get(weaponT-1);

		        break;
		    }
		    catch(Exception ex ) {
		        System.out.println("Parmi les numéros proposés...");
		    }
		}

		return wT;
		
	}
	
	/**
	 * used to customize the player's weapon (only for classes that can wield magical weapons)
	 */
	public static  WeaponType magicalWeapons(){
		System.out.println("Choisis ton arme: (Saisissez le numéro de l'arme)");
		WeaponType wT = null;
    	
		int i = 0;
		for(WeaponType item : magicalWeapons) {
			i++;
			System.out.println(i + ": " + item.toString());
		}
		
		
		while(true) {    
		    try {
		        //System.out.println("Please enter a number: ");
		        myObj = new Scanner(System.in);
		        weaponT = myObj.nextInt(); 
				wT = magicalWeapons.get(weaponT-1);

		        break;
		    }
		    catch(Exception ex ) {
		        System.out.println("Parmi les numéros proposés...");
		    }
		}
		
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
		Material wM = null;
		int j = 0;
		for(Material item : nonMagicalWeaponsMaterial) {
			j++;
			System.out.println(j + ": " + item.toString());
		}
		
		while(true) {    
		    try {
		        //System.out.println("Please enter a number: ");
		        myObj = new Scanner(System.in);
		        weaponM = myObj.nextInt();
				wM = nonMagicalWeaponsMaterial.get(weaponM-1);

		        break;
		    }
		    catch(Exception ex ) {
		        System.out.println("Parmi les numéros proposés...");
		    }
		}
		
		return wM;
	}
	
	/**
	 * used to customize the player's weapon's attribute (only for classes that can wield magical weapons)
	 */
	public static Attribute magicalWeaponAttribute() {
		System.out.println("Choisis l'attribut de ton arme: (Saisissez le numéro du matériel de l'arme)");
		Attribute wA = null;
		int j = 0;
		for(Attribute item : magicalWeaponsAttribute) {
			j++;
			System.out.println(j + ": " + item.toString());
		}
		
		while(true) {    
		    try {
		        //System.out.println("Please enter a number: ");
		        myObj = new Scanner(System.in);
		        attribute = myObj.nextInt();
				wA = magicalWeaponsAttribute.get(attribute-1);

		        break;
		    }
		    catch(Exception ex ) {
		        System.out.println("Parmi les numéros proposés...");
		    }
		}
		return wA;
	}
	
	/**
	 * used to customize the player's familiar (only for humans and mages)
	 */
	public static Familiar familiar() {
		System.out.println("Choisis ton familier : ");
		Familiar familiarPlayer = null;
		int k = 0;
		for(Familiar item : familiar) {
			k++;
			System.out.println(k + ": " + item.toString());
		}
		
		
		while(true) {    
		    try {
		        //System.out.println("Please enter a number: ");
		        myObj = new Scanner(System.in);
		        familiarP = myObj.nextInt();
				familiarPlayer = familiar.get(familiarP-1);

		        break;
		    }
		    catch(Exception ex ) {
		        System.out.println("Parmi les numéros proposés...");
		    }
		}
		
		return familiarPlayer;
	}
	
	public static void newGame() {
		gg.getSaveButton().setEnabled(true);
		Event currentNode = null;
		//Intro to Story 
		
		System.out.println("Zeus a perdu son éclair divin ! Il est sûr que quelqu'un l'a volé pour \nréaliser de mauvais desseins. Il promet d'exaucer le voeu de celui ou celle qui le lui rendra.");
		System.out.println("Vous décidez d'accepter cette quête. ");
		    
		//Player's class
		System.out.println("Choisis ton personnage parmis: (Saisissez une des classes suivantes)");
		System.out.println("Humain _ Mage _ Ange _ Demon");

		//get player input
		try {
			choice = myObj.next().toLowerCase();
			if(!(choice.equals("humain") || choice.equals("mage") || choice.equals("ange") || choice.equals("demon"))){
				throw new Exception("Erreur de saisie. Votre personnage sera humain par défaut");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	     
	    
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
		    	
		    	System.out.println("Vos recherches vous amènent jusqu'aux Enfers, le territoire d'Hades. \nPour entrer il vous faudra passer les serviteurs du roi des Enfers, notamment : \nCerberus et Charon. La première étape est Cerberus");
		    	currentNode = node1;
		    	
		    	break;
		    	
		   case "mage":
		    	WeaponType wTMage = magicalWeapons();
		    	String wNMage = weaponName();
		    	Attribute wAMage = magicalWeaponAttribute();
				MagicalWeapon mageWeapon = new MagicalWeapon(wNMage, wTMage, wAMage);
				Familiar mageFam = familiar();
				
		    	player = new Mage(nom, mageWeapon, mageFam);
		    	
		    	System.out.println("Vos recherches vous amènent jusqu'à l'Olympe, le territoire des Dieux. \nUn des Olympiens (Dieux siègeant à l'Olympe) serait le coupable de ce vol...\nMais qui ?");
				currentNode = mage1;
				   
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
		    	
		    	System.out.println("Vos recherches vous amènent jusque la Terre, le territoire des Humains.");
				currentNode = line1;
		    	
		    	break;
		    	
		    case "demon":
		    	
		    	System.out.println("Souhaitez-vous utiliser une arme magique ou nm (Saisissez m ou nm)");
		    	//choix = myObj.next();
		    	while(true) {    
				    try {
				        //System.out.println("Please enter a number: ");
				        myObj = new Scanner(System.in);
				        choix = myObj.next();
				        if(!(choix.equals("m") || choix.equals("nm"))) {
				        	throw new Exception("Saisissez 'm' ou 'nm' uniquement.");
				        }

				        break;
				    }
				    catch(Exception ex ) {
				        System.out.println(ex.getMessage());
				    }
				}
		    	
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
		    	
		    	System.out.println("Vos recherches vous amènent jusque la Terre, le territoire des Humains.");
				currentNode = line1;
		    	
		    	break;
		    	
		    default:
		    	WeaponType wTDefault = nonMagicalWeapons();
		    	String wNameD = weaponName();
		    	Material wD = nonMagicalWeaponMaterial();
				NonMagicalWeapon wDefault = new NonMagicalWeapon(wNameD, wTDefault , wD);
				Familiar famDefault = familiar();
				
		    	player = new Human(nom, wDefault, famDefault);
		    	
		    	System.out.println("Vos recherches vous amènent jusqu'aux Enfers, le territoire d'Hades. \nPour entrer il vous faudra passer les serviteurs du roi des Enfers, notamment : \nCerberus et Charon. La première étape est Cerberus");
		    	currentNode = node1;
		    	break;
	    }
	    Game game = new Game(player, choice);
	    game.setCurrentNode(currentNode);
	    
	    gamePlay(game);
	    
	}
	
	public static void gamePlay(Game game) {
		//Display player data
	    System.out.println(player.toString()); 
	    Event currentNode = null;
	    currentNode = game.getCurrentNode();	    
	   //Main Code (Game)
	    
	    System.out.println();
	    currentNode.display();
	    currentNode = currentNode.chooseNext();
	    
	    while(!(currentNode.getDecoratedNode() instanceof TerminalNode)) {
	    	
	    	if(!(currentNode.getDecoratedNode() instanceof DecisionNode) && !(currentNode.getDecoratedNode() instanceof ChanceNode) 
	    			&& !(currentNode.equals(sn6)) 
	    			&& !(currentNode.equals(sn9))
	    			&& !(currentNode.equals(line2))
	    			&& !(currentNode.equals(line5))
	    			&& !(currentNode.equals(line6))
	    			&& !(currentNode.equals(line10))
	    			&& !(currentNode.equals(mageKeepStorm))
	    			&& !(currentNode.equals(mageGiveStorm))
	    			&& !(currentNode.equals(mageFollowWomen))
	    			&& !(currentNode.equals(mageAchillesHeadChop))
	    			&& !(currentNode.equals(mageAchillesClemence))
	    			&& !(currentNode.equals(mageAchillesStandUp))
	    			&& !(currentNode.equals(mageAchillesHeel))
	    			&& !(currentNode.equals(mageThetisFight))
	    			&& !(currentNode.equals(mageThetisMeet))
	    			&& !(currentNode.equals(mageThetisCoupable))
	    			&& !(currentNode.equals(mageLetStorm))
	    			&& !(currentNode.equals(mageLetStormHera))
	    			&& !(currentNode.equals(mageHephaWin))
	    			&& !(currentNode.equals(mageHeraHepha))
	    			&& !(currentNode.equals(mageAgreeHera))
	    			&& !(currentNode.equals(mageNymphes))
	    			&& !(currentNode.equals(mageDisagreeMiracle))
	    			&& !(currentNode.equals(mageDisagreeHera))
	    			&& !(currentNode.equals(mageHeraNotTalk))
	    			&& !(currentNode.equals(mageHeraTalk))
	    			&& !(currentNode.equals(mageFlowerPath))
	    			&& !(currentNode.equals(mageHera))
	    			&& !(currentNode.equals(magePosseidonTalk))
	    			&& !(currentNode.equals(mageFountainPath))
	    			&& !(currentNode.equals(mageJustAnOwl))
	    			&& !(currentNode.equals(mageNotJustAnOwl))
	    			&& !(currentNode.equals(mageAthenaClue))
	    			&& !(currentNode.equals(mageOwlScream))
	    			&& !(currentNode.equals(mageOwlHungry))
	    			&& !(currentNode.equals(mageOwlApproach))
	    			&& !(currentNode.equals(mageOwlNoApproach))
	    			&& !(currentNode.equals(mageNobody))
	    			//InnerNodes with only one component in list nodes
	    			) 
	    	{
		    	
	    		
	    		if(player instanceof Angel || player instanceof Demon) {
	    			
	    			if(currentNode.equals(line4)) {
			    		currentNode = currentNode.chooseNext(player, people);
			    	}else if (currentNode.equals(line7)) {
			    		currentNode = currentNode.chooseNext(player, titans);
			    		
			    		if (!(currentNode instanceof TerminalNode)) {
			    			System.out.println("Name the artefact the titans dropped to avoid a fight with the gardian angel.");
			    			String rep = myObj.next().toLowerCase();
				    		if(rep.equals("will")) {
				    			player.getInventory().put(Item.WillOfOracle, 1);
				    		}
			    		}
			    		
			    	}else if (currentNode.equals(line12)) {
			    		currentNode = currentNode.chooseNext(player, gAngel);
			    	}else {
			    		currentNode = currentNode.chooseNext(player, zeus);
			    	}
	    			
	    		}
	    		
	    		if(player instanceof Human) {
	    			
	    			if(currentNode.equals(sn3)) {
			    		currentNode = currentNode.chooseNext(player, cerberus);
			    	}else if(currentNode.equals(sn4)) {
			    		currentNode = currentNode.chooseNext(player, charon);
			    	}else {
			    		currentNode = currentNode.chooseNext(player, hades);
			    	}
	    			
	    		}
	    		
	    		if(player instanceof Mage) {
	    			
	    			if(currentNode.equals(mageHephaistosFight)) {
			    		currentNode = currentNode.chooseNext(player, hephaistos);
			    	}else if(currentNode.equals(mageHeraFight)) {
			    		currentNode = currentNode.chooseNext(player, hera);
			    	}else if(currentNode.equals(magePosseidonFight)) {
			    		currentNode = currentNode.chooseNext(player, posseidon);
			    	}else if(currentNode.equals(mageAresFight)) {
			    		currentNode = currentNode.chooseNext(player, ares);
			    	}else if(currentNode.equals(mageAchillesFight)) {
			    		currentNode = currentNode.chooseNext(player, achilles);
			    	}else if(currentNode.equals(mageZeusFight)) {
			    		currentNode = currentNode.chooseNext(player, zeus);
			    	}else if(currentNode.equals(mageWomenFight)) {
			    		currentNode = currentNode.chooseNext(player, mistress);
			    	}
	    			
	    		}
	    		
		    	
		    }else 
		    {
		    	
    			if(player instanceof Angel || player instanceof Demon) {
	    			
	    			if(currentNode.equals(line5)) {
	    				
	    				if(player instanceof Demon) {
	    					currentNode = line4;
	    					//currentNode.display();
	    				}else {
	    					currentNode = line6;
	    					//currentNode.display();
	    				}

			    	}else if (currentNode.equals(line10)) {
			    		
			    		currentNode = currentNode.chooseNext(player, Item.WillOfOracle);
			    	}else 
    		    	{
    			    	currentNode = currentNode.chooseNext();

    		    	}
	    			
	    		}
    			
    			if(player instanceof Human) {
    				
    				if(currentNode.equals(sn6)) {
    		    		
    		    		String rep = myObj.next().toLowerCase();
    		    		if(rep.equals("obole")) {
    		    			player.getInventory().put(Item.OboleOfCharon, 1);
    		    		}
    		    		
    		    		currentNode = currentNode.chooseNext(player, Item.OboleOfCharon);
    		    		
    		    	}else 
    		    	{
    			    	currentNode = currentNode.chooseNext();

    		    	}
    			}
    			
    			if(player instanceof Mage) {
    				
    				if(currentNode.equals(mageAchillesClemence)) {
			    		//ajouter pv
			    		player.setHp(player.getHp()+10);
			    	}
    				currentNode = currentNode.chooseNext();
    			}
		    }
		   
		    
		   currentNode.display();
		    
	    }
	    
	    myObj.close();
	
	}
	
}


