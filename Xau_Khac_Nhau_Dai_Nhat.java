package xau_khac_nhau_dai_nhat;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.text.*;
/**
 *
 * @CampusETH
 */
public class Xau_Khac_Nhau_Dai_Nhat {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String a = sc.nextLine();
            String b = sc.nextLine();
            if(a.compareTo(b) == 0) System.out.println("-1");
            else{
                System.out.println(Math.max(a.length(), b.length()));
            }
        }
    }
    
}
