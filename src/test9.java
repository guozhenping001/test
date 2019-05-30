package com.example.demo;

import java.util.Arrays;

/**
 * Created by EX-GUOZHENPING002 on 2019-5-30.
 * 第九题，第十题
 */
public class test9 {
    public static void main(String[] args) {
        //声明数组
        int[] myList;
        //创建了一个数组长度为5
        myList = new int[5];
//        double[] mylist = new double[];//声明和创建数组方式1
//        double[] mylist = {1.1,2.0,3.3}//声明和创建数组方式2
        //添加元素
        myList[0] = 1;
        myList[1]=3;
        myList[2]=8;
        myList[3]=2;
        myList[4]=4;
        //输出每个元素的时候需要用循环，不能直接输出,for循环
        for (int i = 0; i < myList.length;i++){
            System.out.println(myList[i]);
        }
        //for-each循环
        for (int d:myList){
            System.out.println("for-each输出"+d);
        }

        //冒泡排序
        for (int i = 0; i<myList.length;i++){
            for (int j=i+1;j<myList.length;j++){
                if (myList[i]>myList[j]){
                    int temp = myList[i];
                    myList[i]=myList[j];
                    myList[j]=temp;
                }
            }
        }
        //输出冒泡排序后的数组
        for (int d:myList){
            System.out.println("冒泡排序"+d);
        }




    }
    //排序
    public static void sort(int[] myList){
        Arrays.sort(myList);
        for (int d:myList){
            System.out.println("排序后输出"+d);
        }

    }
}