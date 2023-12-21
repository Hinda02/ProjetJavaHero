package representation;

import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import univers.personage.Hero;
import univers.personage.Villain;
import univers.tools.Item;


public class ImageNode extends Decorator {
	
	private String imagePath;
    
	/**
	 * Constructor of ImageNode class
	 * @param decoratedNode
	 * @param imagePath
	 */
    public ImageNode(Event decoratedNode, String imagePath) {
        super(decoratedNode); 
        this.imagePath = imagePath;
    }

	/**
	 * displays the information about the decorated node
	 */
	@Override
	public void display() {
        decoratedNode.display(); 
    }
	
	/**
	 * Method that displays the node's image
	 */
	private void showImage() {
    	try {
			JFrame window;
	    	Container con;
	    	JPanel picturePanel;
	    	JLabel pictureLabel;
	    	ImageIcon image;
	    	
	    	window = new JFrame();
	    	window.setSize(800,600);
	    	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	window.getContentPane().setBackground(Color.black);
	    	window.setLayout(null);
	    	con = window.getContentPane();
	    	
	    	picturePanel = new JPanel();
	    	picturePanel.setBounds(0, -10, 800, 600);
	    	picturePanel.setBackground(Color.black);
	    	con.add(picturePanel);
	    	
	    	pictureLabel = new JLabel();
	    	
	    	image = new ImageIcon(imagePath);
	    	pictureLabel.setIcon(image);
	    	picturePanel.add(pictureLabel);
	    	
	    	window.setVisible(true);
    	} catch (Exception e) {
    		e.printStackTrace();
    }
    }
	/**
	 * Method that returns the next node
	 * @return Event
	 */
	@Override
	public Event chooseNext() {
		showImage();
		return decoratedNode.chooseNext();
	}
	
	/**
	 * Method that returns the next node
	 * used for combat classes (InnerNode)
	 * @param player
	 * @param opponent
	 * @return Event
	 */
	@Override
	public Event chooseNext(Hero hero, Villain villain) {
		showImage();
		return decoratedNode.chooseNext(hero,villain);
	}

	/**
	 * returns the next node according to whether 
	 * the player's inventory contains a certain item or not
	 * @param player
	 * @return Node
	 */
	@Override
	public Event chooseNext(Hero player, Item item) {
		showImage();
		return decoratedNode.chooseNext(player, item);
	}
	
	/**
	 * returns the ImageNode's info
	 * @return String
	 */
	@Override
	public String toString() {
		return "ImageNode [decoratedNode = "+ decoratedNode + " , imagePath=" + imagePath + "]";
	}
	
	/**
	 * compares two objects of type ImageNode
	 * @return boolean
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof ImageNode))
			return false;
		ImageNode imageNode = (ImageNode) obj;
		if (!(super.equals(imageNode)) && !(this.imagePath.equals(imageNode.imagePath)))
			return false;
		return true;
	}
	
	
}
