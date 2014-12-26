package Game;

public class Card {
	private int number;
	private String symbol;
	private int value;

	public Card(int number){
		
		if((number - 1) / 13 == 0){
			symbol = "SRCE";
		}
		if ((number - 1) / 13 == 1){
			symbol = "MAK";
		}
		if((number - 1) / 13 == 2){
			symbol = "BAKLAVA";
		}
		if((number - 1) / 13 == 3){
			symbol = "PIK";
		}
		if (number % 13 == 0){
			   this.value = 10;
			   this.number = 14;
		   }
	   if (number % 13 > 10 && number % 13 < 13){
		   this.value = 10;
		   this.number = (number % 13) + 1;
	   } 
	   if (number % 13 == 10){
		   this.value = 10;
		   this.number = 10;
	   }
	   if(number % 13 < 10 && number % 13 > 1) {
		   this.value = number % 13;
		   this.number = number % 13;
	   }
	   if(number % 13 == 1){
		   this.value = 11;
		   this.number = 1;
	   }
	}

	public int getVrijednost() {
		return value;
	}
	public String toString(){
		return "Broj karte: " + number + " znak: " + symbol + " vrijednost: " + value + "\n";
	}
	}

