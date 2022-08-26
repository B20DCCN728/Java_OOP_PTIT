/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xau_doi_xung;
import java.util.*;
import java.lang.*;
public class Xau_Doi_Xung {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String input = sc.next();
            int res = 0;
            int n = input.length();
            for(int i = 0;i < n / 2;i++){
               if(input.charAt(i) != input.charAt(n - i - 1)) res++;
            } 
            if(res == 1||(n % 2 == 1&&res == 0)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
}
