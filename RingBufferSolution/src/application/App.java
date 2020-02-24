package application;


/*
 * Create a generic class that can store objects of any type.
 * 
 * The class should use an internal array to store the objects.
 * The size of the internal array should be specified by the constructor.
 * 
 * The class should have add(), get() and size() methods.
 * 
 * The add() method accepts an object to add, and may be called
 * as many times as is desired.
 * 
 * The get() method accepts an index and returns the item at the given
 * index in the array.
 * 
 * The size() method returns the number of items presently in the internal array.
 * 
 * If more items are added than can be fitted in the array,
 * the class starts overwriting items at the start of the array.
 * 
 * Example:
 * 
 * Internal buffer of size 3.
 * 
 * First three items are stored at indexes 0-2.
 * 
 * Fourth item overwrites item at index 0
 * Fifth item overwrites item at index 1
 * etc.
 * 
 * 
 */

class Ring<E> {
	
	private E[] items;
	private int writePosition = 0;
	private int numberOfItems = 0;
	
	@SuppressWarnings("unchecked")
	public Ring(int size) {
		items = (E[])new Object[size];
	}
	
	public void add(E element) {
		items[writePosition++] = element;
		
		if(writePosition == items.length) {
			writePosition = 0;
		}
		
		if(++numberOfItems > items.length) {
			numberOfItems = items.length;
		}
	}
	
	public E get(int index) {
		return items[index];
	}
	
	public int size() {
		return numberOfItems;
	}
}

public class App {

	public static void main(String[] args) {
		
		Ring<Integer> ring = new Ring<>(3);
		
		ring.add(1);
		ring.add(2);
		ring.add(3);
		ring.add(4);
		ring.add(5);
		
		for(int i = 0; i < ring.size(); i++) {
			System.out.println(ring.get(i));
		}

	}

}
