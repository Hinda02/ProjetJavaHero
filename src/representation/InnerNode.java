package representation;

import java.util.ArrayList;


import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import univers.tools.Item;
import univers.personage.*;
import univers.personage.Hero;

public class InnerNode extends Node{

	//protected attribute containing next possible nodes
	protected List<Event> nodes = new ArrayList<Event>();
	
	/**
	 * Constructor for class InnerNode
	 * @param id
	 * @param description
	 * @param nodes
	 */
	
	public InnerNode(int id, String description, List<Event> nodes) {
		super(id, description);
		
		for(Event node : nodes) {
			this.nodes.add(node);
		}
		
	}

	public List<Event> getNodes() {
		return nodes;
	}

	/**
	 * returns first next node
	 */
	@Override
	public Event chooseNext() {
		return this.nodes.get(0);
	}
	
	/**
	 * For 'obole' management
	 */
	@Override
	public Event chooseNext(Hero player) {
		if(player.getInventory().containsKey(Item.OboleOfCharon)) {
			return this.nodes.get(0);
		}else {
			return this.nodes.get(1);
		}
	}
	
	/**
	 * returns next node
	 * according to whether the player wins or loses the combat
	 */
	@Override
	public Event chooseNext(Hero player, Villain opponent) {
		
		//this.display();
			
		opponent.speak();
		System.out.println("Attaquez l'ennemi en répondant correctement aux calculs.");
		
		//_____________ The opponent's fighting section ____________
		//defines a runnable that executes the enemy's fight() method
    	Runnable oppFightRunnable = new Runnable() {
		    public void run() {
		        opponent.fight(player);
		    }
		};
		
		//a scheduled thread that executes the runnable every 10 seconds
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		executor.scheduleAtFixedRate(oppFightRunnable, 0, opponent.getAttackSpeed(), TimeUnit.SECONDS);
		
		//runnable code taken from: https://stackoverflow.com/questions/12908412/print-hello-world-every-x-seconds
		//___________________________________________________________
		
		int cptWRes = 0;
			
		while(player.isAlive() && opponent.isAlive() && cptWRes < 3) {
		
			//mathematical expressions are generated to symbolize 
			//a player's fight move
			int res = generateExp();
			
			//get the player's input
			Scanner myObj = new Scanner(System.in);
		    int response;
		    response = myObj.nextInt(); 
		    
		    //if the player's response to the equation is correct
		    //he fights
		    
		    if(res == response) {
		    	
		    	player.fight(opponent);		    	

		    }else {
		    	cptWRes++;
		    }
		}
		    
			
		if(player.isAlive() && cptWRes < 3) {
			executor.shutdown();
			return this.nodes.get(0);
		}else {
			executor.shutdown();
			return this.nodes.get(1);
		}
		
	    
	}
	
	/**
	 * generates a mathematical expression
	 * code inspired by Calculate() method
	 * on: https://www.geeksforgeeks.org/build-a-calculate-expression-game-in-java/
	 * @return int
	 */
	private int generateExp() {
		
		int num1 = new Random().nextInt(11); // 0 to 10 
        int num2 = new Random().nextInt(12); // 1 to 11 
        
        String operator = "+-*"; 
        int random_operator = new Random().nextInt(3); 
        
        System.out.println("(" + num1 + ") " + operator.charAt(random_operator) + " (" + num2 + ")");
        
        return switch (operator.charAt(random_operator)) { 
        case ('+') -> num1 + num2; 
        case ('-') -> num1 - num2; 
        case ('*') -> num1 * num2;  
        default -> 0; 
        };
        
	}
	
	/**
	 * returns the InnerNode's info
	 * @return String
	 */
	@Override
	public String toString() {
		
		String result = super.toString() + " \n Pr�decesseur de : " ;
		for(Event item : nodes) {
			result += "\n" + item.toString();
		}
		return result; 
		
	}
	
	/**
	 * compares two objects of type InnerNode
	 * @return boolean
	 */
	@Override
	public boolean equals(Object obj) {
		if(obj == this) {
			return true;
		}
		
		if (!(obj instanceof InnerNode)) {
			return false;
		}
		
		InnerNode innerNode = (InnerNode) obj;
		
		if(!super.equals(innerNode)) {
			return false;
		}
		
		for(int i =0; i < nodes.size(); i++) {
			if(nodes.get(i).equals(innerNode.nodes.get(i))) {
				return false; 
			}
			
		}
		return true;
	}

	@Override
	public Event getDecoratedNode() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public void setDecoratedNode(Event decoratedNode) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}
