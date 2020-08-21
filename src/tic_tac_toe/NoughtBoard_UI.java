package tic_tac_toe;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JPanel;

public class NoughtBoard_UI extends JPanel implements NoughtBoard {

	// Set Constants
	private static final int DEFAULT_SCREEN_WIDTH = 500;
	private static final int DEFAULT_SCREEN_HEIGHT = 500;
	private static final Color DEFAULT_BACKGROUND_LIGHT = new Color(0.8f, 0.8f, 0.8f);
	private static final Color DEFAULT_BACKGROUND_DARK = new Color(0.5f, 0.5f, 0.5f);

	private static final Color DEFAULT_SPOT_COLOR = Color.BLACK;
	private static final Color DEFAULT_HIGHLIGHT_COLOR = Color.YELLOW;

	// Effectively a matrix of positions for the naughts. 
	// The 2D-Array acts as the board.
	private Nought[][] _board;

	//Getters
	public int getWidth() {

		return _board.length;
	}

	public int getHeight() {

		return _board[0].length;
	}

	public Nought getAt(int x, int y) {

		return _board[x][y];
	}

}
