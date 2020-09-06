package com.tiger.demo.xiaohao.array;

import java.util.Arrays;
import java.util.Map;

/**
 * @Date 2020/8/23
 * @Author tiger
 * 求两个数组的交集
 */

public class InterSection {
    public static void main(String[] args) {
        int[] nums1 ={4,9,5,4};
        int[] nums2 ={9,4,9,8};
        int[] result = InterSection.getInterSection(nums1, nums2);
        System.out.println(Arrays.toString(result));

        int[] nums3 ={1,1,2,2,3,3};
        int[] nums4 ={1,3,3};
        int[] result2 = InterSection.getSortedInterSection(nums3, nums4);
        System.out.println(Arrays.toString(result2));
    }

    /**
     * 未排序求交集
     * @param nums1
     * @param nums2
     * @return
     */
    public static int[] getInterSection(int[] nums1,int[] nums2){
        if (nums1==null ||nums2==null){
            return null;
        }
        int size = Math.max(nums1.length, nums2.length);
        int[] result =new int[size];
        int[] usage = new int[size];
        int a =0;
        for (int item : nums1) {
            for (int j=0;j<nums2.length;j++) {
                if (item == nums2[j] && usage[j]!=1) {
                    result[a] = item;
                    a++;
                    usage[j] =1;
                    break;
                }
            }
        }
        result = Arrays.copyOf(result,a);
        return result;
    }

    /**
     * 求排序后的数组交集
     * @param nums1
     * @param nums2
     * @return
     */
    public static int[] getSortedInterSection(int[] nums1, int[] nums2){
        if(nums1==null || nums2==null){
            return null;
        }
        int i =0;
        int j =0;
        int a =0;
        int size = Math.max(nums1.length,nums2.length);
        int[] result = new int[size];
        while (i<nums1.length &&j<nums2.length){
            if (nums1[i]==nums2[j]){
                result[a] = nums1[i];
                i++;
                j++;
                a++;
            }else if(nums1[i]>nums2[j]){
                j++;
            }else{
                i++;
            }
        }
        result = Arrays.copyOf(result,a);
        return result;
    }

}
