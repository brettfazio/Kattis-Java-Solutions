import java.util.Scanner;
public class theamazinghumancannonball {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		for(int i = 0; i < c; i++){
			double vo = sc.nextDouble(), theta = Math.toRadians(sc.nextDouble()), x = sc.nextDouble(), h1 = sc.nextDouble(), h2 = sc.nextDouble();
			double t = x / (vo * Math.cos(theta)), range = vo * Math.cos(theta) * t;
			if(range < x){
				System.out.println("Not Safe");
				continue;
			}
			double heightAtX = (vo * t * Math.sin(theta)) - ((9.81 * t * t) / 2.0);
			System.out.println(heightAtX);
			if(heightAtX >= h1 + 1 && heightAtX <= h2 - 1){
				System.out.println("Safe");
			}
			else System.out.println("Not Safe");
		}
	}
}