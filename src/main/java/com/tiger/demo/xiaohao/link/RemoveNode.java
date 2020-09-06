package com.tiger.demo.xiaohao.link;

/**
 * @Date 2020/8/27
 * @Author tiger
 */

public class RemoveNode {
    public static void main(String[] args) {

    }
    private static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = new ListNode(0);
        pre.next=head;
        ListNode start =pre,end =pre;
        while (n!=0){
            start = start.next;
            n--;
        }
        while (start.next!=null){
            start =start.next;
            end= end.next;
        }
        end.next=end.next.next;
        return pre.next;
    }

}

