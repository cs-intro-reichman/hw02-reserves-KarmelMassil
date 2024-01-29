import java.util.Random;

/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int a = (int) (Math.random() *10);
		int b = a;
		for ( ; a >= b; a = (int) (Math.random() *10)) {
			System.out.print(a + " ");
			b = a;
		}
	}
}
