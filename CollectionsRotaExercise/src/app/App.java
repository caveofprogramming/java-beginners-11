package app;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/*
 * Implement a rota.
 * 
 * We have a list of nine people with the following skills.
 * 
 * Every day, we need to find at least three people to work.
 * 
 * To populate a given shift on a given day, we pick people from the list in order,
 * starting after the last person we assigned to work.
 * 
 * Any person can be declared on holiday, in which case we don't pick them as long as they remain on holiday.
 * 
 * Every day, the people who work must have at least the following skills between them:
 * manager, receptionist, programmer.
 * 
 * Create a Rota class that for any given week, will tell us which people are working that day.
 * 
 * If we call a nextWeek() method, the Rota moves to the next week.
 * 
 * The Rota has a toString() method that returns a String displaying that entire week's rota.
 * 
 * Rota has a method add() to add people and their skills.
 * 
 * Tips:
 * 
 * 1. Try to break the problem down into separate simpler tasks. To do this, simplify the problem;
 * for example, can you populate a rota with people, regardless of skills?
 * 2. Implement a bit at a time, and test -- even in a separate program if necessary.
 * 3. Implement whatever bits you can.
 * 4. Start by populating suitable data structures with the data, using collections classes.
 * 5. Try to make sure your code compiles and runs as much of the time as possible while you're coding.
 * 6. Create any classes you can think of that may help simplify the problem. Don't solely rely
 * on collections classes; that will get too messy. Test your classes before using them.
 * 7. If you find your Rota class is getting too messy and complicated, you probably haven't
 * defined enough auxilliary classes to help you with the task, or you haven't used enough
 * separate methods.
 *
 */

// @formatter:off
/*
 String[][] peopleSkills = { 
 			{ "Oliver", "programming", "electronics" },
			{ "Jake", "reception", "engineering" },
			{ "Amelia", "programming", "reception", "electronics", "management" },
			{ "Noah", "management", "electronics" }, 
			{ "James", "programming", "management", "electronics" },
			{ "Margaret", "engineering", "electronics", "programming", "reception" }, 
			{ "Emma", "programming" },
			{ "Jack", "engineering", "electronics", "programming" }, 
			{ "Mary", "engineering", "electronics" },
	};
 */
 // @formatter:on

/*
 * Bonus question: 
 * Would your algorithm scale well? What if we had many more people and skills, and many more 
 * required skills for a given day?
 */

public class App {

	public static void main(String[] args) {

		List<String> skills = List.of("engineering", "electronics", "reception", "management", "programming");
		List<String> names = List.of("Oliver", "Jake", "Amelia", "Noah", "James", "Margaret", "Emma", "Jack", "Mary");

		Random random = new Random();

		for (var name : names) {

			// List of potential skills for this person.
			LinkedList<String> skillList = new LinkedList<String>(skills);

			System.out.print("\"" + name + "\"");
			System.out.print("\t");

			for (int i = 0; i < random.nextInt(4) + 1; i++) {
				int index = random.nextInt(skillList.size());

				System.out.print("\"" + skillList.get(index) + "\"");
				System.out.print(" ");

				// Now that we've used this randomly-selected skill,
				// remove it from the list of skills so we don't
				// use it again for this person.
				skillList.remove(index);
			}

			System.out.println();
		}
	}

}
