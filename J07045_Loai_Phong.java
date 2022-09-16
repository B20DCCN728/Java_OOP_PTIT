//CampusETH
package loai_phong;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
//
class LoaiPhong implements Comparable<LoaiPhong>{
    private String typeRoom, nameRoom, price, fee;
    public LoaiPhong(String solve){
        String[] tmp = solve.split(" ");
        this.typeRoom = tmp[0];
        this.nameRoom = tmp[1];
        this.price = tmp[2];
        this.fee = tmp[3];
    }
    public String getNameRoom(){
        return this.nameRoom;
    }
    @Override
    public int compareTo(LoaiPhong a){
        return this.getNameRoom().compareTo(a.getNameRoom());
    }
    @Override
    public String toString(){
        return this.typeRoom + " " + this.nameRoom + " " + this.price + " " + this.fee;
    }
}
//
public class Loai_Phong {
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-- > 0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}
