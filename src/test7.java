package com.example.demo;

/**
 * Created by EX-GUOZHENPING002 on 2019-5-30.
 * 第七题
 */
public class test7 {
    public static void main(String[] args) {
        s1("dddabc_","ABC_");
        s1("DDDDABC_","abc_");
        s1("ddddabc_","abc_");
        s1("DDDABC_","ABC_");
        s1("sdsdabc_","abc-");
    }
    public static void s1(String str,String ch) {
        String str1 = str.toUpperCase();
        String ch1 = ch.toUpperCase();
        System.out.println(str1.endsWith(ch1));
    }

}