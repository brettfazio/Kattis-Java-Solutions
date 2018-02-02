//Daniel West
import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt(), out = 1;
        int[] times = new int[n];
        int firstIndex = 0, tempOut = 1;
        times[0] = sc.nextInt();
        for(int i = 1; i < n; i++){
            times[i] = sc.nextInt();
            while(times[firstIndex] + 1000 <= times[i]){
                firstIndex++;
                tempOut--;
            }
            tempOut++;
            out = Math.max(out, tempOut);
        }
//      System.out.println("Max num requests at one time: " + out);
        System.out.println((int) Math.ceil(1.0*out / k));
        
    }
}
