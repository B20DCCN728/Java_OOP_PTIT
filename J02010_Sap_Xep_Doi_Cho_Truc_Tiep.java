/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sap_xep_doi_cho_truc_tiep;

import java.util.*;

public class Sap_Xep_Doi_Cho_Truc_Tiep {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //int t = sc.nextInt();
        //while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n + 5];
            for(int i = 0;i < n;i++) arr[i] = sc.nextInt();
            for(int i = 0;i < n - 1;i++){
                System.out.print("Buoc " + (i + 1) + ": ");
                for(int j = i + 1;j < n;j++){
                    if(arr[i] > arr[j]) //arr[i] = arr[i] ^ arr[j] ^ (arr[j] = arr[i]);
                }
                for(int j = 0;j < n;j++) System.out.print(arr[j] + " ");
                System.out.println();
            }
        //}
    } 
}
