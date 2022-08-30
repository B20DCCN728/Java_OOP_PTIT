package khai_bao_lop_hinh_chu_nhat;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
class Rectange{
    private double width;
    private double heigth;
    private String color;
    
    protected Rectange(Scanner sc){
        this.width = sc.nextDouble();
        this.heigth = sc.nextDouble();
        String s = sc.next();
        this.color = s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }
    protected void setWidth(double width){
        this.width = width;
    }
    protected void setHeigth(double heigth){
        this.heigth = heigth;
    }
    protected void setColor(String color){
        this.color = color;
    }
    protected double getWidth(){
        return this.width;
    }
    protected double getHeigth(){
        return this.heigth;
    }
    protected String getColor(){
        return this.color;
    }
    protected boolean isCheck(){
        int Wid = (int)this.width;
        int Hei = (int)this.heigth;
        if(Wid != this.width||Hei != this.heigth||Wid <= 0||Hei <= 0) 
            return false;
        return true;
    }
    protected double findArea(){
        return this.width * this.heigth;
    }
    protected double findPerimeter(){
        return (width + heigth) * 2;
    }
    void Out(){
        if(!isCheck()){
            System.out.println("INVALID");
        }
        else{
            System.out.println((int)findPerimeter() + " " + (int)findArea() + " " + getColor());
        }
    }
}
public class Khai_Bao_Lop_Hinh_CHu_Nhat {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Rectange rec = new Rectange(sc);
        rec.Out();
    }
    
}
