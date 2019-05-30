package com.example.demo;
import java.util.*;
/**
 * Created by EX-GUOZHENPING002 on 2019-5-30.
 * 第十二题
 */
public class test11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            int m = in.nextInt();
            sxh(n,m);
        }
    }
    public static void sxh(int n,int m){
        int flag = 0;
        int i;
        for (i=n;i<m;i++){
            int sum;
            int g = i%10;//个位
            int s = i/10%10;//十位
            int b = i/100;//百位
            sum = (int)Math.pow(g,3)+(int)Math.pow(s,3)+(int)Math.pow(b,3);
            if (sum == i){
                System.out.println("水仙花"+i);
                flag = 1;
            }
        }
        if (flag == 0){
            System.out.println("无水仙花数");
        }
    }
}