package com.company;

public class stringPractice2  {
    public static void main(String[] args){
        String str = "mr.sushant saurav";
        System.out.println(str.startsWith("ushant",4));
        System.out.println(str.endsWith("saurav"));
        System.out.println(str.indexOf("mr."));
        System.out.println(str.indexOf("sushant"));
        System.out.println(str.charAt(4));
        String str1 = new String("www.sauravsushant58@gmail.com");
        System.out.println(str1.lastIndexOf("."));
        String str3="pyramid";
        String str2="Pyramid";
        System.out.println(str3==str2);
        System.out.println(str3.equals(str2));
        System.out.println(str3.equalsIgnoreCase(str2));
        String str4=new String("chinawall");
        String str5="chinawall";
        System.out.println(str4==str5);
        System.out.println(str4.equals(str5));
        System.out.println(str+str1);
        System.out.println(str1.concat(str4));
    }
}
