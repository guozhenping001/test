package com.example.demo;

/**
 * Created by EX-GUOZHENPING002 on 2019-5-30.
 * 第五题
 */
public class test5 {
    public static void main(String[] args) {
        s1("&&&hhh&&&", "&");
        s1("111hjkl11", "1");
        s1("  hjkl;l", " ");
        s1("ggg  **","*");
    }

    public static String s1(String str, String ch) {
        if (str.startsWith(ch) && str.endsWith(ch)) {
            String str1 = str.replace(ch, "");
            System.out.println("新字符串" + str1);
            return str1;

        }
        else {
            System.out.println("原值"+str);
            return str;
        }

    }
}