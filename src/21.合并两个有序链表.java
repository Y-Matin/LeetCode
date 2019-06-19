/*
 * @lc app=leetcode.cn id=21 lang=java
 *
 * [21] 合并两个有序链表
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {

    // solution 1： 普通写法：不断遍历两个链表， 逻辑简单但 存在许多if-else判断
    // public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    //     ListNode result=null,temp=null;
    //     ListNode p1=l1,p2=l2;

    //     if(p1==null||p2==null)
    //         return (p1==null)?p2:p1;
    //     for(;p1!=null||p2!=null;)
    //     {
    //         if(p1==null)
    //         {
    //             temp.next=p2;
    //             break;
    //         }
    //         else if(p2==null)
    //         {
    //             temp.next=p1;
    //             break;
    //         }
    //         if(p1.val<=p2.val)
    //         {
    //             if(result==null)
    //             {
    //                 result=p1;
    //                 temp=result;
    //             }
    //             else
    //             {
    //                 temp.next=p1;
    //                 temp=temp.next;
    //             }
    //             p1=p1.next;
    //         }
    //         else
    //         {
    //             if(result==null)
    //             {
    //                 result=p2;
    //                 temp=result;
    //             }
    //             else
    //             {
    //                 temp.next=p2;
    //                 temp=temp.next;
    //             }
    //             p2=p2.next;
    //         }

    //     }
    //       return result;
    // } 


    // solution 2: 采用递归的方式 
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode l0 = null;
        if (l1.val<l2.val){
            l0=l1;
            l0.next=mergeTwoLists(l1.next,l2);
        }else {
            l0=l2;
            l0.next=mergeTwoLists(l1,l2.next);
        }
        return l0;
    }
}

