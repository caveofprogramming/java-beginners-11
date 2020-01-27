package application;

public class Test {

	public static void main(String[] args) {
		System.out.println(GameObject.ROCK.beats(GameObject.SCISSORS));
		System.out.println(GameObject.ROCK.beats(GameObject.PAPER));
		System.out.println(GameObject.PAPER.beats(GameObject.ROCK));

	}

}
