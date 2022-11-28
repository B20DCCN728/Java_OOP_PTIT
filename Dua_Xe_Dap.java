//Created by Campus
package dua_xe_dap;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
public class Dua_Xe_Dap {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<CuaRo> solve = new ArrayList<>();
        SimpleDateFormat myDate = new SimpleDateFormat("hh:mm");
        for(int i = 0;i < n;i++){
            solve.add(new CuaRo(sc.nextLine(), sc.nextLine(), myDate.parse(sc.nextLine())));
        }
        Collections.sort(solve);
        for(CuaRo x: solve){
            System.out.println(x);
        }
    }
    
}
