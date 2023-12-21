package representation;

public abstract class Decorator implements Event{

	protected Event decoratedNode;
	
	/**
	 * Constructor of Decorator class
	 */
	public Decorator(Event decoratedNode) {
		this.decoratedNode = decoratedNode;
	}

	/**
	 * returns the decorated node
	 * @return Event
	 */
	public Event getDecoratedNode() {
		return decoratedNode;
	}
	
	/**
	 * modifies the value of the decorated node
	 * @return void 
	 */
	public void setDecoratedNode(Event decoratedNode) {
		this.decoratedNode = decoratedNode;
	}
	
	/**
	 * returns the decorator's info
	 * @return String
	 */
	@Override
	public String toString() {
		return "Decorator [decoratedNode = " + decoratedNode + "]";
	}

	
	/**
	 * compares two objects of type Decorator
	 * @return boolean
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Node))
			return false;
		Decorator deco = (Decorator) obj;
		if((this.decoratedNode == deco.decoratedNode)) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
}
