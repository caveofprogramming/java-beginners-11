package collections;

public class Array<E> {

	private E[] array;
	private int position = 0;
	
	@SuppressWarnings("unchecked")
	public Array(int size) {
		array = (E[])new Object[size];
	}
	
	public void add(E e) {
		
		if(position == array.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		
		array[position++] = e;
	}
	
	public int size() {
		return array.length;
	}
	
	public E get(int index) {
		return array[index];
	}
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		for(var obj: array) {
			sb.append(obj.toString());
			sb.append(" ");
		}
		
		return sb.toString();
	}
}
