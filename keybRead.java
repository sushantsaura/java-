package com.company;
import java.util.Scanner;

public class keybRead {
    public static void main(String[] args){
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an integer : ");
        int a = sc.nextInt();
        //System.out.println("enter an flaot number : ");
      //float b = sc.nextFloat();
       int b = sc.nextInt();
       int c=a+b;
        System.out.println("sum of two number is : "+c);
        System.out.println("enter a line detail about product : ");
        Scanner p=new Scanner(System.in);
        String s ;
        s = p.nextLine();
        System.out.println("printing : "+s);
}
         */

        Scanner sc = new Scanner(System.in);
        sc.useRadix(3);
        int a =sc.nextInt();
        System.out.println(a);


    }
}
