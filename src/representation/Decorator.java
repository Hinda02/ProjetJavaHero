package representation;

public abstract class Decorator implements Event{

	protected Event decoratedNode;

	public Event getDecoratedNode() {
		return decoratedNode;
	}

	public void setDecoratedNode(Event decoratedNode) {
		this.decoratedNode = decoratedNode;
	}
}
