package com.company;
import java.util.Scanner;

public class searching {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements of in array");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("enter the elments of array ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // searching processs started



       /*
        System.out.println("enter the element you want to search : ");
        int search = sc.nextInt();

        */
        /*                   linear search started
        int flag=0,j;
        for(j=0 ;j<n;j++ ){
            if(a[j]==search){
                flag=1;
                break;
            }


        }
        if(flag==1){
            System.out.println("number found is at index "+j);
        }else{
            System.out.println("number not found");
        }

    }
}


         */

        /*
                                    binary search started


        int mid, low = 0, high = n - 1;
        while (low < high) {
            mid = (low + high) / 2;
            if (a[mid] < search) {
                low = mid + 1;
            } else if (a[mid] == search) {
                System.out.println("number found at index " + mid);
                break;
            } else {
                high = mid - 1;
            }
        }
  }
}


         */
    }
}