package tic_tac_toe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameWidget_Logic  extends JPanel implements ActionListener, Listener{

	private NoughtBoard_UI _board;		//This defines the playing area
	private JLabel _message;		//Creates a JLabel UI element for message to the user
	private boolean _gameWon; 		//Indicates if the game has been won?
	private boolean _gameDraw;		//Indicates if the game has been drawn

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void clicked(Nought n) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void entered(Nought n) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void exited(Nought n) {
		// TODO Auto-generated method stub
		
	}
	
	

}
