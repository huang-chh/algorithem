package com.tiger.demo.insertionsort;

import java.util.Arrays;

/**
 * @Date 2020/7/12
 * @Author tiger
 */

public class ShellDemo {
    public static void main(String[] args) {
        int[] ints = {3,5,2,7,4,9,6,1,8,15,11,10,12};
        insertionSort(ints);
    }
    public static void insertionSort(int[] ints){
        System.out.println("插入排序前："+ Arrays.toString(ints));
        //这里引入knuth序列
        int h=1;
        while (h < ints.length/3){
            h = h*3 + 1;
        }
        for (int gap = h; gap >0 ; gap=(gap-1)/3) {
            for (int i = gap; i < ints.length; i++) {
                for (int j = i; j >gap-1; j-=gap) {
                    if (ints[j]<ints[j-1]){
                        int temp =ints[j];
                        ints[j] = ints[j-1];
                        ints[j-1] = temp;
                    }
                }
            }
        }
        System.out.println("插入排序后："+Arrays.toString(ints));
    }
}
