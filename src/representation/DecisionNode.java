package representation;

import java.util.List;
import java.util.Scanner;

//class inherits from InnerNode
public class DecisionNode extends InnerNode{

	/**
	 * Constructor for class DecisionNode
	 * @param id
	 * @param description
	 * @param nodes
	 */
	public DecisionNode(int id, String description, List<Event> nodes) {
		super(id, description, nodes);
	}

	/**
	 * returns the next node
	 * according to the player's choice
	 */
	@Override
	public Event chooseNext() {
			
			int i = 0;
			
			System.out.println("Saisissez le num�ro de votre choix:");
			
	        for(Event item : this.nodes) {
              i++;
              System.out.println();
              System.out.print(i + ": " );
              Node n = (Node)item.getDecoratedNode();
              System.out.println(n.getDescription());
	        }	
		
	        //get the player's input
		    Scanner myObj = new Scanner(System.in);
		    int node;
		    
		    node = myObj.nextInt(); 
		    
		    return this.nodes.get(node-1);
			
	}
}
