import java.util.Scanner;
public class grassseedinc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double cost = sc.nextDouble();
		int c = sc.nextInt();
		double area = 0.0;
		for(int i = 0; i < c; i++) area += sc.nextDouble() * sc.nextDouble();
		System.out.println(cost * area);
	}
}