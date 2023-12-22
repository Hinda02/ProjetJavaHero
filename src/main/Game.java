package main;

import java.io.Serializable;
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
import univers.personage.Angel;
import univers.personage.Demon;
import univers.personage.General;
import univers.personage.Hero;
import univers.personage.Human;
import univers.personage.Mage;
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

public class Game implements Serializable{
	
	private Event currentNode = null;
	private Hero player = null;
	private String playerType = null;
	


	public Game(Hero gamer, String pT) {
		
		
		player = gamer;
		playerType = pT;
		
		
	}



	public Event getCurrentNode() {
		return currentNode;
	}



	public void setCurrentNode(Event currentNode) {
		this.currentNode = currentNode;
	}



	public Hero getPlayer() {
		return player;
	}



	public void setPlayer(Hero player) {
		this.player = player;
	}



	public String getPlayerType() {
		return playerType;
	}



	public void setPlayerType(String playerType) {
		this.playerType = playerType;
	}
}

	
    
			
			

