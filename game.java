import java.io.IOException;

public class game {
	public static deck deck;

	public static void main(String[] args) throws IOException {
		deck = new deck();
		deck.shuffle();
		new gameGUI();
	}
}