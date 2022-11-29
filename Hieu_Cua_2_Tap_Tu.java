//Created by Campus
package hieu_cua_2_tap_tu;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.text.*;
//
public class Hieu_Cua_2_Tap_Tu {
    public static void main(String[] args) throws IOException {
            WordSet s1 = new WordSet("DATA1.in");
            WordSet s2 = new WordSet("DATA2.in");
            System.out.println(s1.difference(s2));
            System.out.println(s2.difference(s1));
        }
}
