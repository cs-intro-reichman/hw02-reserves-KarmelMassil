/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		for (int i = 1; i < n+1; i++) { 
			for (int k = 0; k < n; k++) { 
				if (k == 0 && i % 2 == 0)
				    System.out.print(" * ");
				else if(k == n - 1 && i % 2 == 0)
				    System.out.print("*");
				else
					System.out.print("* ");
			}
			System.out.println("");
		}
	}
}

