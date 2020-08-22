package tic_tac_toe;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

//Author: Junead Khan

public class Main_TicTacToe {;
	public static void main(String[] args) {
		
		//Creates the main UI Window for the program to run
		JFrame mainWindow_UI = new JFrame();
		mainWindow_UI.setTitle("TicTacToe");
		mainWindow_UI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		//Creates the main panel for content
		JPanel topPanel = new JPanel();
		topPanel.setLayout(new BorderLayout());
		mainWindow_UI.setContentPane(topPanel);

		GameWidget_Logic mainWidget = new GameWidget_Logic();
		topPanel.add(mainWidget, BorderLayout.CENTER);
	
		//This packs the main frame and sets it to be visible
		mainWindow_UI.pack();
		mainWindow_UI.setVisible(true);		
	}

}
