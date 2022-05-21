package AddTwoNumbers;

public class ListNodeThough {
    public static void main(String[] args) {
    	class ListNode{
    		int val;
    		ListNode next=null;
    		ListNode(int val){this.val=val;}
    	}
    	ListNode nodestr=new ListNode(0);
    	ListNode nextNode;
    	nextNode=nodestr;
    	    
    	for(int i = 0; i<10; i++) {
    	    ListNode newnode=new ListNode(i);
    	    nextNode.next=newnode;
    	    nextNode = nextNode.next;
    	}
    	nextNode=nodestr;
    	    
    	while(nextNode!=null) {
    	    System.out.println(nextNode.val);
    	    nextNode=nextNode.next;
    	}
    }
}