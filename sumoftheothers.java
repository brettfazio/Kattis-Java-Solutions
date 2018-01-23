import java.util.Scanner;
public class sumoftheothers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String[] in = sc.nextLine().split(" ");
			int sum = 0;
			for(int i = 0; i < in.length; i++) sum += Integer.parseInt(in[i]);
			System.out.println(sum / 2);
		}
	}
}