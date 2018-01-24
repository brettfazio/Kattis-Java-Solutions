//Daniel West
import java.util.Scanner;
public class t9spelling {
	static String[] nums = {" ", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	static StringBuilder out;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		sc.nextLine();
		for(int i = 1; i <= c; i++){
			char[] in = sc.nextLine().toCharArray();
			out = new StringBuilder();
			for(char temp : in) getString(temp);
			System.out.printf("Case #%d: ", i);
			System.out.println(out);
		}
	}
	static void getString(char in){
		for(int i = 0; i < nums.length; i++){
			int index = nums[i].indexOf(in);
			if(index == -1) continue;
			if(out.length() > 0 && out.charAt(out.length() - 1) - '0' == i) out = out.append(' ');
			for(int j = 0; j <= index; j++) out = out.append(i);
			return;
		}
	}
}
