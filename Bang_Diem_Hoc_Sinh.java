package bang_diem_hoc_sinh;
import java.io.*;
import java.lang.*;
import java.math.*;
import java.util.*;
//
class Point{
    static int id = 0;
    private String code = "HS", name, gpa;
    private double gpaPoint = 0;    
    public Point(Scanner sc) {
        id += 1;
        this.code += String.format("%02d", id);
        this.name = sc.nextLine();
        String[] Data = sc.nextLine().replaceAll("\\s+", " ").split(" ");
        double[] data = new double[11];
        for(int i = 0;i < 10;i++){
            data[i] = Double.parseDouble(Data[i]);
            this.gpaPoint += data[i];
        }
        this.gpaPoint += data[0] + data[1];
        this.gpaPoint = Math.round(this.gpaPoint / 12 * 10.0) / 10.0;
        this.gpa = String.valueOf(this.gpaPoint);
    }
    private String getType(){
        if(this.gpaPoint >= 9) return "XUAT SAC";
        if(this.gpaPoint <= 8.9 && this.gpaPoint >= 8) return "GIOI";
        if(this.gpaPoint <= 7.9 && this.gpaPoint >= 7) return "KHA";
        if(this.gpaPoint <= 6.9 && this.gpaPoint >= 5) return "TB";
        return "YEU";
    }
    protected String getCode(){
        return this.code;
    }
    protected double getGpa(){
        return this.gpaPoint;
    }
    @Override
    public String toString(){
        return this.code + " " + this.name + " " + this.gpa + " " + getType();
    }
}
public class Bang_Diem_Hoc_Sinh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Point> set = new ArrayList<>();
        while(t-- > 0){
            set.add(new Point(sc));
        }
        Collections.sort(set, new Comparator<Point>(){
            @Override
            public int compare(Point o1, Point o2){
                if(o1.getGpa() < o2.getGpa()) return 1;
                if(o1.getGpa() > o2.getGpa()) return -1;
                return o1.getCode().compareTo(o2.getCode());
            }
        });
        for(Point x : set){
            System.out.println(x);
        }
    }
    
}
