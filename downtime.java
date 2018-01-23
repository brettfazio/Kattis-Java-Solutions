// Brett Fazio

import java.util.Scanner;

public class downtime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int persec = sc.nextInt();
		
		int[] time = new int[n];
		
		for (int i = 0; i < n; i++) {
			time[i] = sc.nextInt();
		}
		
		int max = 1;
		int cur = 1;
		int next = 0;
		for (int i = 1; i < n; i++) {
			cur++;
			while (time[i] >= time[next]+1000) {
				next++;
				cur--;
			}
			max= Math.max(max, cur);
		}
		
		System.out.println((int)Math.ceil((double)max/persec));
		
		
	}

}
