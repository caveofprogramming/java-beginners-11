package application;

import java.util.Iterator;


/* 
 * Modify the iterator so that it starts reading from the item that was added the earliest,
 * and finishes reading at the item that was added last.
 * 
 * E.g.
 * 
 * given this declaration: Ring<Integer> ring = new Ring<3>();
 *
 * ring.add(1);
 * iterator returns : 1
 * 
 * ring.add(1);
 * ring.add(2);
 * iterator returns 1,2
 * 
 * ring.add(1);
 * ring.add(2);
 * ring.add(3);
 * iterator returns 1,2,3
 * 
 * ring.add(1);
 * ring.add(2);
 * ring.add(3);
 * ring.add(4);
 * iterator returns 2,3,4
 * 
 * ring.add(1);
 * ring.add(2);
 * ring.add(3);
 * ring.add(4);
 * ring.add(5);
 * iterator returns 3,4,5
 * 
 * etc.
 * 
 */


class Ring<E> implements Iterable<E>{
	
	private E[] items;
	private int writePosition = 0;
	private int numberOfItems = 0;
	
	private class RingIterator implements Iterator<E> {
		
		private int readPosition = 0;
		private int itemsRead = 0;
		
		public RingIterator() {
			if(numberOfItems == items.length) {
				readPosition = writePosition;
			}
		}

		@Override
		public boolean hasNext() {
			return itemsRead < numberOfItems;
		}

		@Override
		public E next() {
			++itemsRead;
			
			if(readPosition == items.length) {
				readPosition = 0;
			}
			
			return items[readPosition++];
		}
		
	}
	
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

	@Override
	public Iterator<E> iterator() {
		return new RingIterator();
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
		
		for(var n: ring) {
			System.out.println(n);
		}

	}

}
