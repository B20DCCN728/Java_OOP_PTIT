package sap_xep_chon;

import java.util.*;

public class Sap_Xep_Chon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 5];
        for(int i = 0;i < n;i++) arr[i] = sc.nextInt();
        int min = 0;
        int t = 0;
        for(int i = 0;i < n - 1;i++){
            System.out.print("Buoc " + (i + 1) + ": ");
            min = arr[i];
            t = i;
            for(int j = i + 1;j < n;j++){
                if(arr[j] < min) {
                    min = arr[j];
                    t = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[t];
            arr[t] = tmp;
            for(int j = 0;j < n;j++) System.out.print(arr[j] + " ");
            System.out.println();
        }
    }
    
}
