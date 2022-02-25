package domain;

import model.MyInterface;

public class MyArray implements MyInterface {
	private int[] array;
	private int elements;
	
	public MyArray(int length) {
		array = new int[length];
	}


	public int[] getArray() {
		return array;
	}
	
	private boolean isFull() {
		return elements == array.length;
	}
	
	public void addElement(int e) throws Exception {
		if(isFull()) {
			throw new Exception("Array is full!");
		}
		array[elements++] = e;
	}
	
	@Override
	public void printAll() {
		for(int i = 0; i < elements; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
	}
	
}
