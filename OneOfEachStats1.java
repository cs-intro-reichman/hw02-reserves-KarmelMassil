/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int child2 = 0;
		int child3 = 0;
		int child4 = 0;
		int counter = 0;
		String gender;
		int t = Integer.parseInt(args[0]);
		for (int i = 0; i < t; i++) {
			double a = Math.random();
			if (a <= 0.5) gender = "g";
			else          gender = "b";
			String bg = gender;
			int child = 0;
			while (bg == gender) {
				counter++;
				child++;
				double b = Math.random();
				if (b <= 0.5) gender = "g";
			    else          gender = "b";
			}
			if (child == 2)    child2++;
			if (child == 3)    child3++;
			if (child >= 4)     child4++;
		}
		double avg = (double) counter / t;
		System.out.println("Average: " + avg + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + child2);
		System.out.println("Number of families with 3 children: " + child3);
		System.out.println("Number of families with 4 or more children: " + child4);
		if (child2 > child3 && child2 > child4)
		System.out.println("The most common number of children is 2");
		else if (child3 >= child2 && child3 > child4)
		System.out.println("The most common number of children is 3");
		else if (child4 >= child2 && child4 >= child3)
		System.out.println("The most common number of children is 4 or more");
	}
}
