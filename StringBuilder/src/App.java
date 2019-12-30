
public class App {

	public static void main(String[] args) {
		
		String text = "I ";
		text += "am ";
		text += "a giraffe";
		
		System.out.println(text);
		
		StringBuilder sb1 = new StringBuilder();
		
		sb1.append("I ");
		sb1.append("am ");
		sb1.append("a ");
		sb1.append("herring ");
		
		String result1 = sb1.toString();
		System.out.println(result1);
		
		String animal = "otter";
		StringBuilder sb2 = new StringBuilder("I ");
		sb2.append("am ").append("a ").append(animal);
		
		System.out.println(sb2);

	}

}
