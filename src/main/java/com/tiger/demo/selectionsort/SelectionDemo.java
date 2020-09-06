package com.tiger.demo.selectionsort;

import com.tiger.demo.utils.MyArrayUtils;

import java.util.Arrays;
import java.util.Random;

/**
 * @Date 2020/7/12
 * @Author tiger
 * 选择排序算法
 */

public class SelectionDemo {
    public static void main(String[] args) {
        int[] ints = {3,5,2,7,4,9,6,1,8};
        selectionSort(ints);
    }

    public static void selectionSort(int[] ints){
        System.out.println("选择排序前："+Arrays.toString(ints));
        for (int j = 0; j <ints.length -1; j++) {
            int min=j;
            //这层循环主要是为了找出数组最小的下标；
            for (int i = j+1; i < ints.length; i++) {
                if(ints[i]<ints[min]){
                    min = i;
                }
            }
            //交换
            int temp = ints[j];
            ints[j] = ints[min];
            ints[min] =temp;
//            System.out.println("第"+(j+1)+"次排序后："+Arrays.toString(ints));
        }
        System.out.println("选择排序后："+Arrays.toString(ints));
    }


}
