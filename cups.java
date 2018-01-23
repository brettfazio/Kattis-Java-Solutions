import java.util.Scanner;
import java.util.TreeMap;

public class cups {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		TreeMap<Integer,String> map = new TreeMap<>();
		
		for (int i =0; i < n; i++) {
			
			String a = sc.next();
			String b = sc.next();
			
			if (Character.isAlphabetic(a.charAt(0))) {
				map.put(Integer.parseInt(b)*2, a);
			}else {
				map.put(Integer.parseInt(a), b);
			}
			
		}
		
		while (map.isEmpty() == false ) {
			System.out.println(map.pollFirstEntry().getValue());
		}
		
	}

}
