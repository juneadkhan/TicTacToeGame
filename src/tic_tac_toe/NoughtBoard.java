package tic_tac_toe;

import java.util.Iterator;

public interface NoughtBoard extends Iterable<Nought> {

		int getSpotWidth();
	 
		int getSpotHeight();

		Nought getSpotAt(int x, int y);

		void addSpotListener(Listener listener);

		void removeSpotListener(Listener listener);

		Iterator<Nought> iterator();

	}