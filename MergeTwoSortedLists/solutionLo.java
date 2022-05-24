package MergeTwoSortedLists;

import java.util.Random;

public class solutionLo {

	public static void main(String[] args) {
		//創建ListNode
        class ListNode{
        	 int val;
			 ListNode next;
			 ListNode() {}
			 ListNode(int val) {this.val=val;}
			 ListNode(int val, ListNode next){this.val=val; this.next=next;}
		}
        
        //陣列由小排到大(l1)
        Random r=new Random();
        int i=0, j=0;
        int[] c=new int[5]; //***
        for(i=0; i<c.length; i++){
        	c[i]=r.nextInt(9);
        }
        
        for(j=1; j<c.length; j++){
        	for(i=0; i<c.length-j; i++){
            	if(c[i]>c[i+1]){
                	int temp=c[i];
                	c[i]=c[i+1];
                	c[i+1]=temp;
            	}
            }
        }
        
        for(i=0; i<c.length; i++){
        	System.out.print(c[i]+" ");
        }
        System.out.println(" ");
        
        //設成ListNode(l1) ***
        ListNode l1 = new ListNode(0);
        ListNode a1 = new ListNode(c[0]);
        l1.next = a1;
        ListNode a2 = new ListNode(c[1]);
        l1.next.next = a2;
        ListNode a3 = new ListNode(c[2]);
        l1.next.next.next = a3;
        ListNode a4 = new ListNode(c[3]);
        l1.next.next.next.next = a4;
        ListNode a5 = new ListNode(c[4]);
        l1.next.next.next.next.next = a5;
        
        
        //陣列由小排到大(l2)
        Random random=new Random();
        int[] d=new int[3]; //***
        for(i=0; i<d.length; i++){
        	d[i]=random.nextInt(9);
        }
        
        for(j=1; j<d.length; j++) {
        	for(i=0; i<d.length-j; i++) {
            	if(d[i]>d[i+1]) {
                	int temp = d[i];
                	d[i]=d[i+1];
                	d[i+1]=temp;
            	}
            }
        }
        
        for(i=0; i<d.length; i++){
        	System.out.print(d[i]+" ");
        }
        System.out.println(" ");
        
        //設成ListNode(l2) ***
        ListNode l2 = new ListNode(0);
        ListNode b1 = new ListNode(d[0]);
        l2.next = b1;
        ListNode b2 = new ListNode(d[1]);
        l2.next.next = b2;
        ListNode b3 = new ListNode(d[2]);
        l2.next.next.next = b3;
        
        
        //l1、l2由小排到大
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while(l1.next != null && l2.next != null){
            if(l1.next.val <= l2.next.val){
                curr.next = l1.next;
                l1.next = l1.next.next;
            }else{
                curr.next = l2.next;
                l2.next = l2.next.next;
            }
            curr = curr.next;
        }
        curr.next = l1.next == null? l2.next:l1.next;
        while(dummy.next!=null) {
        	dummy=dummy.next;
    	    System.out.print(dummy.val + " ");
        }

	}

}
