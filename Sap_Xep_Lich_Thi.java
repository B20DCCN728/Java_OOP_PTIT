//Created by Campus
package sap_xep_lich_thi;
import java.lang.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.time.*;
import java.io.*;
//
public class Sap_Xep_Lich_Thi {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        // TODO code application logic here
        Scanner sc_1 = new Scanner(new File("MONTHI.in"));
        Scanner sc_2 = new Scanner(new File("CATHI.in"));
        Scanner sc_3 = new Scanner(new File("LICHTHI.in"));
        SimpleDateFormat myDate_1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat myDate_2 = new SimpleDateFormat("HH:mm");
        int n = Integer.parseInt(sc_1.nextLine());
        for(int  i = 0;i < n;i++){
            MonThi tmp = new MonThi(sc_1.nextLine(), sc_1.nextLine(), sc_1.nextLine());
            MonThi.list.put(tmp.getMaMon(), tmp);
        }
        n = Integer.parseInt(sc_2.nextLine());
        for(int  i = 0;i < n;i++){
            CaThi tmp = new CaThi(myDate_1.parse(sc_2.nextLine()), myDate_2.parse(sc_2.nextLine()), sc_2.nextLine());
            CaThi.list.put(tmp.getMaCaThi(), tmp);
        }
        n = Integer.parseInt(sc_3.nextLine());
        ArrayList<LichThi> solve = new ArrayList<>();
        for(int i = 0;i < n;i++){
            String [] tmp = sc_3.nextLine().split(" ");
            solve.add(new LichThi(tmp[0], tmp[1], tmp[2], tmp[3]));
        }
        Collections.sort(solve);
        for(LichThi x: solve){
            System.out.println(x);
        }
    }
    
}
