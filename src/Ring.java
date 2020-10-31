public class Ring {

  // DO NOT CHANGE THE FOLLOWING
  private class RingNode {
    Object obj;
    RingNode next;
 
    RingNode(Object j) {
      obj = j;
      next = null;  
    }
  }

  private RingNode head;
  private RingNode curr;

  public Ring() {
    head = curr = null;
  }
  
  // print out the content of the ring
  // starting from the head node
  public String toString() {
    String s = "";

    RingNode curr = head;
    if (curr == null) return s;

    s += curr.obj.toString();
    while (curr.next != head) {
      curr = curr.next;
      s += ", " + curr.obj.toString();
    }

    return s;
  }
  ////////////////////////////////////////

  // PUT YOUR CODES BELOW HERE
  public void addObj(Object obj) {
	  RingNode newNode = new RingNode (obj);
	  if (head == null) {
		  head = newNode;
		  head.next = curr = head;
	  }
	  else {
		  newNode.next = head.next;
		  head.next = newNode;
	  }
  }
  
  public int size() { 
      int count = 1; 
      
	  if (head == null) {
		  return 0;
	  }
	  RingNode temp = head.next;
	  if (head != null) {
		  while (temp != head) 
	      {
	          count++; 
	          temp = temp.next; 
	      } 
	  }
      return count; 
  }
  
  public Object getCurrObj() {
	  return curr.obj;
  }
  
  public void removeCurrObj() {
	  RingNode temp = head;
	  if (head == null) {
		  head = null;
		  curr = null;
	  }
	  
	  if (head != curr) {
		  while (curr != temp.next) {
			  temp = temp.next;
		  }
		  temp.next = curr.next;
		  curr = curr.next;
	  }
	  
	  else {
		  if (head.next != head) {
			  while (temp.next != head) {
				  temp = temp.next;
			  }
			  temp.next = curr.next;
			  curr = curr.next;
			  head = curr;
		  }
		  else {
			  head = null;
		  }
	  }
  }
  
  public void advance() {
	  curr = curr.next;
  }
}
