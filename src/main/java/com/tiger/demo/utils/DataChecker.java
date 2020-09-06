package com.tiger.demo.utils;

import com.tiger.demo.bubblesort.BubbleDemo;
import com.tiger.demo.insertionsort.InsertionDemo;
import com.tiger.demo.selectionsort.SelectionDemo;

import java.util.Arrays;

/**
 * @Date 2020/7/12
 * @Author tiger
 * 算法验证器
 */

public class DataChecker {
    public static void main(String[] args) {
        int[] ints = MyArrayUtils.generateArrs(100);
        int[] ints2 = new int[ints.length];
        System.arraycopy(ints,0,ints2,0,ints.length);
        Arrays.sort(ints);
        //选择排序
//        SelectionDemo.selectionSort(ints2);
        //冒泡排序
//        BubbleDemo.bubbleSort(ints2);
        //插入排序
        InsertionDemo.insertionSort(ints2);
        boolean isEqual =true;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] !=ints2[i]){
                isEqual =false;
                break;
            }
        }
        System.out.println("算法验证结果："+isEqual);
    }
}
