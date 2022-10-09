//Created by Campus
package liet_ke_theo_thu_tu_xuat_hien_file;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.io.*;
public class Liet_Ke_Theo_Thu_Tu_Xuat_Hien_FILE {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
        // TODO code application logic here
        ObjectInputStream ob = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        Scanner sc = new Scanner(new File("VANBAN.in"));
        ArrayList<String> solve = (ArrayList<String>) ob.readObject();
        LinkedHashSet<String> set = new LinkedHashSet<>();
        for(String x: solve){
            String[] a = x.trim().toLowerCase().split("\\s+");
            set.addAll(Arrays.asList(a));
        }
        while(sc.hasNext()){
            String a = sc.next().toLowerCase();
            if(set.contains(a)){
                System.out.println(a);
                set.remove(a);
            }
        }
        ob.close();
        sc.close();
    }
    
}
