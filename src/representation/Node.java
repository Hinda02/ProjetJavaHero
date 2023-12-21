package representation;

import univers.personage.*;

public abstract class Node implements Event{
	
	//private attributes
	private int id;
	private String description;
	
	/**
	 * Constructor for class Node
	 * @param id
	 * @param description
	 */
	public Node(int id, String description) {
		
		this.id = id;
		this.description = description;
	}
	

	/**
	 * Method that displays node description
	 */
	public void display() {
		
		System.out.println(this.description);
	}
	
	/**
	 * Abstract method that returns the next node
	 * @return Node
	 */
	public abstract Event chooseNext();
	
	/**
	 * Method that returns the next node
	 * used for combat classes (InnerNode)
	 * @param player
	 * @param opponent
	 * @return Event
	 */
	public Event chooseNext(Hero player, Villain opponent) {
		return null;
	}
	
	/**
	 * returns the next node according to whether 
	 * the player's inventory contains a certain item or not
	 * @param player
	 * @return Node
	 */
	public Event chooseNext(Hero player) {
		return null;
	}
	
	/**
	 * returns the node's description
	 * @return String
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * returns the node's info
	 * @return String
	 */
	@Override
	public String toString() {
		String result = "Node [" + id + " ," + description + "] " ;
		return result;
		
	}
	
	/**
	 * compares two objects of type Node
	 * @return boolean
	 */
	@Override
	public boolean equals(Object obj) {
		if(obj == this) {
			return true;
		}
		
		if (!(obj instanceof Node)) {
			return false;
		}
		
		Node node = (Node) obj;
		
		if((this.id == node.id) && (this.description == node.description)) {
			return true;
		}else {
			return false;
		}
	}


}
