package com.tiger.demo.xiaohao.array;

/**
 * 求最大公共前缀
 * @Date 2020/8/23
 * @Author tiger
 */

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"ba","ab"};
        System.out.println(LongestCommonPrefix.getLongestCommonPrefix(strs));
    }

    public static String getLongestCommonPrefix(String[] strs){
        if (strs ==null||strs.length==0){
            return "";
        }else if(strs.length==1){
            return strs[0];
        }else{
            String target = strs[0];
            String result ="";
            for(int i=0;i<target.length();i++){
                result = target.substring(0,i+1);
                for (String str :strs){
                    if(str.indexOf(result,0)!=0){
                        if (i==0){
                            return "";
                        }else{
                            return target.substring(0,i);
                        }
                    }
                }
            }
            return result;
        }
    }


}
