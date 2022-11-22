import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
    public static int[] a = new int[100];
    public static int[] b = new int[100];
    public static int n;
    public static int nto(int m){
        if(m < 2) return 0;
        for(int i = 2; i <= Math.sqrt(m); i++) if(m % i == 0) return 0;
        return 1;
    }
    public static int kt(){
        int sum = 0;
        for(int i = 0; i < n; i++) if(b[i] == 1) sum += a[i];
        if(nto(sum) == 0) return 0;
        return 1;
    }
    public static void ql(int i){
        for(int j = 0; j <= 1; j++){
            b[i] = j;
            if(i == n - 1){
                if(kt() == 1){
                    for(int h = 0; h < n; h++) if(b[h] == 1) System.out.print(a[h] + " ");
                    System.out.println();
                }
            }else ql(i + 1);
        }
    }
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int t = x.nextInt();
        while(t -- > 0){
            n = x.nextInt();
            for(int i = 0; i < n; i++) a[i] = x.nextInt();
            for(int i = 0; i < n - 1; i++){
                for(int j = i + 1; j < n; j++){
                    if(a[i] < a[j]){
                        int m = a[i];
                        a[i] = a[j];
                        a[j] = m;
                    }
                }
            }
            ql(0);
        }
    }// your code goes here
}
