//Created by Campus
package tim_ngay_het_han_bao_hanh;
import java.lang.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.time.*;
import java.io.*;
//
class Clients implements Comparable<Clients>{
    static int id = 0;
    private String code, name, address, productCode;
    private int count, total;
    private Products product;
    private Date purchaseDate, expiryDate;
    private SimpleDateFormat myDate = new SimpleDateFormat("dd/MM/yyyy");
    public Clients(String name, String address, String productCode, int count, Date purchaseDate){
        id += 1;
        this.code = String.format("KH%02d", id);
        this.name = name;
        this.address = address;
        this.productCode = productCode;
        this.count = count;
        this.purchaseDate = purchaseDate;
        this.product = Products.list.get(this.productCode);
        this.expiryDate = this.setExpiryDate();
        this.total = this.product.getPrice() * this.count;
    }
    private Date setExpiryDate(){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(purchaseDate);
        calendar.add(Calendar.MONTH, product.getTime());
        return calendar.getTime();
    }
    @Override
    public int compareTo(Clients x){
        if(!this.expiryDate.equals(x.expiryDate)) return this.expiryDate.compareTo(x.expiryDate);
        return this.code.compareTo(x.code);
    }
    @Override
    public String toString(){
        return code + " " + name + " " + address + " " + productCode + " " + total + " " + myDate.format(expiryDate);
    }
}
//
public class Tim_Ngay_Het_Han_Bao_Hanh {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("MUAHANG.in"));
        SimpleDateFormat myDate = new SimpleDateFormat("dd/MM/yyyy");
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0;i < n;i++){
            Products tmp = new Products(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            Products.list.put(tmp.getCode(), tmp);
        }
        n = Integer.parseInt(sc.nextLine());
        ArrayList<Clients> solve = new ArrayList<>();
        for(int i = 0;i < n;i++){
            solve.add(new Clients(sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), myDate.parse(sc.nextLine())));
        }
        Collections.sort(solve);
        for(Clients x: solve){
            System.out.println(x);
        }
    }
    
}
