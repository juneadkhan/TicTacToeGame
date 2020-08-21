package tic_tac_toe;

import java.util.Iterator;

public class NoughtBoard_Iterator {
	private NoughtBoard _board;
	int _x;
	int _y;

	public NoughtBoard_Iterator(NoughtBoard board) {
		_board = board;
		_x = 0;
		_y = 0;
	}

	public boolean hasNext() {

		return (_y < _board.getHeight());
	}

	public Nought next() {
		Nought tempNought = _board.getAt(_x, _y);
		if (_x < _board.getWidth() - 1) {
			_x++;
		} else {
			_x = 0;
			_y++;
		}
		return tempNought;
	}

}