package com.company;

public class stringPractice4 {
    public static void main(String[] args){
        String str="f";
        System.out.println(str.matches("."));
        String str1="a";
        System.out.println(str1.matches("[abc]")); //this is for only one character
        String str2="b5";
        System.out.println(str2.matches("[a-z][1-9]"));
        String str3="g";
        System.out.println(str3.matches("[^abc]"));//this is also for one charcter only
        String str4="ac";
        System.out.println(str4.matches("[ab][cd]"));
        String str5="a";
        System.out.println(str5.matches("[a|b]"));
        String str6="xz";
        System.out.println(str6.matches("[xz]"));
    }
}
