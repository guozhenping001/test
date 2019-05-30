package com.example.demo;

/**
 * Created by EX-GUOZHENPING002 on 2019-5-30.
 * 第六题
 */
public class test6 {
    public static void main(String[] args) {
        s1("abc_DDDD","ABC_");
        s1("ABC_ffff","abc_");
        s1("abc_DDDD","abc_");
        s1("ABC_ffff","ABC_");
        s1("abc_DDDD","ABC-");
        s1("ABC_ffff","abc-");
    }

    public static void s1(String str,String ch) {
        String str1 = str.toUpperCase();
        String ch1 = ch.toUpperCase();
        System.out.println(str1.startsWith(ch1));
    }

}