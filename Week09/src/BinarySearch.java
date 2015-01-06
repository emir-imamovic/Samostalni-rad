/**Napraviti program u kojem ce racunar pogaðati broj od 1 do 10 000 koji je korisnik zamislio.
 U prvom i svakom sljedecem koraku,racunar ce prepoloviti trenutni broj i pitati korisnika da li je to taj
 broj koji je zamislio,ako nije,onda ce korisnik kliknuti "Lower" ako je trenutni broj manji od zamisljenog, 
 u suprotnom korisnik ce kliknuti "Bigger" ukoliko je trenutni broj veci od zamisljenog.
*/
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
//klasa u kojoj pravimo frame sa button-ima i text areom u kojoj racunar ispisuje poruke.Takoðer sadrzi nested klasu
//koja implementira interface ActionPerformed,da bismo mogli koristiti button-e.
public class BinarySearch extends JPanel {

	static JTextArea text;
	static JButton buttonM;
	static JButton buttonT;
	static JButton buttonV;
	static int[] array = new int[10000];
	static int start;
	static int end;
	static int mid;
	static int counter;

	public static void main(String[] args) {

		counter = 1;
		start = 0;
		end = array.length;
		mid = (start + end) / 2;

		JFrame frame = new JFrame("Game");
		frame.setSize(300, 300);
		frame.setLocation(700, 200);

		buttonM = new JButton("Lower");
		buttonT = new JButton("Correct");
		buttonV = new JButton("Bigger");

		text = new JTextArea(2,20);
		text.setText("Da li je broj " + mid + " broj koji ste zamislili?");
		text.setEditable(false);

		JPanel panel = new JPanel();
		panel.add(buttonM);
		panel.add(buttonT);
		panel.add(buttonV);
		panel.add(text, BorderLayout.SOUTH);
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		buttonM.addActionListener(new ButtonHandler());
		buttonT.addActionListener(new ButtonHandler());
		buttonV.addActionListener(new ButtonHandler());

	}

	public static class ButtonHandler implements ActionListener {
/**
 * funkcija za izvoðenje event-a("dogaðaja")
 */
		@Override
		public void actionPerformed(ActionEvent e) {

			if (e.getSource().equals(buttonM)) { //provjerava da li je kliknuto dugme "Lower"
				counter++;     //broj pokusaja povecava se za 1
				end = mid; //sada je krajnji broj intervala ustvari srednji broj prethodnog intervala
				mid = (start + end) / 2; //ponovo prepolovimo novi interval i srednji broj stavljamo u varijablu "mid"
				text.setText("Da li je broj " + mid + " broj koji ste zamislili?");
			}

			if (e.getSource().equals(buttonV)) { //provjerva da li je kliknuto dugme "Bigger"
				counter++; //broj pokusaja povecava se za 1
				start = mid; // pocetni broj intervala je sada srednji broj prethodnog intervala
				mid = (start + end) / 2; //ponovo prepolovimo novi interval i srednji broj stavljamo u varijablu "mid"
				text.setText("Da li je broj " + mid + " broj koji ste zamislili?");
			}

			if (e.getSource().equals(buttonT)) { //provjerava da li je kliknuto dugme "Correct"
				text.setText("Bravo ja, pogodio sam u " + counter + " pokusaja.");

			}

		}

	}

}

