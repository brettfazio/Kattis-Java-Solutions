import java.util.Scanner;
public class autori {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] in = sc.nextLine().split("-");
		for(int i = 0; i < in.length; i++) System.out.print(in[i].charAt(0));
		System.out.println();
	}
}