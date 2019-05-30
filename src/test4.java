package com.example.demo;

/**
 * Created by EX-GUOZHENPING002 on 2019-5-30.
 * 第四题
 */
public class test4 {


    public static void main(String[] args) {
        s1("  222  ");
        s1("   333");
        s1("444    ");
        s1("f f f");
        s1("");
//            System.out.println("dfgdghdhgdrh");
        s1("   ");
    }

    /*去右边空格*/
    public static String s1(String str) {

        if (str.endsWith(" ")) {
            String str1 = str.replaceAll("(\\s*$)", "");
            System.out.println("去掉空格后" + str1);
            return str1;

        } else {
            System.out.println("不需要去空格" + str);
            return str;
        }

    }
}