
public class FindMid {

	public static void main(String[] args) {
		
		
		
		
		
		
		
		
	}
	
	private static Node findMidEle(Node head) {
		if(head == null || head.next == null) {
			return head;
		} else {
			Node start = head;
			Node end = head;
			
			while(end != null && end.next != null ) {
				start = start.next;
				end = end.next.next;
			}
			return start;
		}
	}

}
