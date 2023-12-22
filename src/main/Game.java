package main;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
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
	/**
	 * Constructor of class Game
	 * @param gamer
	 * @param pT
	 */
	public Game(Hero gamer, String pT) {
		player = gamer;
		playerType = pT;
	}


	/**
	 * returns the game's current node
	 * @return current node
	 */
	public Event getCurrentNode() {
		return currentNode;
	}

	/**
	 * sets the game's current node to the value put in entry
	 * @param currentNode
	 */
	public void setCurrentNode(Event currentNode) {
		this.currentNode = currentNode;
	}


	/**
	 * returns the player's info during this game
	 * @return player's info
	 */
	public Hero getPlayer() {
		return player;
	}


	/**
	 * sets the player's info to the value put in parameter 
	 * @param player
	 */
	public void setPlayer(Hero player) {
		this.player = player;
	}


	/**
	 * returns the player type
	 * @return the player type (human,angel,...)
	 */
	public String getPlayerType() {
		return playerType;
	}


	/**
	 * sets the player type to the value put in parameter 
	 * @param playerType
	 */
	public void setPlayerType(String playerType) {
		this.playerType = playerType;
	}


	/**
	 * returns the game's information
	 */
	@Override
	public String toString() {
		String result = "Informations sur cette partie : \n - Noeud actuel : " + currentNode + "\nInformations sur le joueur : " + player ;
		return result;
	}

	/**
	 * Compares two objects of class Game
	 * @return true if they are the same, false if not
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Game)) 
			return false;
		Game other = (Game) obj;
		if(this.currentNode.equals(other.currentNode) && (this.player.equals(other.player)) && (this.playerType.equals(other.playerType))  ) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
}

	
    
			
			

