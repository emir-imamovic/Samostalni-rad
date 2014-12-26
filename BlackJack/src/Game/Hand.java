package Game;

public class Hand {
	private Card [] hand;
	private int counter;
	private int numOfAses;
	private int cardSum;

	public Hand () {
		this.counter = 0;
		this.numOfAses = 0;
		this.cardSum = 0;
		this.hand = new Card[11] ;
	}
	 
	public int addCard(Card card){
		if(card.getVrijednost() == 11)
			numOfAses++;
		
		cardSum += card.getVrijednost();
		
		if(cardSum > 21){
			if(numOfAses>0){
				cardSum -= 10;
				numOfAses--;
			}
			else{
				return 2;
			}
		}
		else if(cardSum > 16 && cardSum <= 21){
			return 1;
		}
		else{
			hand[counter++] = card;
			return 3;
		}
		
		return 4;
		
		//return 1 - pobjeda
		//return 2 - poraz
		//return 3 - nova karta
		//retrun 4 - greska
	}	
	public int getSuma(){
		return cardSum;
	}
}
