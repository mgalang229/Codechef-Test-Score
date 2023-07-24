import java.util.Scanner;

//change class to 'Main'
public class Solution {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int n = fs.nextInt(), x = fs.nextInt(), y = fs.nextInt();
			System.out.println((y % x == 0 && n >= y / x ? "YES" : "NO"));
		}
		fs.close();
	}
}
