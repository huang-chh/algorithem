package com.tiger.demo.xiaohao.link;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 判断是否有环形链表
 * @Date 2020/9/5
 * @Author tiger
 */

public class HaveCycle {
    public static void main(String[] args) {
        ListNode l = new ListNode(0);
        System.out.println("l:"+l);
        ListNode l2 =l;
        System.out.println("l2:"+l2);
        Set<ListNode> set = new HashSet<ListNode>();
        set.add(l);
        set.add(l2);
        System.out.println(set.size());



    }

    /**
     * 根据hash进行判断
     * @param head
     * @return
     */
    public static boolean hasCycle(ListNode head){
        Set<ListNode> set = new HashSet<ListNode>();
        while (head!=null &&head.next!=null){
            if(set.contains(head.next)){
                return true;
            }else {
                set.add(head);
                head = head.next;
            }
        }
        return false;
    }

    /**
     * 通过快慢指针的方式（就像两个人在跑道上跑步，一快一慢）
     * 1、通过设置两个不同速率的指针，一快一慢，如果两个指针能够相遇，说明有环，否则没有；
     * @param head
     * @return
     */
    public static boolean hasCycle2(ListNode head){
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

}
