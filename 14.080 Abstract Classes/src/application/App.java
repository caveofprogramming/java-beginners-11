package application;

public class App {

	public static void main(String[] args) {
		
		// Does not work!
		// new GameObject();
		
		GameObject[] objs = {new Player(), new Monster()};
		
		for(var obj: objs) {
			System.out.println(obj);
			obj.describe();
		}
	}

}
