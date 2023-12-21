package representation;

import univers.personage.Hero;
import univers.personage.Villain;
import univers.tools.Item;

public interface Event {
	
	public void display();
	public Event chooseNext();
	public Event chooseNext(Hero hero, Item item);
	public Event chooseNext(Hero hero, Villain villain);
	public Event getDecoratedNode();
	public void setDecoratedNode(Event decoratedNode);
}
