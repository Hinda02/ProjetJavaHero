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
        //savedGamesList = new JList<Game>(listModel);
        //savedGamesList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        label = new JLabel("Selected Item:");

        saveButton = new JButton("Save");
        loadButton = new JButton("Load");

        // Create a main panel with GridLayout
        JPanel mainPanel = new JPanel(new GridLayout(3, 1));

        // Add components to the main panel
        mainPanel.add(new JScrollPane(savedGamesList));
        mainPanel.add(label);

        // Create a panel for buttons with FlowLayout
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(saveButton);
        buttonPanel.add(loadButton);
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
					System.out.println("HELP");
				}
            }
        });

        loadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                	Game newGame = (Game)Serializer.deserialize("game.ser");
				} catch (Exception e2) {
					System.out.println("HELP2");
				}
            }
        });

        // Add list selection listener
        //savedGamesList.addListSelectionListener(e -> updateSelectedLabel());
    }

    

    /*private void updateSelectedLabel() {
        String selectedItem = itemList.getSelectedValue();
        selectedLabel.setText("Selected Item: " + (selectedItem != null ? selectedItem : ""));
    }*/

    public void display() {
        // Make the frame visible
        frame.setVisible(true);
    }
    
    
    
    
    
    
    
    
    /*private void addItem() {
    String newItem = JOptionPane.showInputDialog(frame, "Enter item:");
    if (newItem != null && !newItem.trim().isEmpty()) {
        listModel.addElement(newItem);
    }
}

private void removeItem() {
    int selectedIndex = itemList.getSelectedIndex();
    if (selectedIndex != -1) {
        listModel.remove(selectedIndex);
    }
}*/

    
}

