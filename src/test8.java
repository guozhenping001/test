package com.example.demo;

/**
 * Created by EX-GUOZHENPING002 on 2019-5-30.
 * 第八题
 */
public class test8 {
    public static void main(String[] args) {
        toUpperFirst("Hjjjjj");
        toUpperFirst("hkkkkk");
        toUpperFirst("");
        toUpperFirst("HHHHH");



    }


    public static String toUpperFirst(String str) {
        if (str.trim().length() > 0) {
            if (Character.isUpperCase(str.charAt(0))) {
                String str1 = str.substring(1).toLowerCase();
                String str_new = str.substring(0, 1).concat(str1);
                System.out.println(str_new);
                return str_new;
            }
            else if (Character.isLowerCase(str.charAt(0))) {
                String str1 = str.substring(0, 1).toUpperCase();
                String str2 = str.substring(1).toLowerCase();
                String str_new = str1.concat(str2);
                System.out.println(str_new);
                return str_new;
            }
        } else if (str.trim().equals("")){
            System.out.println("输入字符串异常,输入为" +"”"+ str+"“");
            return str;
        }
        return null;
    }

}