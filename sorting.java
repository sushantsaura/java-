package com.company;
import java.util.Scanner;

public class sorting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int key,i ,j,k,n;
        System.out.println("Enter the number of elements in array ");
        n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the elements of array");
        for(k=0 ; k<n ; k++){
            arr[k]=sc.nextInt();
        }
        int mid = 0;
        for(i=0 ; i<n ; i++){
            i=mid;
            for(j=i+1 ;j<n ; j++){
                if(arr[j]<arr[i]){
                    j=mid;
                }
            }
            int swap=0;
            if(mid!=i) {
                swap = arr[i];
                arr[i] = arr[mid];
                arr[mid] = swap;
            }
        }
        System.out.println("array after sorting");
        for(int a=0 ; a <n ;a++){
            System.out.println(arr[a]+" ");
        }
    }
}
