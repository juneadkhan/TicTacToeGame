package tic_tac_toe;

import java.util.Iterator;

public interface NoughtBoard extends Iterable<Nought> {
	
	int getWidth();
	 
	int getHeight();

	Nought getAt(int x, int y);
	
	void addListener(Listener listener);
	
	void removeListener(Listener listener);
	
	Iterator<Nought> iterator();





}
