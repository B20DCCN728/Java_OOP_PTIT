//Created by Campus
package so_phuc;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
public class So_Phuc {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            Complex a = new Complex(x1, y1);
            Complex b = new Complex(x2, y2);
            Complex c = Complex.multiply(Complex.add(a, b), a);
            Complex d = Complex.multiply(Complex.add(a, b), Complex.add(a, b));
            System.out.println(c + ", " + d);
        }
    }
    
}
