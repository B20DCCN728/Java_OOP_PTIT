import java.util.Scanner; 
import java.lang.Math;
import java.text.DecimalFormat;

public class Chia_Tam_Giac {
    private static final DecimalFormat df = new DecimalFormat("0.000000");
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int h = sc.nextInt();
            for(int i = 1;i <= n - 1;i++){
                System.out.print(df.format(h*Math.sqrt((double)i/n)) + " ");
            }
            System.out.println();
            t--;
        }
    }
}
