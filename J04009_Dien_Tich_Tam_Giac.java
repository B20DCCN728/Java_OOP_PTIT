package dien_tich_tam_giac;

import java.util.*;
import java.lang.*;
import java.text.*;

class AreaofTriangle{
    private double x, y, a, b, c;
    public AreaofTriangle(Scanner sc){
        this.x = sc.nextDouble();
        this.y = sc.nextDouble();
    }
    protected boolean isCheck(AreaofTriangle A, AreaofTriangle B){
        this.a = Math.sqrt((A.x - B.x) * (A.x - B.x) + (A.y - B.y) * (A.y - B.y));
        this.b = Math.sqrt((B.x - this.x) * (B.x - this.x) + (B.y - this.y) * (B.y - this.y));
        this.c = Math.sqrt((A.x - this.x) * (A.x - this.x) + (A.y - this.y) * (A.y - this.y));
        if(a + b > c && b + c > a && a + c > b) return true;
        else return false;
    }
    protected double Result(){
        return Math.sqrt((a + b + c) * (a + b - c) * (a - b + c) * (- a + b + c)) / 4;
    }
}

public class Dien_Tich_Tam_Giac {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            AreaofTriangle a = new AreaofTriangle(sc);
            AreaofTriangle b = new AreaofTriangle(sc);
            AreaofTriangle c = new AreaofTriangle(sc);
            if(c.isCheck(a, b)){
                System.out.printf("%.2f", c.Result());
                System.out.println();
            }
            else {
                System.out.println("INVALID");
            }
        }
    }
    
}
