// Brett Fazio

import java.util.Scanner;

public class oddgnome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        outer : for (int i =0 ;i < n; i++) {
            
            int gnomes = sc.nextInt();
            
            int[] a = new int[gnomes];
            
            for (int j =0; j < gnomes; j++){
                a[j] =sc.nextInt();
            }
            
            for (int j = 1; j < gnomes-1; j++) {
                
                if (!(a[j] - a[j-1] == 1) && !(a[j] - a[j+1] == -1)) {
                    
                    System.out.println(j+1);
                    continue outer;
                }
                
            }
            
        }
    }

}
