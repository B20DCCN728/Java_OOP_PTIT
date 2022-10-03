package tinh_tien_phong;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
public class Tinh_Tien_Phong {
    public static void main(String[] args) throws FileNotFoundException, ParseException{
        // TODO code application logic here
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int t = Integer.parseInt(sc.nextLine());
        SimpleDateFormat myDate = new SimpleDateFormat("dd/MM/yyyy");
        ArrayList<Employee> solve = new ArrayList<>();
        while(t-- > 0){
            solve.add(new Employee(sc.nextLine().trim().toLowerCase(), sc.nextLine(), myDate.parse(sc.nextLine()), myDate.parse(sc.nextLine()), Long.parseLong(sc.nextLine())));
        }
        Collections.sort(solve);
        for(Employee x: solve){
            System.out.println(x);
        }
    }
}
