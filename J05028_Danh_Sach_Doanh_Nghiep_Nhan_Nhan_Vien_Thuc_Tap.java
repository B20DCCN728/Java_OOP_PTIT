package danh_sach_doanh_nghiep_nhan_nhan_vien_thuc_tap;
import java.io.*;
import java.lang.*;
import java.math.*;
import java.util.*;
//
class Enterprise{
    private String code, eprise;
    private int student;
    //
    public Enterprise(String code, String eprise, int student){
        this.code = code;
        this.eprise = eprise;
        this.student = student;
    }
    protected String getCompany(){
        return this.code;
    }
    //
    protected int getNumberOfStudent(){
        return this.student;
    }
    //
    @Override
    public String toString(){
        return this.code + " " + this.eprise + " " + this.student;
    }
    //
}

public class Danh_Sach_Doanh_Nghiep_Nhan_Nhan_Vien_Thuc_Tap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ArrayList<Enterprise> set = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            set.add(new Enterprise(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(set, new Comparator<Enterprise>(){
            @Override
            public int compare(Enterprise o1, Enterprise o2){
                if(o2.getNumberOfStudent() != o1.getNumberOfStudent()) return o2.getNumberOfStudent() - o1.getNumberOfStudent();
                return o1.getCompany().compareTo(o2.getCompany());
            }
        });
        for(Enterprise x : set){
            System.out.println(x);
        }
    }
    
}
