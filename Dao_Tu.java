
package dao_tu;
import java.util.*;
import java.lang.*;
public class Dao_Tu {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String[] s_1 = sc.nextLine().split(" ");
            String res = "";
            for(int i = 0;i < s_1.length;i++){
                for(int j = s_1[i].length() - 1;j >= 0;j--){
                    res += s_1[i].charAt(j);
                }
                res += " ";
            }
            System.out.println(res);
        }
    }
    
}
