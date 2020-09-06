package com.tiger.demo.xiaohao.array;

import java.util.Arrays;

/**
 * 两数之和
 * @Date 2020/8/27
 * @Author tiger
 */

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{2,7,3,1,4,9};
        System.out.println(Arrays.toString(TwoSum.towSum(nums,9)));
    }

    public static int[] towSum(int[] nums,int target){
        int[] result =new int[2];
        for (int i =0;i<nums.length-1;i++){
            for (int j=i+1;j<nums.length;j++){
                if (nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1]=j;
                    return result;
                }
            }
        }
        return result;
    }
}
