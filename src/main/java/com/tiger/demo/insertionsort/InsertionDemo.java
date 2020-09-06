package com.tiger.demo.insertionsort;

import java.util.Arrays;

/**
 * @Date 2020/7/12
 * @Author tiger
 */

public class InsertionDemo {
    public static void main(String[] args) {
        int[] ints = {3,5,2,7,4,9,6,1,8};
        insertionSort(ints);
    }
    public static void insertionSort(int[] ints){
        System.out.println("插入排序前："+ Arrays.toString(ints));
        for (int i = 1; i < ints.length; i++) {
            for (int j = i; j >0; j--) {
                if (ints[j]<ints[j-1]){
                    int temp =ints[j];
                    ints[j] = ints[j-1];
                    ints[j-1] = temp;
                }
            }
        }
        System.out.println("插入排序后："+Arrays.toString(ints));
    }

}
