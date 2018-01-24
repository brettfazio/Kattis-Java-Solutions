//Daniel West
import java.util.Arrays;
import java.util.Scanner;
public class tarifa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int[] test = new int[c];
		for(int i = 0; i < c; i++) test[i] = sc.nextInt();
		System.out.println(Arrays.toString(rotate(test)));
	}
	public static int[] rotate(int[] in){
		for(int i = 0; i + 1 < in.length; i++){
			int temp = in[i];
			in[i] = in[i + 1];
			in[i + 1] = temp;
		}
		return in;
	}
}
