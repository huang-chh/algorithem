package com.tiger.demo.xiaohao.array;

/**
 * 求股票买卖的最佳时机
 * @Date 2020/8/25
 * @Author tiger
 */

public class StockExchange {
    public static void main(String[] args) {
        int[] prices ={7,1,5,3,4,6};
        System.out.println(StockExchange.getMaxProfit(prices));

    }

    public static int getMaxProfit(int[] prices){
        if (prices==null || prices.length<1){
            return 0;
        }
        int maxProfit =0;
        for (int i = 0; i < prices.length-1; i++) {
            if (prices[i]<prices[i+1]){
                maxProfit += prices[i+1] -prices[i];
            }
        }
        return maxProfit;
    }

}
