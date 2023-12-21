package representation;

import java.io.File;
import javax.sound.sampled.*;

import univers.personage.Hero;
import univers.personage.Villain;

public class SoundNode extends Decorator{

    private String soundPath;
    
    /**
     * Constructor of class SoundNode
     * @param decoratedNode
     * @param soundPath
     */
    public SoundNode(Event decoratedNode, String soundPath) {
        super(decoratedNode);
        this.soundPath = soundPath;
    }
	
    /**
     * displays the description of the decorated node
     */
	@Override
	public void display() {
        decoratedNode.display();
		
	}
	
	/**
	 *  Method that displays the node's sound
	 */
	private void playSound() {
		
		try {
			
            File file = new File(soundPath);
            // AudioInputStream
            AudioInputStream sound = AudioSystem.getAudioInputStream(file);
            // Clip
            Clip clip = AudioSystem.getClip();
            clip.open(sound);
            clip.start();
        }
        catch (Exception e) {
        	
        	e.printStackTrace(); 
		}
    	
		
	}
	
	/**
	 * Method that returns the next node
	 * @return Event
	 */
	@Override
	public Event chooseNext() {
		playSound();
		return decoratedNode.chooseNext();
	}
	
	/**
	 * returns the next node according to whether 
	 * the player's inventory contains a certain item or not
	 * @param player
	 * @return Node
	 */
	@Override
	public Event chooseNext(Hero hero) {
		playSound();
		return decoratedNode.chooseNext(hero);
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
		playSound();
		return decoratedNode.chooseNext(hero, villain);
	}
	
	/**
	 * returns the SoundNode's info
	 * @return String
	 */
	@Override
	public String toString() {
		return "SoundNode [decoratedNode = "+ decoratedNode + " , soundPath=" + soundPath + "]";
	}
	
	/**
	 * compares two objects of type ImageNode
	 * @return boolean
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof SoundNode))
			return false;
		SoundNode soundNode = (SoundNode) obj;
		if (!(super.equals(soundNode)) && !(this.soundPath.equals(soundNode.soundPath)))
			return false;
		return true;
	}

}
