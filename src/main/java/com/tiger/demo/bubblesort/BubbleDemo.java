package com.tiger.demo.bubblesort;

import com.tiger.demo.utils.MyArrayUtils;

import java.util.Arrays;

/**
 * @Date 2020/7/12
 * @Author tiger
 * 冒泡排序
 */

public class BubbleDemo {
    public static void main(String[] args) {
        int[] ints = {3,5,2,7,4,9,6,1,8};
        bubbleSort(ints);
    }


    public static void bubbleSort(int[] ints){
        System.out.println("选择排序前："+Arrays.toString(ints));
        for (int i = ints.length; i > 1; i--) {
            for (int j = 0; j < i-1; j++) {
                if(ints[j]>ints[j+1]){
                    int temp = ints[j+1];
                    ints[j+1] = ints[j];
                    ints[j] = temp;
                }
            }
        }
        System.out.println("选择排序后："+Arrays.toString(ints));
    }
}
