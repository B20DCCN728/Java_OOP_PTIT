package gia_tri_nhi_phan;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;

public class Gia_Tri_Nhi_Phan {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String[] nq = sc.nextLine().split(" ");
        int n = Integer.parseInt(nq[0]);
        int[] solve = new int[n + 1];
        int q = Integer.parseInt(nq[1]);
        while(q-- > 0){
            String[] np = sc.nextLine().split(" ");
            int x = Integer.parseInt(np[0]);
            int y = Integer.parseInt(np[1]);
            for(int i = x - 1;i < y;i++){
                if(solve[i] == 1) solve[i] = 0;
                else solve[i] = 1;
            }
        }
        for(int i = 0;i < n;i++){
            System.out.print(solve[i] + " ");
        }
    }
    
}
