package tic_tac_toe;

import java.awt.Color;

//A Nought represents an individual piece
public interface Nought {

	//Returns X/Y Coordinates
	int getX();
	int getY();
	
	public boolean isHighlighted();
	public boolean isEmpty();
	Color getColor();
	
	void addListener(Listener l);
	void removeListener(Listener l);

	default String getCoordString() {
		return "(" + getX() + ", " + getY() + ")";
	}
	
	
}
