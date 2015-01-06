
public class DinamicArrayStringTest {
public static void main(String[] args) {
	DinamicArrayString array = new DinamicArrayString(3);
	array.add("Amra");
	array.add("Vedo");
	array.add("Mirza");
	array.add("Sanela");
	array.add("Emir");
	array.add("Emina");
	array.add("Selma");
	array.add("Adnan");
	array.add("Haris");
	System.out.println(array.getAt(6));
	array.removeAt(6);
	System.out.println(array.getAt(6));
}
}
