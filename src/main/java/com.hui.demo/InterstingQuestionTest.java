package com.hui.demo;

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * 示例：
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */
public class InterstingQuestionTest {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode finallyListNode = new ListNode(0);
        ListNode next = l1.next;
        //是否加一
        boolean addOne = false;

        int val1 = l1.val;
        int val2 = l2.val;
        int i;
        if (addOne){
            i = val1 + val2 + 1;
            if (i >= 10){
                i = i - 10;
                addOne = true;
            }
        }else {
            i = val1 + val2;
            addOne = false;
        }



        return finallyListNode;

    }

    public static void main(String[] args){
        ListNode l1 = new ListNode(3);
        ListNode next = l1.next;
        next = new ListNode(0);
        ListNode next1 = next.next;
        next1 = new ListNode(5);
        System.out.println(l1.val);
        System.out.println(l1.next.val);

    }
}
