package com.example.demo;

/**
 * Created by EX-GUOZHENPING002 on 2019-5-30.
 * 第十一题
 */
public class test10 {

    public static void main(String[] args) {
        int[] myList;
        myList = new int[5];
        myList[0] = 1;
        myList[1]=3;
        myList[2]=8;
        myList[3]=2;
        myList[4]=4;
        System.out.println(getIndex(myList,8));
        System.out.println(getIndex(myList,9));
        System.out.println(getIndex(myList,1));
        ;
    }
    /*
     * 数组arr
     * 查找seachValue*/

    public static int getIndex(int[] arr,int seachValue){
        int min = 0;
        int max = arr.length-1;
        int mid = (min+max)/2;
        while(arr[mid]!=seachValue){
            if (arr[mid]<seachValue){
                min = mid+1;
            }
            else if (arr[mid]>seachValue){
                max = mid - 1;
            }
            mid = (min + max)/2;
            if (min > max){
                return -1;
            }
        }
        return mid;

    }


}