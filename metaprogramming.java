// Alex Rutledge

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.TreeMap;

public class metaprogramming {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		TreeMap<String, Integer> map = new TreeMap<>();

		while (scan.hasNext()) {
			String a = scan.next();
			if (a.equals("define")) {
				int b = scan.nextInt();
				map.put(scan.next(), b);
			} else if (a.equals("eval")) {
				String b = scan.next();
				char c = scan.next().charAt(0);
				String d = scan.next();
				if (map.containsKey(b) && map.containsKey(d)) {
					int e = map.get(b), f = map.get(d);
					if (c == '=')
						out.println((e == f) ? "true" : "false");
					else if (c == '<')
						out.println((e < f) ? "true" : "false");
					else
						out.println((e > f) ? "true" : "false");
				} else
					out.println("undefined");
			}
		}
		out.close();
		scan.close();
	}
}
