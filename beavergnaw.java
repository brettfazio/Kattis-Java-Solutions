// Alex Rutledge

import java.io.*;
import java.util.*;

public class beaverGnaw {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		while (true) {
			int D = scan.nextInt(), V = scan.nextInt();
			if (D==0&&V==0)
				break;
			
			double d3 = D*D*D - 6*V/Math.PI;
			out.println(Math.pow(d3, 1/3.0));
		}
		out.close();
		scan.close();
	}

}
