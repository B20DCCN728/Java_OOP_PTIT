//Created by Campus
package dua_xe_dap;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
class CuaRo implements Comparable<CuaRo>{
    private String code = "", name, group;
    private Date end;
    private SimpleDateFormat myDate = new SimpleDateFormat("hh:mm");
    private double vanToc;
    public CuaRo(String name, String group, Date end) throws ParseException{
        this.name = name;
        this.group = group;
        this.end = end;
        this.setCode();
        this.setVanToc();
        
    }
    private void setCode(){
        String formatGroup[] = group.split(" ");
        for(int i = 0;i < formatGroup.length;i++){
            this.code += formatGroup[i].charAt(0);
        }
        String formatName[] = name.split(" ");
        for(int i = 0;i < formatName.length;i++){
            this.code += formatName[i].charAt(0);
        }
    }
    private void setVanToc() throws ParseException{
        Date fault = myDate.parse("6:00");
        long tmp = end.getTime() - fault.getTime();
        long time = TimeUnit.MINUTES.convert(tmp, TimeUnit.MILLISECONDS);
        this.vanToc = 120 / ((double)time / 60);
    }
    @Override
    public int compareTo(CuaRo s){
        return Double.compare(s.vanToc, this.vanToc);
    }
    @Override
    public String toString(){
        return this.code + " " + this.name + " " + this.group + " " + Math.round(vanToc) + " Km/h";
    }
}

//
public class Dua_Xe_Dap {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<CuaRo> solve = new ArrayList<>();
        SimpleDateFormat myDate = new SimpleDateFormat("hh:mm");
        for(int i = 0;i < n;i++){
            solve.add(new CuaRo(sc.nextLine(), sc.nextLine(), myDate.parse(sc.nextLine())));
        }
        Collections.sort(solve);
        for(CuaRo x: solve){
            System.out.println(x);
        }
    }
    
}
