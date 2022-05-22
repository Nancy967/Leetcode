package AddTwoNumbers;

import java.util.Random;

public class solutionLo {

	public static void main(String[] args) {
		
		//創建ListNode
        class ListNode {
			 int val;
			 ListNode next;
			 ListNode() {}
			 ListNode(int val) { this.val = val; }
			 ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		}
		 
		
		//L1 ListNode
		int countL1 = 0;
		 
		ListNode p = new ListNode(0);
		ListNode h = p;
		ListNode l1 = h;
		 
		while(countL1<=4) {
		    Random r=new Random(); 
			ListNode c = new ListNode(r.nextInt(9));
			p.next = c;
			p = c;
			countL1++;
		}
		 
		System.out.print("[");
		while(h.next.next!=null) {
		    System.out.print(h.next.val + ",");
	    	h=h.next;
	    }
		System.out.print(h.next.val +"]");
		System.out.println(" ");
		
		
		//L2 ListNode
		 
        int countL2 = 0;
		 
		ListNode pre = new ListNode(0);
		ListNode head = pre;
		ListNode l2 = head;
		 
		while(countL2<=2) {	 
		    Random r=new Random(); 
			ListNode cur = new ListNode(r.nextInt(9));
			pre.next = cur;
			pre = cur;
			countL2++;
		}
		 
		System.out.print("[");
		while(head.next.next!=null) {
		    System.out.print(head.next.val + ",");
	    	head=head.next;
	    }
		System.out.print(head.next.val +"]");
		 
		 
		//l1+l2
		 
		ListNode prev1 = new ListNode(0);
		ListNode head1 = prev1;
		int carry = 0;
		while (l1.next != null || l2.next != null || carry != 0) {
		    ListNode cur1 = new ListNode(0);
			int sum = ((l1.next == null) ? 0 : l1.next.val) + ((l2.next == null) ? 0 : l2.next.val) + carry;
			cur1.val = sum % 10;
			carry = sum / 10;
			prev1.next = cur1;
			prev1 = cur1;
			            
			l1.next = (l1.next == null) ? l1.next : l1.next.next;
			l2.next = (l2.next == null) ? l2.next : l2.next.next;
		}
		 
		System.out.println(" ");
		System.out.print("[");
		while(head1.next.next!=null) {
		    System.out.print(head1.next.val + ",");
	    	head1=head1.next;
	    }
		System.out.print(head1.next.val +"]");
	}
}