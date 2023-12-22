package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameGUI {

    private JFrame frame;
    private JList<Game> savedGamesList;
    private JLabel label;
    private JButton saveButton, loadButton, newGameBtn;
    private Game game = null;

    public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public GameGUI() {
		
        // Set up the frame
        frame = new JFrame("Game GUI");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create components
        
        label = new JLabel("Welcome to Mythology Hero Game ! ");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        Font font = new Font("Arial", Font.ROMAN_BASELINE, 15);
        label.setFont(font);
        
        // The 3 buttons displayed
        saveButton = new JButton("Save");
        loadButton = new JButton("Load");
        newGameBtn = new JButton("New Game");

        // Create a main panel with GridLayout
        JPanel mainPanel = new JPanel(new GridLayout(3, 1));
        //mainPanel.setBackground(Color.black);

        // Add components to the main panel
        mainPanel.add(new JScrollPane(savedGamesList));
        mainPanel.add(label);

        // Create a panel for buttons with FlowLayout
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(saveButton);
        buttonPanel.add(loadButton);
        buttonPanel.add(newGameBtn);
        mainPanel.add(buttonPanel);

        // Add the main panel to the frame
        frame.add(mainPanel);

        // Add action listeners to buttons
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
					Serializer.serialize(game, "game.ser");
					
				} catch (Exception e2) {
					System.out.println("Erreur: impossible de sauvegarder la partie de jeu en cours.");
				}
            }
        });

        loadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                	
                	Game newGame = (Game)Serializer.deserialize("game.ser");
                	Main.gamePlay(newGame);
                	
				} catch (Exception e2) {
					System.out.println("Erreur: impossible de charger l'instance de jeu.");
				}
            }
        });
        
     
        newGameBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                	loadButton.setEnabled(true);
					Main.newGame();
					
				} catch (Exception e2) {
					System.out.println("Erreur: impossible de lancer une nouvelle partie.");
				}
            }
        });

    }

    /**
     * Makes the frame visible
     */
    public void display() {
        frame.setVisible(true);
    }
   
}

