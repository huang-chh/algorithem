package com.tiger.demo.xiaohao.array;

import java.util.Arrays;

/**
 * 旋转数组
 * @Date 2020/8/25
 * @Author tiger
 */

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {3,4,5,6,7};
        RotateArray.rotate(nums,2);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotate(int[] nums,int rate){
        int[] result = new int[nums.length];
        for (int i=0;i<nums.length;i++){
            result[(i+rate)%nums.length] = nums[i];
        }
        System.arraycopy(result, 0, nums, 0, nums.length);
    }


}
