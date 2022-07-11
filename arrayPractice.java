package com.company;

public class arrayPractice {
    public static void main(String[] args){
        /*
                           // one dimentional array
        int a[]=new int[10];
        int b[]={10,23,34,45,5,34,234};
        int c[];
        c=new int[20];

        for(int i=0 ; i<a.length ; i++){
            System.out.println(a[i]++);
        }
        for(int x:a){
            System.out.println(x);
        }
        for(int i=0 ; i<b.length ; i++){
            System.out.println(b[i]);
        }

         */


        //                                    2-d array

        int [][]c=new int[5][5];
        int d[][]={{1,2,3},{4,5,6,},{7,8,9}};


        for(int i=0 ; i <c.length ; i++){
            for(int j=0 ; j<c.length ; j++){
                System.out.print(c[i][j]+ " ");
            }
            System.out.println("");
        }

        for(int x[]:d){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println("");
        }

        int arr[][]=new int[3][];
        arr[0]=new int[2];
        arr[1]=new int[5];
        arr[2]=new int[3];
        for(int v[]:arr){
            for(int b:v){
                System.out.print(b+" ");
            }
            System.out.println("");
        }


    }
}
