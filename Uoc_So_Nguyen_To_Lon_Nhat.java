import java.util.Scanner;
public class Uoc_So_Nguyen_To_Lon_Nhat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            long n = sc.nextLong();
            long res = 0;
            //for(int i = 2;i * i <= n;i++)
            for(int i = 2;i <= Math.sqrt(n);i++){
                    while(n % i == 0){
                        res = i;
                        n /= i;
                    }
            }
            //khi chia đến cuối cùng nếu n == 1 thì số nguyên tố lớn nhất là res
            //nếu n lớn hơn 1 thì suy ra n chính là ước số nguyên tố lớn nhất cần tìm 
            if(n > 1) res = n;
            System.out.println(res);
            t--;
        }
    }
}
