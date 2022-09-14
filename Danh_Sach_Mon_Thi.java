package danh_sach_mon_thi;
import java.io.*;
import java.lang.*;
import java.math.*;
import java.util.*;
//
class Object{
    private String code, objectName, form;
    public Object(String code, String objectName, String form){
        this.code = code;
        this.objectName = objectName;
        this.form = form;
    }
    protected String getCode(){
        return this.code;
    }
    @Override 
    public String toString(){
        return this.code + " " + this.objectName + " " + this.form;
    }
}
//
public class Danh_Sach_Mon_Thi {
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Object> solve = new ArrayList<>();
        while(t-- > 0){
            solve.add(new Object(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(solve, new Comparator<Object>(){
            @Override
            public int compare(Object o1, Object o2){
                return o1.getCode().compareTo(o2.getCode());
            }
        });
        for(Object x : solve) {
            System.out.println(x);
        }
    }
    
}
