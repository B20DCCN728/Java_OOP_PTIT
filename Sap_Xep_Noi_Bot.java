/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sap_xep_noi_bot;

import java.util.*;

public class Sap_Xep_Noi_Bot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 5];
        for(int i = 0;i < n;i++) arr[i] = sc.nextInt();
        for(int i = 0;i < n;i++){
            int ok = 1;
            for(int j = 1;j < n;j++){
                if(arr[j] < arr[j - 1]){
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                    ok = 0;
                }
            }
            if(ok == 1) break;
            System.out.print("Buoc " + (i + 1) + ": ");
            for(int j = 0;j < n;j++) System.out.print(arr[j] + " ");
            System.out.println();
        }
    }
    
}
