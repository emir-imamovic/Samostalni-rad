/** napraviti objekt tipa DinamicArrayString, sa metodama: add,resize,getSize,getAt,removeAt i toArray */
public class DinamicArrayString {
	private String[] array;
	private int count;
	final static int INIT_NUM = 5;
/**
 * default-ni konstruktor, nasljeðuje konstruktor koji prima velicinu niza
 */
	public DinamicArrayString() {
		this(INIT_NUM);
	}
/**
 * konstruktor kreira objekt tipa DinamicArrayString
 * @param size - velicina niza
 */
	public DinamicArrayString(int size) {
		super();
		array = new String[size];
		count = 0;
	}
/**
 * funkcija dodaje elemente u niz stringova
 * @param str - novi element
 */
	public void add(String str) {
		if (count == array.length) { //provjerava da li je broj clanova jednak duzini niza
			resize();//ako jeste prosiruje niz
		}
		array[count] = str; //dodajemo novi el.na zadnji index
		count++; // povecavamo broj el.za 1
	}
/**
 * funkcija prosiruje niz
 */
	private void resize() {
		String[] tmp = array; //pomocni niz cija je referenca ista kao referenca postojeceg niza
		array = new String[tmp.length * 2]; //duzinu postojeceg niza prosirujemo za 2 puta
		for (int i = 0; i < count - 1; i++) {
			array[i] = tmp[i];  //vracamo vrijednosti iz pomocnog niza u postojeci(prosireni) niz
		}
	}
	/**
	 * funkcija vraca velicinu niza
	 * @return velicina niza
	 */
	public int getSize(){
		return count;
	}
/**
 * funkcija vraca string koji se nalazi na zadanom indexu
 * @param index - index u nizu sa kojeg zelimo povuci vrijednost(string)
 * @return vrijednost(string)
 */
	public String getAt(int index) {
		if(index >= 0 || index < count) //provjerava da li je index validan
		return array[index]; //ako je index validan funkcija vraca vrijednost sa zadanog indexa
		else
			throw new IndexOutOfBoundsException("Index is not valid");
	}
	/**
	 * funkcija uklanja string koji se nalazi na zadanom indexu
	 * @param index - index u nizu sa kojeg zelimo uklonuti vrijednost(string)
	 */
	public void removeAt(int index) {
		if(index >= 0 || index < count){
			for (int i = index; i < count - 1; i++) {
				array[i] = array[i + 1];
			}
		count--;
		} else 
			throw new IndexOutOfBoundsException("Index is not valid");
	}
	/**
	 * funkcija pravi novi niz cija je duzina broj elemenata,postojeceg niza i u njega upisuje 
	 * vrijednosti postojeceg niza
	 * @return novi niz
	 */
	public String[] toArray() {
		String[] newArray = new String[count];
		for(int i = 0; i < count; i++) {
			newArray[i] = array[i];
		}
		return newArray;
	}
}
