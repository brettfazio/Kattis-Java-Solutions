//Daniel West
import java.util.Scanner;
public class server {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt(), t = sc.nextInt(), curr = 0, out = 0;
		for(int i = 0; i < c; i++){
			curr += sc.nextInt();
			if(curr <= t) out++;
		}
		System.out.println(out);
	}
}
