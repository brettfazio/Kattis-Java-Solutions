// Brett Fazio

import java.util.Scanner;

public class banger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int tests = sc.nextInt();
        sc.nextLine();
        for (int i =0 ; i <tests; i++) {
            
            String[] line = sc.nextLine().split(" ");
            int[] a = new int[line.length];
            for (int j =0 ; j < line.length; j++) {
                
                a[j] = Integer.parseInt(line[j]);
                
            }
            int cnt =0 ;
            for (int j = 1;  j< a.length; j++) {
                cnt += Math.max(0, a[j]-a[j-1]*2);
            }
            System.out.println(cnt);
        }
        
    }

}
