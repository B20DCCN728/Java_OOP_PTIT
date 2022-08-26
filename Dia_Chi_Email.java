package dia_chi_email;
import java.util.*;
public class Dia_Chi_Email {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Map<String, Integer> map = new LinkedHashMap<>();
        sc.nextLine();
        while(t-- > 0){
            String S = sc.nextLine();
            S = S.trim();
            S = S.replaceAll("\\s+", " ");
            String[] res = S.split(" ");
            String str = "";
            int n = res.length;
            str += res[n - 1].toLowerCase();
            for(int i = 0;i < n - 1;i++){
                str += String.valueOf(res[i].charAt(0)).toLowerCase();
            }
            int count = 1;
            if(map.containsKey(str)){
                int x = map.get(str);
                x++;
                map.put(str, x);
                count = x;
            }
            else {
                int x = 1;
                map.put(str, x);
            }
            if(count != 1) str += String.valueOf(count);
            str += "@ptit.edu.vn";
            System.out.println(str);
        }
    }
    
}
