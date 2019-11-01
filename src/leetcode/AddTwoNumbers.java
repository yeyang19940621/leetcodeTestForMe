package leetcode;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1,ListNode l2){
        ListNode dump = new ListNode(0);
        ListNode curr = dump;
        ListNode p1 =l1,p2=l2;
        int sum = 0;

        while(p1 != null || p2 != null){
             if(p1 != null){
                 sum += p1.val;
                 p1 = p1.next;
             }
             if(p2 != null){
                 sum += p2.val;
                 p2 = p2.next;
             }
             curr.next = new ListNode(sum % 10);
             sum = sum/10;
             curr = curr.next;
        }
        if(sum==1){
            curr.next = new ListNode(sum);
        }

        return dump;
    }
}


class ListNode{
    int val;
    ListNode next = null;
    public  ListNode(int val){
        this.val = val;
    }
}