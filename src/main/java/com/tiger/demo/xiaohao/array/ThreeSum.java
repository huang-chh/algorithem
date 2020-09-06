package com.tiger.demo.xiaohao.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 三个数之和等于0
 * @Date 2020/8/29
 * @Author tiger
 */

public class ThreeSum {
    public static void main(String[] args) {
//        int[] nums = new int[]{0,0,0,0};
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        System.out.println(ThreeSum.threeSum(nums).toString());
    }

    public static List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        //先排序
        Arrays.sort(nums);
        for (int i=0;i<nums.length-2;i++){
            //排序后，如果找的第一个数字大于了，后面的就不用看了
            if (nums[i]>0){
                break;
            }
            //去重
            if(i>0&& nums[i] ==nums[i-1]){
                continue;
            }
            //这里采用双指针法，前后之和找到-nums[i]
            int left =i+1;
            int right = nums.length-1;
            int target = -nums[i];
            while (left<right){
                if (nums[left]+nums[right]==target){
                    result.add(new ArrayList<>(Arrays.asList(nums[i],nums[left],nums[right])));
                    left++;
                    right--;
                    //去重
                    while (left<right && nums[left-1]==nums[left]){
                        left++;
                    }
                    //去重
                    while (left<right && nums[right+1]==nums[left]){
                        right--;
                    }
                }else if(nums[left]+nums[right]<target){
                    left++;
                }else {
                    right--;
                }
            }
        }
        return result;
    }


}
