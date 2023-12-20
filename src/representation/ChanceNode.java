package representation;

import java.util.List;
import java.util.Random;

//Class inherits from InnerNode
public class ChanceNode extends InnerNode{

	/**
	 * Constructor for class ChanceNode
	 * @param id
	 * @param description
	 * @param nodes
	 */
	public ChanceNode(int id, String description, List<Event> nodes) {
		super(id, description, nodes);
	}
	
	/**
	 * returns a random node from in between 2
	 */
	@Override
	public Event chooseNext() {
			
			
        Random rand = new Random();
   
        // Generate random integers in range 0 to nodes length-1
        int randNode = rand.nextInt(this.nodes.size());
        
        while(this.nodes.get(randNode) == null) {
        	randNode = rand.nextInt(this.nodes.size());
        }
        
        return this.nodes.get(randNode);
			
	}

	
}
