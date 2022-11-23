//Created by Campus
package tong_chu_so;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
public class Tong_Chu_So {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        // TODO code application logic here
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> data = (ArrayList<String>) sc.readObject();
        sc.close();
        for(int i = 0;i < data.size();i++){
            String res = "";
            int sum = 0;
            for(int j = 0;j < data.get(i).length();j++){
                if(data.get(i).charAt(j) >= '0'&&data.get(i).charAt(j) <= '9'){
                    res += data.get(i).charAt(j);
                    sum += data.get(i).charAt(j) - '0';
                }
            }
            while(res.charAt(0) == '0') res = res.substring(1);
            System.out.println(res + " " + sum);
        }
    }
    
}
