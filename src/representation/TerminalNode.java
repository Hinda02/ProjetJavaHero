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
	 * @return Event
	 */
	@Override
	public Event chooseNext() {
		return (Event)this;
	}
	
	/**
	 * returns this same node
	 * @return Event
	 */
	@Override
	public Event getDecoratedNode() {
		// TODO Auto-generated method stub
		return this;
	}
	
	/**
	 * used for the ImageNode and SoundNode
	 * @return void
	 */
	@Override
	public void setDecoratedNode(Event decoratedNode) {
		
	}
}
