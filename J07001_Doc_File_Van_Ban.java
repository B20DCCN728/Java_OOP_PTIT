package doc_file_van_ban;
import java.io.*;
import java.util.*;

public class Doc_File_Van_Ban {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        try{
            File solve = new File("DATA.in");
            Scanner myReader = new Scanner(solve);
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
        } catch(FileNotFoundException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
}
