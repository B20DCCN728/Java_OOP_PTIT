package danh_sach_mat_hang;
//
import java.util.*;
import java.lang.*;
import java.math.*;
import java.text.*;
//
class Items{
    static int x = 0;
    private String tmp = "";
    private String name, cal;
    private int profit, sellprice, buyprice;
    
    public Items(Scanner sc){
        this.name = sc.nextLine();
        this.cal = sc.nextLine();
        this.buyprice = Integer.parseInt(sc.nextLine());
        this.sellprice = Integer.parseInt(sc.nextLine());
        this.profit = sellprice - buyprice;
        x++;
        this.tmp = this.tmp + Integer.toString(x);
        while(this.tmp.length() != 3) this.tmp = "0" + this.tmp;
        this.tmp = "MH" + this.tmp;
    }
    
    protected String getCode(){
        return this.tmp;
    }
    
    protected String getName(){
        return this.name;
    }
    
    protected String getCal(){
        return this.cal;
    }
    
    protected int getBuyPrice(){
        return this.buyprice;
    }
    
    protected int getSellPrice(){
        return this.sellprice;
    }
    
    protected int getProfit(){
        return this.profit;
    }
}

class sortItems implements Comparator<Items>{
    @Override
    public int compare(Items o1, Items o2){
        return o2.getProfit() - o1.getProfit();
    }
}

public class Danh_Sach_Mat_Hang {

    /**
     * @CampusETH
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Items> items = new ArrayList<>();
        for(int i = 0;i < n;i++){
            items.add(new Items(sc));
        }
        Collections.sort(items, new sortItems());
        for(int i = 0;i < n;i++){
            System.out.print(items.get(i).getCode() + " " + items.get(i).getName() + " " + items.get(i).getCal() + " " + items.get(i).getBuyPrice() + " " + items.get(i).getSellPrice() + " " + items.get(i).getProfit());
            System.out.println();
        }
    }
    
}
