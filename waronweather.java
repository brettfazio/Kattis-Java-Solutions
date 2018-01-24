//Daniel West
import java.util.Scanner;
public class waronweather{
    static double[] x, y, z, xx, yy, zz;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int k = sc.nextInt(), m = sc.nextInt();
            if(k == 0 && m == 0) break;
            x = new double[k];
            y = new double[k];
            z = new double[k];
            xx = new double[m];
            yy = new double[m];
            zz = new double[m];
            for(int i = 0; i < k; i++){
                x[i] = sc.nextDouble();
                y[i] = sc.nextDouble();
                z[i] = sc.nextDouble();
            }
            for(int i = 0; i < m; i++){
                xx[i] = sc.nextDouble();
                yy[i] = sc.nextDouble();
                zz[i] = sc.nextDouble();
            }
            int out = 0;
            for(int i = 0; i < m; i++){
                double d3 = dist(xx[i], yy[i], zz[i]);
                for(int j = 0; j < k; j++){
                    double d1 = dist(x[j], y[j], z[j]);
                    double d2 = dist(x[j] - xx[i], y[j] - yy[i], z[j] - zz[i]);
                    if(d2 + d3 <= d1){
                        out++;
                        break;
                    }
                }
            }
            System.out.println(out);
        }
    }
    static double dist(double x, double y, double z){
        return x*x + y*y + z*z;
    }
}
