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
	
	default void toggleHighlight() {
		if (isHighlighted()) {
			unhighlight();
		} else {
			highlight();
		}
	}

	default String getCoordString() {
		return "(" + getX() + ", " + getY() + ")";
	}
	void clear();
	void setColour(Color colour);
	void highlight();
	void unhighlight();
	
	
}
