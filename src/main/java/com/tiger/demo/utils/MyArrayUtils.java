package com.tiger.demo.utils;

import java.util.Random;

/**
 * @Date 2020/7/12
 * @Author tiger
 */

public class MyArrayUtils {
    public static int[] generateArrs(int bound){
        Random random = new Random();
        int[] arrs = new int[bound];
        for (int i = 0; i <arrs.length ; i++) {
            arrs[i] = random.nextInt(bound);
        }
        return arrs;
    }
}
