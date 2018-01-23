import java.util.Scanner;
public class bijele {
	public static void main(String[] args) {
		int[] numPieces = {1, 1, 2, 2, 2, 8};
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < numPieces.length; i++) System.out.print(numPieces[i] - sc.nextInt() + " ");
		System.out.println();
	}
}