//Daniel West
import java.util.Scanner;
public class weakvertices {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == -1) break;
			boolean[][] adj = new boolean[n][n];
			boolean[] weGood = new boolean[n];
			for(int r = 0; r < n; r++){
				for(int c = 0; c < n; c++){
					if(sc.nextInt() == 1) adj[r][c] = true;
					else adj[r][c] = false;
				}
			}
			checkLoop : for(int check = 0; check < n; check++){
				for(int j = 0; j < n; j++){
					for(int k = 0; k < n; k++){
						if(adj[check][j] && adj[j][k] && adj[k][check]){
							weGood[check] = true;
							weGood[j] = true;
							weGood[k] = true;
							continue checkLoop;
						}
					}
				}
			}
			for(int i = 0; i < n; i++) if(!weGood[i]) System.out.print(i + " ");
			System.out.println();
		}
	}
}
