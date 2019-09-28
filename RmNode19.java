
public class RmNode19 {

	public static void main(String[] args) {
		
	}
	
	public ListNode removeNthFromEnd(ListNode head, int n) {
		
		if (head == null ) return head;
		if (head.next == null && n == 1) return null;
		
		ListNode p1 = head, p2 = head;
		int count = 1, m=n;
		while(p1.next != null) {
			
			count ++;
			if (m>0) {
			
				m --;
				p1 = p1.next;
				
			} else {
				
				p1 = p1.next;
				p2 = p2.next;
				
			}
			
		}
		
		if (n==count)
			return head.next;
		else if (n==1)
			p2.next = null;
		else
			p2.next = p2.next.next;
		
		return head;
	}
	
	
	public class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) { val = x; }
	}

}
