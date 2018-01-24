// Brett Fazio

import java.util.Scanner;

public class dicecup {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] s = new int[1000];
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                s[i+j]++;
            }
        }
        
        int max = 0;
        int x = 0;
        
        for (int i =0; i < s.length; i++) {
            
            if (s[i] > max) {
                max = s[i];
                x = i;
            }
            
        }
        
        for (int i = 0; i < s.length; i++) {
            
            if (s[i] == max) {
                System.out.println(i);
            }
            
        }
        
    }

}
