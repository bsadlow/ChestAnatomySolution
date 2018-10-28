import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import javax.swing.JLabel;

import javax.swing.BoxLayout;
import javax.swing.Box;


// For Testing
//import javax.swing.BorderFactory; 
//import java.awt.Color;
//container.setBorder(BorderFactory.createLineBorder(Color.black));


public class App{

	public static void main(String[] args){
	
		// Frame
		JFrame mainFrame = new JFrame("Chest Anatomy Solution");
		mainFrame.setSize(500,400);
		mainFrame.setResizable(true); 
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Panel 
		JPanel hierarchyPanel = new JPanel();
		hierarchyPanel.setLayout(new BoxLayout(hierarchyPanel, BoxLayout.Y_AXIS));

		// Test Data
		hierarchyPanel.add(CreateListItem("Chest", 0));
		hierarchyPanel.add(CreateListItem("Lungs", 1));
		hierarchyPanel.add(CreateListItem("Right Lung", 2));
		hierarchyPanel.add(CreateListItem("Superior Lobe", 3));
		hierarchyPanel.add(CreateListItem("Middle Lobe", 3));
		hierarchyPanel.add(CreateListItem("Inferior Lobe", 3));
		hierarchyPanel.add(CreateListItem("Left Lung", 2));
		hierarchyPanel.add(CreateListItem("Superior Lobe", 3));
		hierarchyPanel.add(CreateListItem("Middle Lobe", 3));
		hierarchyPanel.add(CreateListItem("Inferior Lobe", 3));
		hierarchyPanel.add(CreateListItem("Heart", 1));
		hierarchyPanel.add(CreateListItem("Left Ventricle", 2));
		hierarchyPanel.add(CreateListItem("Right Ventricle", 2));
		hierarchyPanel.add(CreateListItem("Left Atrium", 2));
		hierarchyPanel.add(CreateListItem("Right Atrium", 2));
		hierarchyPanel.add(CreateListItem("Septum", 2));

		mainFrame.add(hierarchyPanel);

		mainFrame.setVisible(true);

	}

	public static JPanel CreateListItem( String itemName, int numOfParents){
		
		JPanel container = new JPanel();
		container.setLayout(new BoxLayout(container, BoxLayout.X_AXIS));
		container.setAlignmentX(Component.LEFT_ALIGNMENT);
		
		for(int i = 0; i < numOfParents; i++ )
		{
			Component tab = Box.createRigidArea(new Dimension(20,0));
			container.add(tab);
		}

		JCheckBox checkBox = new JCheckBox();
		container.add(checkBox);

		JLabel label = new JLabel(itemName);
		container.add(label);

		return container;

	}



}