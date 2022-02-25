package start;

import domain.MyArray;

public class Main {
	public static void main(String[] args) {
		MyArray a = new MyArray(3);
		try {
			a.addElement(1);
			a.addElement(2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		a.printAll();
	}
}
