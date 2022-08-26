import java.util.Scanner;
import java.text.DecimalFormat;

public class Gia_Phuong_Trinh_Bac_Nhat {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        if(a == 0 && b != 0) System.out.println("VN");
        else if (b == 0 && a == 0) {
            System.out.println("VSN");
        } else { 
            System.out.println(df.format((-b / a)));
        }
    }
}
