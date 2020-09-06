package com.tiger.demo.xiaohao.array;

import java.util.Arrays;

/**
 * @Date 2020/8/25
 * @Author tiger
 */

public class InstituDelete {
    public static void main(String[] args) {
        System.out.println(InstituDelete.removeElement(new int[]{3, 2, 2, 3},3));
    }

    public static int removeElement(int[] nums,int val){
        if (nums ==null||nums.length<1){
            return 0;
        }
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return i;

    }
}
