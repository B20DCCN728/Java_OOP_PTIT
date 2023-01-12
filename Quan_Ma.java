//Created by Campus
package quan_ma;
import java.lang.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.time.*;
import java.io.*;
class Point{
    private int x, y, step;
    public Point(int x, int y, int step){
        this.x = x;
        this.y = y;
        this.step = step;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int getStep(){
        return step;
    }
    public boolean isEqual(Point cmp){
        if(x == cmp.getX()&&y == cmp.getY()) return true;
        else return false;
    }
}
public class Quan_Ma {
    final static int dx[] = {-2, -1, 1, 2, -2, -1, 1, 2};
    final static int dy[] = {-1, -2, -2, -1, 1, 2, 2, 1};
    static int getResult(Point start, Point end){
        Queue<Point> q = new LinkedList<>();
        boolean [][] visited = new boolean[9][9];
        q.add(start);
        visited[start.getX()][start.getY()] = true;
        while(!q.isEmpty()){
            Point tmp = q.poll();
            if(tmp.isEqual(end)){
                return tmp.getStep();
            }
            for(int i = 0;i < 8;i++){
                int x = tmp.getX() + dx[i];
                int y = tmp.getY() + dy[i];
                if(x >= 1&&x <= 8&&y >= 1&&y <= 8&&visited[x][y] == false){
                    Point cnt = new Point(x, y, tmp.getStep() + 1);
                    if(cnt.isEqual(end)) return cnt.getStep();
                    visited[x][y] = true;
                    q.add(cnt);
                }
            }         
        }
        return 0;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String [] data = sc.nextLine().split(" ");
            Point start = new Point(data[0].charAt(0) - 'a' + 1, data[0].charAt(1) - '0' , 0);
            Point end = new Point(data[1].charAt(0) - 'a' + 1, data[1].charAt(1) - '0' , 0);
            System.out.println(getResult(start, end));
        }
    }
    
}
