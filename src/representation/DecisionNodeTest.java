package representation;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class DecisionNodeTest {

	@Test
	void testChooseNext() {
		List<Event> nodes = new ArrayList<Event>();
        nodes.add(new TerminalNode(1, "Terminal Node"));
        nodes.add(new TerminalNode(2, "Terminal Node"));
        DecisionNode decisionNode = new DecisionNode(0, "Decision node", nodes);

        String input = "1\n"; //as if we put 1 in the console
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        
        assertEquals(decisionNode.chooseNext(), nodes.get(0));
	}

}
