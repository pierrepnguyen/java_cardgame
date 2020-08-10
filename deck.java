import java.io.File;
import java.io.IOException;
import java.util.Random;
import javax.imageio.ImageIO;

public class deck {
	public static card[] deck;
	public static int currentCard;

	public deck() throws IOException {
		deck = new card[52];
		int i = 0;
		//for loop through 4 suits
		for (card.Suit s : card.Suit.values()){
			for (card.Rank r : card.Rank.values()){
				deck[i] = new card (r.getRank(),
														s.getSuit(),
														r.getValue(),
														ImageIO.read(new File("cards/" + r.getImg() + s.getImgVal() + ".gif")));                   
				i++;
			}
		}
		currentCard = 0;
	}

  // Shuffle deck method
	public void shuffle() {
		Random rand = new Random();
		card temp;
    
		for(int i = 0; i < deck.length; i++) {
      int num = rand.nextInt(deck.length - 1);
			temp = deck[i];
			deck[i] = deck[num];
			deck[num] = temp;
		}
		currentCard = 0;
	}

	public static card deal(){
		if (currentCard < deck.length) {
			card cRValue = deck[currentCard];
			currentCard++;
			return cRValue;
		} else{
			System.out.println("Out of cards error");
			return null;
		}
	}
}