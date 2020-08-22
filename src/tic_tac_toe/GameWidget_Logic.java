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
			s.setColour(Color.BLACK);
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

		resetGame();
		
	}


	@Override
	public void clicked(Nought n) {

		// If the Game has already been won, Nothing will be done.
		if (_gameWon) {
			return;
		}

		// Creates local variables for players
		String player_name = null;
		String next_player_name = null;
		Color player_color = null;

		// Game Logic

		// Checks to see who next player is and updates other variables accordingly
		if (_nextPlayer == Player.BLACK) {
			player_color = Color.BLACK;
			player_name = "Black";
			next_player_name = "White";
			_nextPlayer = Player.WHITE;
		} else {
			player_color = Color.WHITE;
			player_name = "White";
			next_player_name = "Black";
			_nextPlayer = Player.BLACK;
		}
		
		// Makes adjustments to the Nought if Empty
		// Set it to the colour of the player who clicked it and toggle it.
		if (n.isEmpty()) {
			n.setColour(player_color);
			n.toggle();

		} else {

			// Otherwise adjust GameLogic accordingly
			if (_nextPlayer == Player.BLACK) {
				player_color = Color.WHITE;
				player_name = "White";
				next_player_name = "White";
				_nextPlayer = Player.WHITE;

			} else {

				player_color = Color.BLACK;
				player_name = "Black";
				next_player_name = "Black";
				_nextPlayer = Player.BLACK;

			}
		}
		
		//TODO Need to check if Win is achieved at some point here

		if (n.isEmpty()) {
			_message.setText(next_player_name + " to play.");
		} else {
			if (_gameWon) {
				_message.setText(player_name + " wins!");
			} else {

				if (checkDraw() && (_gameWon == false)) {
					_message.setText(" Draw game.");

				} else {

					_message.setText(next_player_name + " to play.");

				}
			}
		}
	}


	// Method that checks if the Game is in a DRAW state
	private boolean checkDraw() {

		// Setting up local variables to count the number of respective pieces
		int countBlacks = 0;
		int countWhites = 0;

		// Iterates through and counts
		for (int x = 0; x < 3; x++) {

			for (int y = 0; y < 3; y++) {

				if (_board.getAt(x, y).getColor() == Color.WHITE) {
					countWhites++;
				}

				else if (_board.getAt(x, y).getColor() == Color.BLACK && (_board.getAt(x, y).isEmpty() == false)) {

					countBlacks++;
				}

			}

			// TODO For sytemLog, remove at some point.
			System.out.println("Blacks " + countBlacks);
			System.out.println("Whites " + countWhites);

			if (countWhites == 5 && countBlacks == 4) {

				_gameDraw = true;
				_gameWon = false;

				return true;

			}

		}
		return false;

	}

	@Override
	public void entered(Nought n) {
		
		if (_gameWon) {
			return;
		}
		n.highlight();
		
	}
	
	@Override
	public void exited(Nought n) {
		n.unhighlight();		
	}
	
	

}
