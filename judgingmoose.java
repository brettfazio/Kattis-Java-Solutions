import java.util.Scanner;
public class judgingmoose {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		int num = Math.max(a, b) * 2;
		if(num == 0) System.out.println("Not a moose");
		else{
			if(a == b) System.out.print("Even ");
			else System.out.print("Odd ");
			System.out.println(num);
		}
	}
}