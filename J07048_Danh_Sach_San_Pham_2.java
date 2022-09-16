//CampusETH
package danh_sach_san_pham_2;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
//
class Product implements Comparable<Product>{
    private String code, name;
    private int sellPrice, period;
    public Product(String code, String name, int sellPrice, int period){
        this.code = code;
        this.name = name;
        this.sellPrice = sellPrice;
        this.period = period;
    }
    protected int getSellPrice(){
        return this.sellPrice;
    }
    
    protected String getCode(){
        return this.code;
    }
    
    @Override
    public int compareTo(Product t){
        if(t.getSellPrice() != this.getSellPrice()) return t.getSellPrice() - this.getSellPrice();
        return this.getCode().compareTo(t.getCode());
    }
    
    @Override
    public String toString(){
        return this.code + " " + this.name + " " + this.sellPrice + " " + this.period;
    }
}
public class Danh_Sach_San_Pham_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        ArrayList<Product> set = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            set.add(new Product(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(set);
        for(Product x : set){
            System.out.println(x);
        }
    }
    
}
