package com.company;
//import java.util.Scanner;
public class methodPractice {
    /*
    static int add(int x, int y){
        int z;
        z=x+y;
        return z;
    }
    static void username(String n){
        System.out.println("hello mr "+n);
    }

     */
    static int changeValue(int a[],int value ,int index){
        a[index]=value;
        return value;
    }
    static void change(int a[]){
        a[0]=45;
    }

    public static void main(String[] args){
        /*

        //parameter passing in method

        System.out.println("enter two number to add ");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b = sc.nextInt();
        add(a,b);
        System.out.println("sum of two number is : "+add(a,b));

        String name=("sushant");
        username(name);

         */
        int arr[]={2,4,6,8,10};
        change(arr);
        changeValue(arr,15,4);
        System.out.println("elememts after imporvement is : ");
        for(int x:arr){
            System.out.print(x);
            System.out.print(" ");
        }


    }
}
