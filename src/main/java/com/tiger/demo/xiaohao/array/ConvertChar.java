package com.tiger.demo.xiaohao.array;

import java.util.Arrays;
import java.util.List;

/**
 * @Date 2020/9/1
 * @Author tiger
 */

public class ConvertChar {
    public static void main(String[] args) {
        String s = "LEETCODEISHIRING";
        System.out.println(ConvertChar.convert(s,3));
    }
    public static String convert(String s, int numRows) {
        if (numRows==1){
            return s;
        }
        String[] arr = new String[numRows];
        Arrays.fill(arr,"");
        char[] chars = s.toCharArray();
        int period = 2*numRows -2;
        for (int i=0;i<chars.length;i++){
            int mod = i%period;
            if (mod<numRows){
                arr[mod]=(arr[mod]==null?""+chars[i]:arr[mod]+chars[i]);
            }else{
                arr[period-mod]+=chars[i];
            }
        }
        StringBuffer sb = new StringBuffer("");
        for (String s1:arr){
            sb.append(s1);
        }
        return sb.toString();
    }
}
