package com.tiger.demo.xiaohao.link;

/**
 * @Date 2020/9/6
 * @Author tiger
 */

public class TwoSum {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(2);
        ListNode listNode = TwoSum.addTwoNumbers(l1, l2);


    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode p0 =result;
        int num1=0,num2=0,temp=0;
        while (true){
            if (l1==null&&l2==null){
                if (temp>0){
                    p0.next =new ListNode(temp);
                }
                return result.next;
            }
            num1 = l1==null?0:l1.val;
            num2 = l2==null?0:l2.val;
            int sum = num1+num2+temp;
            temp = sum/10;
            p0.next = new ListNode(sum%10);
            p0 = p0.next;
            l1 = l1==null?null:l1.next;
            l2 = l2==null?null:l2.next;
        }
    }

}
