import java.util.Scanner;
import java.util.TreeSet;
public class noduplicates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeSet<String> check = new TreeSet<String>();
		String[] in = sc.nextLine().split(" ");
		for(int i = 0; i < in.length; i++){
			if(check.contains(in[i])){
				System.out.println("no");
				return;
			}
			check.add(in[i]);
		}
		System.out.println("yes");
	}
}