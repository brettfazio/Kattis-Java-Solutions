//Daniel West
import java.util.Scanner;
public class exactlyelectrical {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt(), y1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt(), v = sc.nextInt();
		int d = Math.abs(x1 - x2) + Math.abs(y1 - y2);
		if(v < d || (v - d) % 2 == 1) System.out.println("N");
		else System.out.println("Y");
	}
}
