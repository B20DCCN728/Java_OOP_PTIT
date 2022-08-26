package hinh_vuong;
import java.util.*;
import java.lang.Math;
public class Hinh_Vuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int xl_1 = sc.nextInt();
        int yl_1 = sc.nextInt();
        int xr_1 = sc.nextInt();
        int yr_1 = sc.nextInt();
        int XL_2 = sc.nextInt();
        int YL_2 = sc.nextInt();
        int XR_2 = sc.nextInt();
        int YR_2 = sc.nextInt();
        int x1 = Math.min(xl_1, XL_2);
        int y1 = Math.min(yl_1, YL_2);
        int x2 = Math.max(xr_1, XR_2);
        int y2 = Math.max(yr_1, YR_2);
        int x = Math.max((x2 - x1), (y2 - y1));
        System.out.print(x * x);
    }
    
}
