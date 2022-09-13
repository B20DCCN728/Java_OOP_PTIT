//CampusETH
package danh_sach_mon_hoc;
import java.io.*;
import java.lang.*;
import java.math.*;
import java.util.*;
class Object{
    private String code, object, credit;
    public Object(Scanner sc){
        this.code = sc.nextLine();
        this.object = sc.nextLine();
        this.credit = sc.nextLine();
    }
    protected String getObject() {
        return this.object;
    }
    @Override 
    public String toString(){
        return this.code + " " + this.object + " " + this.credit;
    }
}
public class Danh_Sach_Mon_Hoc {

    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Object> set = new ArrayList<>();
        while(t-- > 0){
            set.add(new Object(sc));
        }
        Collections.sort(set, new Comparator<Object>(){
            @Override
            public int compare(Object o1, Object o2){
                return o1.getObject().compareTo(o2.getObject());
            }
        });
        for(Object x : set){
            System.out.println(x);
        }
    }
    
}
