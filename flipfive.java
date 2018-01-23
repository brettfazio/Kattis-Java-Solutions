import java.util.Scanner;
import java.util.TreeMap;
public class flipfive {
    static boolean[][] curr, used;
    static TreeMap<grid, Integer> moves;
    static int currMoves;
    public static void main (String[] args){
        curr = new boolean[3][3];
        used = new boolean[3][3];
        moves = new TreeMap<grid, Integer>();
        currMoves = 0;
        dfs();
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < c; i++){
            boolean[][] in = new boolean[3][3];
            for(int R = 0; R < 3; R++){
                String line = sc.nextLine();
                for(int C = 0; C < 3; C++){
                    if(line.charAt(C) == '*'){
                        in[R][C] = true;
                    }
                }
            }
            grid currGrid = new grid(in);
            int out = moves.get(currGrid);
            System.out.println(out);
        }
    }
    static void opp(int rIn, int cIn){
        if(rIn < 0 || rIn >= 3 || cIn < 0 || cIn >= 3) return;
        curr[rIn][cIn] = !curr[rIn][cIn];
    }
    static void flip(int rIn, int cIn){
        opp(rIn - 1, cIn);
        opp(rIn + 1, cIn);
        opp(rIn, cIn - 1);
        opp(rIn, cIn + 1);
        opp(rIn, cIn);
    }
    static void dfs(){
        grid temp = new grid(curr);
        if(!moves.containsKey(temp)) moves.put(temp, currMoves);
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(used[i][j]) continue;
                flip(i, j);
                used[i][j] = true;
                currMoves++;
                dfs();
                flip(i, j);
                used[i][j] = false;
                currMoves--;
            }
        }
    }
}
class grid implements Comparable<grid> {
    boolean[][] arr;
    int index;
    grid(boolean[][] arrIn){
        arr = new boolean[3][3];
        index = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(arrIn[i][j]){
                    arr[i][j] = true;
                    int temp = (3 * i) + j;
                    index += Math.pow(2, temp);
                }
            }
        }
    }
    public int compareTo(grid in){
        if(index < in.index) return -1;
        if(index > in.index) return 1;
        return 0;
    }
}