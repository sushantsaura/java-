package com.company;

public class stringPractice {
    public static void main(String[] args){
        String str="java program";
        String str1=new String("java");
        String str2="java program";
        char c[]={'h','e','l','l','o'};
        String str3=new String(c);
        byte b[]={65,66,67,68,69};
        String str4=new String(b);
        System.out.println( str3 +" " +str + " "+str1 +" " +str4 );
        System.out.println(str==str2);
        int length = str.length();
        System.out.println(length);
        String str5=str.toUpperCase();
        System.out.println(str5);
        String str6=str.toLowerCase();
        System.out.println(str6);
        String str7=str.trim();
        System.out.println(str7);
        String str8=str.substring(3);
        String str9=str.substring(3,9);
        String str10=str.replace('a','e');
        System.out.println(str8 +"\n"+ str9 +"\n"+ str10);

    }
}
