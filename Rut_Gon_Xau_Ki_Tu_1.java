package rut_gon_xau_ki_tu_1;
//
import java.lang.*;
import java.util.*;
import java.math.*;
//
public class Rut_Gon_Xau_Ki_Tu_1 {
    //
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String solve = sc.nextLine();
        Stack<Character> set = new Stack<>();
        for(int i = 0;i < solve.length();i++){
            if(set.isEmpty()) {
                set.push(solve.charAt(i));
                continue;
            }
            char tmp = set.peek();
            if(solve.charAt(i) != tmp) set.push(solve.charAt(i));
            else{
                set.pop();
            }
        }
        if(set.isEmpty()) System.out.println("Empty String");
        else {
            for(char i : set) System.out.print(i);
        }
    }
    
}
