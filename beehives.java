// Brett Fazio

import java.util.Scanner;

public class beehives {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			double dis = sc.nextDouble();
			
			int hives = sc.nextInt();
			
			if (dis == 0 && hives == 0) {
				break;
			}
			
			double[] x = new double[hives];
			double[] y = new double[hives];
			
			for (int i =0; i < hives; i++) {
				
				x[i] =sc.nextDouble();
				y[i] = sc.nextDouble();
				
			}
			
			int sweet = hives;
			
			outer : for (int i =0 ; i < hives; i++) {
				for (int j = 0; j < hives; j++) {
					
					if (i == j) continue;
					
					double c = Math.sqrt((Math.pow(x[i]-x[j],2))+(Math.pow(y[i]-y[j],2)));
					
					if (c <= dis) {
						
						sweet--;
						continue outer;
					}
					
				}
			}
			
			System.out.printf("%d sour, %d sweet%n", (hives-sweet),sweet);
		}
	}

}
