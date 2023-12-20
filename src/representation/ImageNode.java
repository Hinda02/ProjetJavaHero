package representation;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import univers.personage.Hero;
import univers.personage.Villain;


public class ImageNode extends Decorator {
	
	private String path;
    
    public ImageNode(Event decoratedNode, String imagePath) {
        this.decoratedNode = decoratedNode; 
        this.path = imagePath;
    }

	
	@Override
	public void display() {
		//closeImage();
        decoratedNode.display(); 
    }

	@Override
	public Event chooseNext() {
		showImage();
		return decoratedNode.chooseNext();
	}
	
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
	    	
	    	image = new ImageIcon(path);
	    	pictureLabel.setIcon(image);
	    	picturePanel.add(pictureLabel);
	    	
	    	window.setVisible(true);
    	} catch (Exception e) {
    		e.printStackTrace();
    }
    }
	
	/*private void closeImage() {
        if (window != null && window.isDisplayable()) { // si rien ne s'affiche mais que ce n'est pas null
            window.dispose(); // tout enlever
        }
    }*/


	@Override
	public Event chooseNext(Hero hero, Villain villain) {
		showImage();
		return decoratedNode.chooseNext(hero,villain);
	}


	@Override
	public Event chooseNext(Hero player) {
		showImage();
		return decoratedNode.chooseNext(player);
	}

}
