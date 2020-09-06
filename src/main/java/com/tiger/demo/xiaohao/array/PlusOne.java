package com.tiger.demo.xiaohao.array;

import java.util.Arrays;

/**
 * @Date 2020/8/27
 * @Author tiger
 */

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = new int[]{1,2,4};
        System.out.println(Arrays.toString(PlusOne.plusOne(digits)));
    }
    public static int[] plusOne(int[] digits){
        int[] result = new int[digits.length+1];
        int carry =1;
        for (int i = digits.length-1;i>=0;i--){
            int mod = (digits[i]+carry)%10;
            carry = (digits[i]+carry)/10;
            result[i+1]=mod;
        }
        if (carry==1){
            result[0]=1;
            return result;
        }else{
            result[0]=0;
            int[] newResult = new int[digits.length];
            System.arraycopy(result,1,newResult,0,digits.length);
            return newResult;
        }
    }
}
