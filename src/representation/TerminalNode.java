package representation;

public class TerminalNode extends Node {
	
	/**
	 * Constructor for class TerminalNode
	 * @param id
	 * @param description
	 */
	public TerminalNode(int id, String description) {
		super(id, description);
	}
	
	/**
	 * returns this same node
	 */
	@Override
	public Event chooseNext() {
		return (Event)this;
	}

	@Override
	public Event getDecoratedNode() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public void setDecoratedNode(Event decoratedNode) {
		
	}
}
