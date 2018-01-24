//Daniel West
import java.util.Arrays;
import java.util.Scanner;
public class froshweek {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		int[] tasks = new int[n], quiets = new int[m];
		for(int i = 0; i < n; i++) tasks[i] = sc.nextInt();
		Arrays.sort(tasks);
		for(int i = 0; i < m; i++) quiets[i] = sc.nextInt();
		Arrays.sort(quiets);
		int currI = m - 1, out = 0;
		for(int i = n - 1; i >= 0; i--){
			if(quiets[currI] >= tasks[i]){
				out++;
				currI--;
				if(currI < 0) break;
			}
		}
		System.out.println(out);
	}
}
