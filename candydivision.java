// Brett Fazio

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.TreeSet;

public class candydivision {

    public static void main(String[] args) throws IOException {
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        long in = Long.parseLong(bu.readLine());

        TreeSet<Long> set = new TreeSet<>();
        set.add(0l);
        for (int i = 1; i < (int)(Math.sqrt(in)); i++) {
            
            if (in % (i+1) == 0) {
                set.add((long)i);
                set.add((long) (in / (i+1)-1));
            }
            
        }
        set.add(in-1);
        
        while (set.isEmpty() == false) {
            
            out.print(set.pollFirst());
            out.print(' ');
            
        }
        out.close();
        
    }

}
