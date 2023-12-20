package representation;

import java.io.File;
import javax.sound.sampled.*;

import univers.personage.Hero;
import univers.personage.Villain;

public class SoundNode extends Decorator{

    private String soundPath;
    
    public SoundNode(Event decoratedNode, String soundPath) {
        this.decoratedNode = decoratedNode;
        this.soundPath = soundPath;
    }
	
	@Override
	public void display() {
		//playSound();
        decoratedNode.display();
		
	}

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

	@Override
	public Event chooseNext() {
		playSound();
		return decoratedNode.chooseNext();
	}

	@Override
	public Event chooseNext(Hero hero) {
		playSound();
		return decoratedNode.chooseNext(hero);
	}

	@Override
	public Event chooseNext(Hero hero, Villain villain) {
		playSound();
		return decoratedNode.chooseNext(hero, villain);
	}

}
