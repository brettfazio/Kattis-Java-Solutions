//Daniel West
import java.util.Scanner;
public class disastrousdowntime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		int minServers = 1;
		int[] servs = new int[n];
		for(int i = 0; i < n; i++) servs[i] = sc.nextInt();
		for(int i = 0; i < n; i++){
			int temp = 1;
			for(int j = i + 1; j < n && servs[j] - servs[i] < 1000; j++){
				temp++;
			}
			minServers = Math.max(minServers, (int) Math.ceil(1.0 *temp / k));
		}
		System.out.println(minServers);
	}
}
