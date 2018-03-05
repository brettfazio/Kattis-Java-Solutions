import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.TreeMap;
import java.util.TreeSet;

public class hardwoodspecies {

	public static void main(String[] args) throws IOException {
		BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		double tot =0 ;
		
		TreeSet<String> set = new TreeSet<String>();
		TreeMap<String,Integer>map = new TreeMap<>();
		int[] amt = new int[10000];
		while (true) {
			String in =bu.readLine();
			
			if (in == null || in.trim().equals("")) {
				break;
			}
			
			if (map.containsKey(in) == false) {
				map.put(in, map.size());
				set.add(in);
				amt[map.size()-1]++;
			}else {
				amt[map.get(in)]++;
			}
			tot++;
//			if (tot ==29)break;
		}
		
		while (set.isEmpty() == false) {
			String get = set.pollFirst();
			int div = map.get(get);
			out.println(get + " " + (amt[div]/tot*100));
		}
		out.close();
	}

}
