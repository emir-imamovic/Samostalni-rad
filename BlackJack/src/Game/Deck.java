package Game;


public class Deck{
	private Card [] cards = new Card [53];
	private int counter;
	
	public Card [] getCards(){
		return cards;
	}
	public int getBrojac(){
		return counter;
	}
	
	public Deck() {

		for ( int i = 0; i < 53; i++) {

		cards[i] = new Card(i);
		}
		
		mixingCards();
	}
	
	public String toString() {

		String cardsToString = "";

		for (int i = 0; i < 53; i++) {

		cardsToString = cardsToString + (cards[i].toString());

		}

		return cardsToString;

		}

	public void mixingCards(){
		Card temp;
		for (int i = 0; i < cards.length; i++){
			int first = (int)(Math.random() * 52); 
			int second = (int)(Math.random() * 52);
			temp = cards[first];
			cards[first] = cards[second];
			cards[second] = temp; 
		}
	} 
public Card getNext(){
	if (counter+1 < 52){
	return cards[counter++];
	}
	else {
		return null;
	}
	
}
}
