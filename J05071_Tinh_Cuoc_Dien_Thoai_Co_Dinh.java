//Created by Campus
package tinh_cuoc_dien_thoai_co_dinh;
import java.lang.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.time.*;
import java.io.*;
//
class City {
    private String code, city;
    private int price;
    static HashMap<String, City> list_city = new HashMap<>();
    public City(String code, String city, int price){
        this.code = code;
        this.city = city;
        this.price = price;
    }
    public String getCode(){
        return code;
    }
    public String getCity(){
        return city;
    }
    public int getPrice(){
        return price;
    }
}
//
class Phone {
    private String phone, city;
    private SimpleDateFormat myDate = new SimpleDateFormat("HH:mm");
    private long totalTime, totalMoney, price;
    public Phone(String phone, Date start, Date end){
        this.phone = phone;
        this.totalTime = TimeUnit.MINUTES.convert(end.getTime() - start.getTime(), TimeUnit.MILLISECONDS);
        this.price = this.setPrice();
        this.totalMoney = this.price * this.totalTime;
    }
    private long setPrice(){
        if(phone.charAt(0) == '0'){
            String cmp = phone.substring(1, 3);
            this.city = City.list_city.get(cmp).getCity();
            return (long)City.list_city.get(cmp).getPrice();
        }
        else {
            this.city = "Noi mang";
            this.totalTime = Math.round((double)this.totalTime / 3);
            return 800L;
        }
    }
    @Override
    public String toString(){
        return phone + " " + city + " " + totalTime + " " + totalMoney;
    }
}

//
public class Tinh_Cuoc_Dien_Thoai_Co_Dinh {
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat myDate = new SimpleDateFormat("HH:mm");
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0;i < n;i++){
            City tmp = new City(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            City.list_city.put(tmp.getCode(), tmp);
        }
        ArrayList<Phone> list_phone = new ArrayList<>();
        int m = Integer.parseInt(sc.nextLine());
        for(int i = 0;i < m;i++){
            String [] tmp = sc.nextLine().split(" ");
            list_phone.add(new Phone(tmp[0], myDate.parse(tmp[1]), myDate.parse(tmp[2])));
        }
        for(Phone x: list_phone){
            System.out.println(x);
        }
    }
    
}
