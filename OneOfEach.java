/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		String gender;
		int counter = 1;
		double a = Math.random();
		if (a <= 0.5)
		gender = "b";
		else
		gender = "g";
		String all = gender;
		String first = gender;
		while (first == gender) {
			counter++;
			double d = Math.random();
			if (d <= 0.5)
			gender = "b";
		    else
		    gender = "g";
			all = all + " " + gender;
		}
		System.out.println(all);
		System.out.println("You made it... and you now have " + counter + " children.");
	}
}
