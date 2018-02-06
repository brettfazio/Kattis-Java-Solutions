// Brett Fazio

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class polish {

    public static void main(String[] args) throws IOException {
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int cases = 1;
        
        String s = bu.readLine();
        while (s != null && s.equals("") == false) {
            
            String[] in = s.split(" ");
            
            ArrayList<String> list = new ArrayList<>();
            
            for (String i : in) {
                list.add(i);
            }
            
            boolean change = true;
            
            while (change) {
                change = false;
                for (int i =0; i < list.size()-2; i++) {
                    String cur = list.get(i);
                    String next = list.get(i+1);
                    String nexter = list.get(i+2);
                    
                    if (cur.equals("+") || cur.equals("-") || cur.equals("*")) {
                        if (isInteger(next,10) && isInteger(nexter,10)) {
                            
                            list.remove(i+1);
                            list.remove(i+1);
                            change = true;
                            if (cur.equals("+")) {
                                list.set(i, Integer.parseInt(next)+Integer.parseInt(nexter)+"");
                            }else if (cur.equals("-")) {
                                list.set(i, Integer.parseInt(next)-Integer.parseInt(nexter)+"");
                            }else if (cur.equals("*")) {
                                list.set(i, Integer.parseInt(next)*Integer.parseInt(nexter)+"");
                            }
                            
                        }
                    }
                }
                
                
            }
            
            out.print("Case ");
            out.print(cases);
            out.print(": ");

            for (String ss : list) {
                out.print(ss);
                out.print(' ');
            }
            
            out.println();
            cases++;
            s = bu.readLine();
        }
        out.close();
    }
    
    public static boolean isInteger(String s, int radix) {
        if(s.isEmpty()) return false;
        for(int i = 0; i < s.length(); i++) {
            if(i == 0 && s.charAt(i) == '-') {
                if(s.length() == 1) return false;
                else continue;
            }
            if(Character.digit(s.charAt(i),radix) < 0) return false;
        }
        return true;
    }

}
