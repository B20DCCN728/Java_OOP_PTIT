package tra_cuu_don_hang;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
//
class Product{
    private String name, code, typeCode, num;
    private long price, count, discount, total;
    public Product(Scanner sc){
        this.name = sc.nextLine();
        this.code = sc.nextLine();
        this.typeCode = this.code.substring(4);
        this.num = this.code.substring(1, 4);
        this.price = Long.parseLong(sc.nextLine().trim());
        this.count = Long.parseLong(sc.nextLine().trim());
    }
    
    private long getDiscount(){
        if(this.typeCode.compareTo("1") == 0)
            return this.price * this.count / 2;
        return 3 * this.price * this.count / 10;
    }
    private long getTotal(){
        return (this.price * this.count) - this.getDiscount();
    }
    
    @Override
    public String toString(){
        return this.name + " " + this.code + " " + this.num + " " + this.getDiscount() + " " + this.getTotal();
    }
}
//
public class Tra_Cuu_Don_Hang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());
        ArrayList<Product> set = new ArrayList<>();
        while(t-- > 0){
            set.add(new Product(sc));
        }
        for(Product x : set){
            System.out.println(x);
        }
    }
    
}
