package com.company;
import java.util.Scanner;

public class ArrayProblem {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element in array : ");
        int i, j;
        int n = sc.nextInt();
        int a[] = new int[n];
        for (i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (i = 0; i < n; i++) {
            sum = sum + a[i];
        }
        System.out.println("sum of elemnts of array is : " + sum);
        int flag = 0;
        System.out.println("enter element you want to find index of it : ");
        int search = sc.nextInt();
        for (i = 0; i < a.length; i++) {
            if (search == a[i]) {
                flag = 1;
                break;
            }
        }
        if (flag != 0) {
            System.out.println("element found at index : " + i);
        } else {
            System.out.println("element not found ");
        }
        for (i = 0; i < a.length-1; i++) {
            int min = i;
            for (j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            int swap = a[min];
            a[min] = a[i];
            a[i] = swap;
        }
        for(int x=0 ; x<a.length ; x++){
            System.out.print(a[x]+" ");
        }
        System.out.println("the largest element of array is "+a[n-1]);
        System.out.println("tne second last element of array is "+a[n-2]);
    }
}

