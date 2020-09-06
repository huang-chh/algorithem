package com.tiger.demo.xiaohao.link;

/**
 * 给定两个升序的链表，将他们合并成为一条链表
 * 使用递归的思想
 * @Date 2020/9/2
 * @Author tiger
 */

public class MergeListNode {
    public static void main(String[] args) {

    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null){
            return l2;
        }else if(l2 == null){
            return l1;
        }else if(l1.val<l2.val){
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }else{
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}
