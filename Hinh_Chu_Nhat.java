import java.util.Scanner;

public class Hinh_Chu_Nhat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a <= 0 || b <= 0) System.out.print(0);
        else System.out.print((a + b) * 2 + " " +(a * b));
    }
}
