package Game;

public class Test {
	public static void main(String[] args) {

		Deck original = new Deck();
		System.out.println("*****************************************");
		// System.out.println("Izmijesan spil: \n" + original.toString());
		original.mixingCards();
		// System.out.println("*****************************************");
		// System.out.println("Izmijesani spil: \n" + original.toString());
		System.out.println(original.getNext().toString());
		Hand player = new Hand();
		Hand diler = new Hand();
		int resultPlayer = 3;
		int resulttDiler = 3;
		while (resultPlayer == 3 && resulttDiler == 3) {
			Card forPlayer = original.getNext();
			resultPlayer = player.addCard(forPlayer);
			System.out.println("karta za igraca: " + forPlayer);

			Card forDiler = original.getNext();
			System.out.println("karta za dilera: " + forDiler);
			if(resultPlayer == 3)
				resulttDiler = diler.addCard(forDiler);
		}
		System.out.println("Diler: " + resulttDiler);
		System.out.println("Player: " + resultPlayer);

		// System.out.println(hand.dodajKartu());
	}
}
