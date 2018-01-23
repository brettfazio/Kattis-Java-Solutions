// Alex Rutledge

import java.util.ArrayList;
import java.util.Scanner;

public class whatDoesTheFoxSay {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		outer: for (int i = 0; i < n; i++) {
			ArrayList<String> a = new ArrayList<>();
			String[] b = scan.nextLine().split(" ");
			for (String c : b)
				a.add(c);
			inner: for (String in = scan.nextLine(); !in.isEmpty(); in = scan.nextLine()) {
				if (in.equals("what does the fox say?")) {
					for (String c : a) {
						System.out.print(c + ' ');
					}
					System.out.println();
					continue outer;
				} else {
					String[] c = in.split(" ");
					ArrayList<String> temp = new ArrayList<>();
					temp.add(c[2]);
					a.removeAll(temp);
					temp.clear();
				}
			}
		}
	}

}
