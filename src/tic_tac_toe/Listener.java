package tic_tac_toe;

public interface Listener {

	void spotClicked(Nought n);
	void spotEntered(Nought n);
	void spotExited(Nought n);
}
