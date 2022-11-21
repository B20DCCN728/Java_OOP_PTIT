//Created by Campus
package go_ban_phim;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
public class Go_Ban_Phim {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> st = new Stack<>(), rev = new Stack<>();
        for(int i = 0;i < s.length();i++){
            char x = s.charAt(i);
            if(x == '>'){
                if(!rev.empty()){
                    st.push(rev.pop());
                }
            }
            else if(x == '<'){
                if(!st.empty()){
                    rev.push(st.pop());
                }
            }
            else if(x == '-'){
                if(!st.empty()){
                    st.pop();
                }
            }
            else {
                st.push(x);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.empty()){
            sb.append(st.pop());
        }
        sb = sb.reverse();
        System.out.print(sb);
        while(!rev.empty()){
            System.out.print(rev.pop());
        }
        System.out.println();
    }
    
}
