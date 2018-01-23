import java.util.Scanner;
public class heliocentric {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		while(sc.hasNext()){
			int e = sc.nextInt(), m = sc.nextInt();
			if(e == 0 && m == 0){
				System.out.println("Case " + i + ": 0");
			}
			else{
				int numDays = 365 - e;
				m = (m + (365 - e)) % 687;
				e = 0;
				while(!(e == 0 && m == 0)){
					numDays += 365;
					m = (m + 365) % 687;
				}
				System.out.printf("Case %d: %d%n", i, numDays);
			}
			i++;
		}
	}
}