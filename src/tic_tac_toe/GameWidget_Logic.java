package tic_tac_toe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameWidget_Logic  extends JPanel implements ActionListener, Listener{
	
	private enum Player {BLACK, WHITE};


	private NoughtBoard_UI _board;		//This defines the playing area
	private JLabel _message;		//Creates a JLabel UI element for message to the user
	private boolean _gameWon; 		//Indicates if the game has been won?
	private boolean _gameDraw;		//Indicates if the game has been drawn
	
	private Player _nextPlayer;	/* Identifies who has next turn. */


public GameWidget_Logic() {
		
		//Creates the NoughtBoard_UI Element and message on JLabel
		_board = new NoughtBoard_UI(3,3);
		_message = new JLabel();
		
		setLayout(new BorderLayout());
		add(_board, BorderLayout.CENTER); //Sets the board to the center

		//This creates a subpanel for the Reset Button and corresponding message
		JPanel resetMessagePanel = new JPanel();
		resetMessagePanel.setLayout(new BorderLayout());

		//This defines the Reset Button
		JButton reset_button = new JButton("Restart");
		reset_button.addActionListener(this);
		resetMessagePanel.add(reset_button, BorderLayout.EAST);
		resetMessagePanel.add(_message, BorderLayout.CENTER);
		
		//Ensures the reset panel is at the bottom of the layout
		add(resetMessagePanel, BorderLayout.SOUTH);

		_board.addListener(this);

	}

//Method for Resetting the Game completely
	private void resetGame() {

		// Iterates through every Nought in the board and clears it. Sets colour to
		// black.
		for (Nought s : _board) {
			s.clear();
			s.setColor(Color.BLACK);
		}

		// Resets GameLogic Boolean fields.
		_gameWon = false;
		_gameDraw = false;
		_nextPlayer = Player.WHITE;

		// Reset Message to Default
		_message.setText("Welcome to TicTacToe. White to play");
	}
	
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
