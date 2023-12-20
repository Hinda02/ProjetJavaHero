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
import representation.Node;
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
		
		//Villains Human 
		Weapon cerberusW = new MagicalWeapon("cerberus' evil eye", WeaponType.EvilEye, Attribute.Earth); 
		Villain cerberus = new Minion("Cerberus", cerberusW, 7);
		
		Weapon charonW = new NonMagicalWeapon("charon's axe", WeaponType.Axe, Material.Iron);
		Villain charon = new General("Charon", charonW, 10, (Minion) cerberus);
		
		Weapon hadesW = new MagicalWeapon("hades' orb", WeaponType.Orb, Attribute.Fire);
		Villain hades= new Supreme("Hades", hadesW, 12, Attribute.Fire);
		
		//Villains Mage
		/*
		Personage zeus = new Enemy("Zeus", Weapon.NULL, 20, 20);
		*/
		
		Weapon hephaistosW = new MagicalWeapon("Hephaistos' orb", WeaponType.Orb, Attribute.Fire);
		Villain hephaistos = new Minion("Hephaistos", hephaistosW, 8);
		
		Weapon aresW = new NonMagicalWeapon("Ares' spear", WeaponType.Spear, Material.Iron);
		Villain ares = new General("Ares", aresW, 10, (Minion) hephaistos);
		
		Weapon heraW = new MagicalWeapon("Hera's orb", WeaponType.Orb, Attribute.Water);
		Villain hera= new Supreme("Hera", heraW, 13, Attribute.Earth);
		
		Weapon mistressW = new NonMagicalWeapon("Epée de statue", WeaponType.Sword, Material.Bronze);
		Villain mistress= new Minion("Maîtresse de Zeus", mistressW, 10);
		
		Weapon achillesW = new NonMagicalWeapon("Lance du guerrier", WeaponType.Spear, Material.Gold);
		Villain achilles= new Minion("Achille", achillesW, 9);
		
		Weapon posseidonW = new MagicalWeapon("Larme du dragon", WeaponType.Orb , Attribute.Water);
		Villain posseidon = new Supreme("Posseidon", posseidonW, 12, Attribute.Water);
		
		Weapon zeusW = new MagicalWeapon("Harpe céleste", WeaponType.Harp , Attribute.Fire);
		Villain zeus = new Supreme("Zeus", zeusW, 12, Attribute.Water);
		
		
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
	    
