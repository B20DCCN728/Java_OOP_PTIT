//Created by Campus
package tinh_gia_tri_bieu_thuc;
import java.lang.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.time.*;
import java.io.*;
//6x3+2-(6-4/2)
public class Tinh_Gia_Tri_Bieu_Thuc {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String solve = sc.nextLine();
            Stack<Character> prefix = new Stack<>();
            Queue<String> q = new LinkedList<>();
            String s = "";
            for(int i = 0;i < solve.length();i++){
                if(solve.charAt(i) >= '0'&&solve.charAt(i) <= '9'){
                    s += solve.charAt(i);
                }
                else if(solve.charAt(i) == '('){
                    prefix.push(solve.charAt(i));
                }
                else if(solve.charAt(i) == ')'){
                    if(!s.equals("")){
                        q.add(s);
                        s = "";
                    }
                    while(prefix.peek() != '('){
                        q.add("" + prefix.pop());
                    }
                    prefix.pop();
                }
                else if(solve.charAt(i) == '+'||solve.charAt(i) == '-'){
                    if(!s.equals("")){
                        q.add(s);
                        s = "";
                    }
                    if(prefix.isEmpty()){
                        prefix.push(solve.charAt(i));
                        continue;
                    }
                    if(prefix.peek() == '/'||prefix.peek() == 'x'){
                        q.add("" + prefix.pop());
                        prefix.push(solve.charAt(i));
                    }
                    //6x((4x3)+5)
                    else {
                        prefix.push(solve.charAt(i));
                    }
                }
                else {
                    if(!s.equals("")){
                        q.add(s);
                        s = "";
                    }
                    prefix.add(solve.charAt(i));
                }
            }
            if(!s.equals("")){
                q.add(s);
            }
            while(!prefix.isEmpty()){
                q.add("" + prefix.pop());
            }
//                while(!q.isEmpty()){
//                    System.out.println(q.poll());
//                }
            Stack<Integer> p = new Stack<>();
            while(!q.isEmpty()){
                try {
                    int k = Integer.parseInt(q.peek());
                    //System.out.println(k);
                    p.add(k);
                    q.poll();
                }
                catch(Exception e) {
                    int s1 = p.pop();
                    int s2 = p.pop();
                    int s3;
                    if(q.peek().equals("x")) {
                        s3 = s1 * s2;
                        p.push(s3);
                    }
                    else if(q.peek().equals("/")) {
                        s3 = s2 / s1;
                        p.push(s3);
                    }
                    else if(q.peek().equals("+")) {
                        s3 = s1 + s2;
                        p.push(s3);
                    }
                    else {
                        s3 = s2 - s1;
                        p.push(s3);
                    }
                    q.poll();
                    //System.out.println(s3);
                }
            }    
            System.out.println(p.pop());
        }
    }
    
}
