//Created by Campus
package bien_doi_s.t;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
class Pair<S, T>{
    private S first;
    private T second;
    public Pair(S first, T second){
        this.first = first;
        this.second = second;
    }
    public S getFirst(){
        return this.first;
    }    
    public S setFirst(S first){
        return this.first = first;
    }  
    public T getSecond(){
        return this.second;
    }
    public T setSecond(T second){
        return this.second = second;
    }  
}
//
public class Bien_Doi_ST {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            HashMap<Integer, Integer> visited = new HashMap<>();
            Queue<Pair<Integer, Integer>> q = new LinkedList<>();
            q.add(new Pair<>(a, 0));
            while(!q.isEmpty()){
                Pair<Integer, Integer> tmp = q.poll();
                if(tmp.getFirst() == b){
                    System.out.println(tmp.getSecond());
                }
                if(tmp.getFirst() < b&&!visited.containsKey(tmp.getFirst() * 2)){
                    visited.put(tmp.getFirst() * 2, 1);
                    q.add(new Pair<>(tmp.getFirst() * 2, tmp.getSecond() + 1));
                }
                if(tmp.getFirst() > 1&&!visited.containsKey(tmp.getFirst() - 1)){
                    visited.put(tmp.getFirst() - 1, 1);
                    q.add(new Pair<>(tmp.getFirst() - 1, tmp.getSecond() + 1));                   
                }
            }
        }
    }
    
}
