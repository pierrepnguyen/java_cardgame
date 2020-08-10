import java.awt.image.BufferedImage;

public class card {
	private BufferedImage cardImage;
	private String rank;
	private int val;
	private String suit;

	public static enum Suit{
		SPADES   ("Spades",  "s"),
		CLUBS    ("Clubs",   "c"),
		DIAMONDS ("Diamonds","d"),
		HEARTS   ("Hearts",  "h");

		private final String suit;
		private final String img;

		//Suit constructor
		Suit(String suit, String img){
			this.suit = suit;
			this.img = img;
		}

		//Returns suit of Card object
		public String getSuit(){
			return this.suit;
		}
		//Return image abbreviation letter
		public String getImgVal(){
			return this.img;
		}
	}

	public static enum Rank {
		ACE     ("Ace", 1, "a"),
		TWO     ("Two", 2, "2"),
		THREE   ("Three", 3, "3"),
		FOUR    ("Four", 4, "4"),
		FIVE    ("Five", 5, "5"),
		SIX     ("Six", 6, "6"),
		SEVEN   ("Seven", 7, "7"),
		EIGHT   ("Eight", 8, "8"),
		NINE    ("Nine", 9, "9"),
		TEN     ("Ten", 10, "t"),
		JACK    ("Jack", 11, "j"),
		QUEEN   ("Queen", 12, "q"),
		KING    ("King", 13, "k");

		private final String rank;
		private final int val;
		private final String img;

		//constructor of rank
		Rank(String rank, int val, String img){
			this.rank = rank;
			this.val = val;
			this.img = img;
		}

		//Returns numeric value of Card object
		public int getValue(){
			return this.val;
		}
		
		//Returns String rank of card object
		public String getRank(){
			return this.rank;
		}

		//Returns image abbreviation letter
		public String getImg(){
			return this.img;
		}
	}

	//card constructor
	public card(String rank, String suit, int val, BufferedImage cardImage) {
		this.rank = rank;
		this.suit = suit;
		this.val = val;
		this.cardImage = cardImage;
	}

	//Returns string values from 
	public String toString(){
		return rank + " of " + suit;
	}

	//Returns image for a card
	public BufferedImage getCardImage() {
		return cardImage;
	}
}