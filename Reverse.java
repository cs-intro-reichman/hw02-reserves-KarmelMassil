/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String word = args [0];
		int l = word.length();
		String str = "";
		int i = l - 1;
		while ( i >= 0) {
			char org = word.charAt (i);
			str += org;
			//System.out.println(str);
			i--;
		}
		char mid = word.charAt((l -1 )/ 2);
		System.out.println(str);
		System.out.println("The middle character is " + mid);
	}
}
