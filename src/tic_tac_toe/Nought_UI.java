package tic_tac_toe;

import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.BorderFactory;

public class Nought_UI extends JPanel implements Nought, MouseListener {

	// Coordinates for Nought_UI_Element Object
	private int _x;
	private int _y;

	// Colours for Nought_UI_Element Object
	private Color _baseColour;
	private Color _highlightColour;

	// Boolean Control Variables
	private boolean _isEmpty;
	private boolean _isHighlighted;
	
	
	private NoughtBoard _board;
	private List<Listener> _listeners;


	// Constructor for Nought_UI_Element
	public Nought_UI(int x, int y, Color backgroundColour, Color originalColour,
			Color highlightColour, NoughtBoard board) {

		_x = x;
		_y = y;

		_baseColour = originalColour;
		_highlightColour = highlightColour;

		_isEmpty = true;
		_isHighlighted = false;
		
		_board = board;
		
		_listeners = new ArrayList<Listener>();
		
		addMouseListener(this);


		// Sets background to the input backgroundColour
		setBackground(backgroundColour);

	}

	// Getter for X Component
	public int getX() {

		return _x;
	}

	// Getter for Y Component
	public int getY() {

		return _y;
	}

	// Boolean Control Variables Getters
	public boolean isHighlighted() {
		return _isHighlighted;
	}

	public boolean isEmpty() {
		return _isEmpty;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
