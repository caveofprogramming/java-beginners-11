package collections;

public class Wrapper<E> {
	private E object;
	
	public void set(E object) {
		this.object = object;
	}
	
	public E get() {
		return object;
	}
}