// Mage
	    
	    Node mageKeepStormDesc = new TerminalNode(101, "Vous decidez de garder l'éclair de Zeus. \nEn effet, c'est la juste récompense pour avoir traversé tous ses obstacles. \nVotre décision plonge le monde dans le chaos et provoque la colère de Zeus et des autres Dieux. \nVous survivez au chaos grâce à l'éclair.");
	    Node mageGiveStormDesc = new TerminalNode(102, "Vous rendez l'éclair divin à son propriétaire. \nAinsi, vous ramenez le calme dans la monde. \nDe plus, Zeus vous exauce votre voeu le plus cher. \nVOUS ÊTES UN GRAND HEROS !");
	    
	    Node mageKeepStorm = new InnerNode(103, "Vous decidez de garder l'éclair de Zeus. ",Arrays.asList(mageKeepStormDesc));
	    Node mageGiveStorm = new InnerNode(104, "Vous rendez l'éclair divin à son propriétaire.", Arrays.asList(mageGiveStormDesc));
	    
	    
	    //// Fountain Path
	    
	    Node mageZeusLose = new TerminalNode(105, "Vous perdez contre Zeus ! Pour punition contre cette affront, votre âme connaitra le tourment éternel.");
	    Node mageZeusWin = new TerminalNode(106, "INCROYABLE ! Ce jour est à marqué d'une pierre blanche ! \nVOUS êtes le nouveau roi des Dieux");
	    Node mageZeusFight = new InnerNode(107,"Vous décidez de combattre Zeus pour mettre fin à toute cette injustice en vous alliant à ses différentes maitresses!", 
	    		Arrays.asList(	mageZeusWin,
	    						mageZeusLose)
	    		);
	    Node mageWomenLose = new TerminalNode(108, "Vous vous êtes battu comme vous le pouviez malheureusement, elles étaient trop nombreuses. Vous êtes vaincu...");
	    Node mageWomenWin = new DecisionNode(109, "Vous vous êtes bien battu. Vous avez gagné contre les maitresses de Zeus et repartez avec l'éclair.",
	    		Arrays.asList(mageKeepStorm,
	    		mageGiveStorm));
	    Node mageWomenFight = new InnerNode(110, "Vous refusez de vous ranger aux côtés des femmes. Elles se réunissent autour de vous et vous attaquent. Défendez-vous! ",
	    		Arrays.asList(mageWomenWin,
	    		mageWomenLose));
	    Node mageFollowWomen = new InnerNode(111, "Vous décidez de suivre le mouvement de ses femmes dont Zeus a fait du tord !", Arrays.asList(mageZeusFight) );
	    Node mageThetisTalk = new DecisionNode(112, "Thétis vous avoue qu'elle et plusieurs femmes se sont réunies pour battre Zeus. \n \" Oh grand héros ! Rejoins-nous pour faire face à cette injustice !\" ", 
	    		Arrays.asList(mageFollowWomen,
	    		mageWomenFight)
	    		);
	    Node mageAchillesLose = new TerminalNode(113, "Vous vous êtes battu comme vous le pouviez malheureusement, Achille n'a pas volé son titre de héros. \nDans une autre vie peut être que vous auriez gagné... ");
	    
	    Node mageThetisRevenge = new TerminalNode(114, "Thetis s'effondre. Elle se retrouve sans enfant. Elle décide de sauter  dans le lac en vous tenant afin de vous donner la mort avec elle.");
	    Node mageHeadlessImpossible = new TerminalNode(115, "N'avez vous jamais entendu parlé de talon d'Achille ? \nC'est son point faible! \nNe pas savoir cela vous a couté la vie. ");
	    Node mageAchillesHeadChop = new InnerNode(116, "Vous décidez de couper la tête d'Achille", Arrays.asList(mageHeadlessImpossible));
	    Node mageAchillesClemence = new InnerNode(117,"Pour votre clémence, Thétis vous propose de vous donner de l'eau d'une source pour soigner vos blessures. ",Arrays.asList(mageThetisTalk));	
	    Node mageAchillesStandUp = new InnerNode(118,"Achilles se relève. Cette fois-ci il ne rate pas votre tête. \nVous êtes mort.", Arrays.asList(mageAchillesLose));	
	    Node mageAchillesNothing = new ChanceNode(119, "Vous décidez de le laisser tranquille",
	    		Arrays.asList(mageAchillesClemence,
	    		mageAchillesStandUp)
	    		);
	    Node mageAchillesHeel = new InnerNode(120,"Vous décidez de couper les chevilles d'Achille", Arrays.asList(mageThetisRevenge));
	    Node mageAchillesWin = new DecisionNode(121, "Quand 2 héros s'affrontent, celui qui gagne se doit de couper la tête du perdant. Qu'allez-vous faire ?",
	    		Arrays.asList(mageAchillesHeadChop,
	    	    		mageAchillesHeel,
	    	    		mageAchillesNothing)
	    		);
	    Node mageAchillesFight = new InnerNode(122, "En provoquant Thétis, vous provoquez la colère de son fils qui décide de vous combatre à sa place",
	    		Arrays.asList(mageAchillesWin,
	    		mageAchillesLose));
	    Node mageThetisMeet = new InnerNode(123,"Vous décidez de parler à Thétis", Arrays.asList(mageThetisTalk) );
	    Node mageThetisFight = new InnerNode(124, "Vous décidez d'attaquer Thétis.", Arrays.asList(mageAchillesFight));
	    Node mageThetis = new DecisionNode(125,"Vous retrouvez Thétis face à un lac.",
	    		Arrays.asList(mageThetisMeet,
	    		mageThetisFight)
	    		);
	    Node mageThetisCoupable = new InnerNode(126, "Thétis", Arrays.asList(mageThetis));
	    
	    //// Flower Path
	    Node mageLetStormDesc = new TerminalNode(127, "Vous décidez de les laisser se venger de Zeus. \nVOUS N'AUREZ JAMAIS VOTRE NOM INSCRIS \nDANS LES PLUS GRANDS LIVRES D'HISTOIRE !");
	    Node mageLetStormHeraDesc = new TerminalNode(128, "La vengeance d'Héra est fondée. Zeus mérite une punition ! \nVous décidez de la laisser faire en oubliant tout vos désirs d'entrer dans la légende. ");
	    
	    Node mageLetStorm = new InnerNode(129, "Vous comprenez l'objectif des fils d'Héra.", Arrays.asList(mageLetStormDesc));
	    Node mageLetStormHera = new InnerNode(130, "Vous ne reprenez pas la foudre. ", Arrays.asList(mageLetStormHeraDesc));
	    Node mageStormChoice = new DecisionNode(131, "Vous avez gagné le combat contre Arès ! ", 
	    		Arrays.asList(mageKeepStorm, mageGiveStorm,mageLetStorm)
	    		);
	    Node mageAresDeath = new TerminalNode(132, "Arès vous a battu :( ");
	    Node mageAresFight = new InnerNode(133, "Arès, le Dieu de la guerre.\nC'est lui qui, poussé par la colère, a volé le trèsor du souverain des Dieux. \nPrévenu de votre venu, il vous accueille la lance à la main ! \nBattez-vous pour récupérer la foudre !", 
	    		Arrays.asList(mageStormChoice,
	    		mageAresDeath));
	    Node mageHeraDeath = new TerminalNode(134, "Hera vous a battu :( ");
	    Node mageHeraStormChoice = new DecisionNode(135, "Héra est vaincue ! ", 
	    		Arrays.asList(mageKeepStorm, mageGiveStorm,mageLetStormHera)
	    		);
	    Node mageHeraFight = new InnerNode(136,"Depuis le début, c'était Héra qui possédait la foudre ! \nPrévenue de votre arrivée par son fils, elle se jette sur vous, son sceptre à la main. ", 
	    		Arrays.asList(mageHeraStormChoice,
	    		mageHeraDeath)
	    		);
	    Node mageAresOrHera = new ChanceNode(137, "Vous décidez de parler avec Hephaistos. \nIl vous donne le nom du détenteur de l'écair. Vous n'en croyez pas vos oreilles...", 
	    		Arrays.asList(mageAresFight,
	    		mageHeraFight)
	    		);
	    Node mageHephaLost = new TerminalNode(138, "Hephaistos vous tue à l'aide de son marteau. Il ne reste plus rien de vous...");
	    Node mageHephaWin = new InnerNode(139, "Vous avez gagné le combat contre Hephaistos :) \nEn échange de votre bravoure, il vous livre le nom de son frère. ", Arrays.asList(mageAresFight));
	    Node mageHephaistosFight = new InnerNode(140, "Vous décidez de combattre Hephaistos.",
	    		Arrays.asList(mageHephaWin,
	    		mageHephaLost)
	    		);
	    Node mageHephaistosMeet = new DecisionNode(141, "Vous vous dirigez vers la forge, le territoire d'Hephaistos. Vous avez le choix entre lui demander de l'aide et le combattre. ", 
	    		Arrays.asList(mageAresOrHera,
	    		mageHephaistosFight)
	    		);
	    Node mageHeraHepha = new InnerNode(142, "Héra est touchée par votre sensibilité vis-à-vis de sa situation. \nElle n'avait jamais croisé un inconnu avec une âme aussi pure. \nEn pleurs, elle avoue que par amour ses fils ont décidé de la venger de Zeus.", Arrays.asList(mageHephaistosMeet));
	    Node mageAgreeHera = new InnerNode(143, "Vous êtes d'accord avec elle ! Elle n'a pas à subir l'adultère de Zeus !", Arrays.asList(mageHeraHepha));
	    Node mageDisagreeDeath = new TerminalNode(144, "Vous mourez empoisonné, seul,  dans ce labyrinthe de fleurs ensanglantées de votre propre sang... ");	    
	    
	    /// Fountain Path suite 
	    
	    // Nymphes
	    
	    Node mageHypnosis = new TerminalNode(145,"Les nymphes aquatiques vous offrent des friandises aux fleurs de lotus. \nVous ne voyez pas le temps passer. \nVous finnissez par être emprisonné dans une illusion sans fin. \nFIN");
	    Node mageNymphes = new InnerNode(146,"Vous vous retrouvez entouré de nymphes auqatiques.",Arrays.asList(mageHypnosis));
	    
	    
	    // Hera suite
	    
	    Node mageDisagreeMiracle = new InnerNode(147, "Une petite nymphe aquatique vous a suivi pendant tout votre périple et s'est pris d'affection pour vous ! \n Elle soigne tant bien que mal vos blessures. \n Elle vous ramène près d'une source d'eau où se trouvent d'autres nymphes. ", Arrays.asList(mageNymphes));
	    Node mageHeraKill = new ChanceNode(148,"Héra est en FURIEUSE ! Elle décide de lancer ses serpents sur vous. \nIls vous mordent et vous empoisonnent.", Arrays.asList(mageDisagreeDeath,mageDisagreeMiracle));
	    Node mageDisagreeHera = new InnerNode(149, "Vous n'êtes pas d'accord avec elle ! Bien que Zeus continue à courtiser d'autres femmes, c'est le privilège du Roi !", Arrays.asList(mageHeraKill));
	    
	   //Attention ! Risque de cycle ! 
	    Node mageHeraNotTalk = new InnerNode(150, "Vous décidez de ne pas parler à Héra. Elle fait bient trop peur ! Vous reborussez chemin...", Arrays.asList(mageThetis)); 
	    Node mageOpinionHera = new DecisionNode(151, "Héra vous explique sa situation : \nZeus, son mari, la trompe une fois encore. \nElle ne sait plus quoi faire pour l'empêcher de continuer. \nElle veut que Zeus souffre mais ne sait pas si c'est une bonne idée de s'attirer les foudres du dieu de la foudre en ce moment...",
	    		Arrays.asList(mageDisagreeHera,
	    		mageAgreeHera)
	    		); 
	    Node mageHeraTalk = new InnerNode(152, "Vous décidez de parler à Héra", Arrays.asList(mageOpinionHera));  
	    Node mageHeraMeet = new DecisionNode(153,"En avançant, vous remarquez que l'allée de fleurs menait en fait vers un labyrithe de hautes herbes. \nVous vous retrouvez face à une femme magnifique. \nSans aucun doute, il s'agit bien de Héra, la déesse du foyer.",
	    		Arrays.asList(mageHeraTalk,
	    		mageHeraNotTalk)
	    		); 
	    Node mageFlowerPath = new InnerNode(154, "Vous décidez de marcher vers l'allée de fleurs. ", Arrays.asList(mageHeraMeet));
	    Node mageHera = new InnerNode(155, "Héra", Arrays.asList(mageFlowerPath));
	    
	    // Suite posseidon
	    
	    Node magePosseidonWin = new ChanceNode(156,"Suite à votre victoire, Posséidon vous confie l'identité du voleur de foudre. \nIl s'agit de : ",
	    		Arrays.asList(mageHera,
	    		mageThetisCoupable));
	    Node magePosseidonLose = new TerminalNode(157, "Vous perdez contre Posséidon ! Pour punition contre cette affront, votre âme connaitra le tourment éternel.");
	    Node magePosseidonFight = new InnerNode(158,"Vous décidez de combattre Posseidon", 
	    		Arrays.asList(magePosseidonWin,
	    		magePosseidonLose)
	    		);
	    Node magePosseidonMood = new ChanceNode(159, "Posséidon est occupé à parler avec une autre divinité. \nIl pointe une direction pour que vous y aller. ",
	    		Arrays.asList(mageNymphes,
	    		mageHeraMeet));
	    Node magePosseidonTalk = new InnerNode(160,"Vous décidez de parler avec Posséidon.", Arrays.asList(magePosseidonMood));
	    Node magePosseidonMeet = new DecisionNode(161,"En avançant, vous vous retrouvez face à Posséidon, le dieu des Océans. \nDes rumeurs circulent que c'est lui qui détient l'éclair. \nGrâce à cette dernière, il pourrait descendre dans \nle monde des humains sans difficultés pour revoir son fils et sa femme \nque Zeus lui aurait interdit de voir...",
	    		Arrays.asList(magePosseidonTalk,
	    		magePosseidonFight
	    		)); 
	    Node mageFountainPath = new InnerNode(162, "Vous décidez de marcher vers la fontaine d'eau. ", Arrays.asList(magePosseidonMeet));
	    	    
	    
	    //// Library Path
	    
	    Node mageOutLibrary = new DecisionNode(163,"Vous vous faites jeter de la bibliothèque. Où allez vous maintenant ?", 
	    		Arrays.asList(mageFountainPath,
	    		mageFlowerPath));
	    Node mageJustAnOwl = new InnerNode(164,"C'était une simple chouette...Rien de surnaturel...", Arrays.asList(mageOutLibrary));
	    Node mageAthenaClue = new InnerNode(165, "Pour vous remercier de votre générosité, elle vous mène vers le coupable.", Arrays.asList(mageHephaistosMeet));
	    Node mageNotJustAnOwl = new InnerNode(166, "Il s'agissait d'Athéna déguisée !!", Arrays.asList(mageAthenaClue));
	    Node mageOwlMeta = new ChanceNode(167,"Vous donnez à manger à la chouette en espérant un miracle.", Arrays.asList(mageJustAnOwl, mageNotJustAnOwl));
	    Node mageOwlScream = new InnerNode(168,"L'oiseau cri. Un responsable arrive :(", Arrays.asList(mageOutLibrary));
	    Node mageOwlHungry = new InnerNode(169,"La chouette n'est pas à vous, pas besoin d'y faire attention.", Arrays.asList(mageOwlScream));
	    Node mageOwlFeed = new DecisionNode(170, "L'oiseau a l'air affamé. ", Arrays.asList(mageOwlMeta,mageOwlHungry));
	    Node mageOwlApproach = new InnerNode(171,"Vous décidez de vous rapprocher de la chouette pour l'admirer.", Arrays.asList(mageOwlFeed));
	    Node mageOwlNoApproach = new InnerNode(172,"Vous décidez de ne pas vous approcher de la chouette. Vous en avez peur...", Arrays.asList(mageOwlScream));
	    Node mageGoNextOwl = new DecisionNode(173,"Vous apercevez une chouette suspendue à un perchoir au fond de la salle. ", Arrays.asList(mageOwlApproach, mageOwlNoApproach));
	    Node mageNobody = new InnerNode(174, "Il n'y a personne ici...", Arrays.asList(mageOutLibrary));
	    Node mageLibraryEntry = new ChanceNode(175,"Vous entrez dans la bibliothèque.", Arrays.asList(mageNobody,mageGoNextOwl) );
	    
	    Node mage1 = new DecisionNode(100, "Ou commenceriez-vous vos recherches ? ",
	    		Arrays.asList(mageFountainPath,
	    				mageFlowerPath,
	    	    		mageLibraryEntry)
	    		);
        
        
	    
	    
	    
	    Event currentNode = null;
		
	    
	    
		switch(playerType) {
			    
			case "Humain":
				System.out.println("Vos recherches vous amènent jusqu'aux Enfers, le territoire d'Hades. \nPour entrer il vous faudra passer les serviteurs du roi des Enfers, notamment : \nCerberus et Charon. La première étape est Cerberus");
		    	currentNode = node1;
		    	break;
		    	
			case "Mage":
			   System.out.println("Vos recherches vous amènent jusqu'à l'Olympe, le territoire des Dieux. \nUn des Olympiens (Dieux siègeant à l'Olympe) serait le coupable de ce vol...\nMais qui ?");
			   currentNode = mage1;
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
	    	if(currentNode.equals(mageAchillesClemence)) {
	    		//ajouter pv
	    		player.setHp(player.getHp()+100);
	    	}
	    		    	
	    	
	    	if(!(currentNode.getDecoratedNode() instanceof DecisionNode) && !(currentNode.getDecoratedNode() instanceof ChanceNode) 
	    			&& !(currentNode.equals(sn6)) 
	    			&& !(currentNode.equals(sn9))
	    			&& !(((InnerNode) currentNode).getNodes().size() == 1) //InnerNodes with only one component in list nodes
	    			) {
		    	
	    		if(currentNode.equals(sn3)) {
		    		currentNode = currentNode.chooseNext(player, cerberus);
		    	}else if(currentNode.equals(sn4)) {
		    		currentNode = currentNode.chooseNext(player, charon);
		    	}else if(currentNode.equals(mageHephaistosFight)) {
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
		    	
		    	else {
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


	
    
			
			

