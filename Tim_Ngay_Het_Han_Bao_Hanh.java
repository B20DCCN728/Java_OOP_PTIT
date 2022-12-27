//Created by Campus
package tim_ngay_het_han_bao_hanh;
import java.lang.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.time.*;
import java.io.*;
//
public class Tim_Ngay_Het_Han_Bao_Hanh {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("MUAHANG.in"));
        SimpleDateFormat myDate = new SimpleDateFormat("dd/MM/yyyy");
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0;i < n;i++){
            Products tmp = new Products(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            Products.list.put(tmp.getCode(), tmp);
        }
        n = Integer.parseInt(sc.nextLine());
        ArrayList<Clients> solve = new ArrayList<>();
        for(int i = 0;i < n;i++){
            solve.add(new Clients(sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), myDate.parse(sc.nextLine())));
        }
        Collections.sort(solve);
        for(Clients x: solve){
            System.out.println(x);
        }
    }
    
}
