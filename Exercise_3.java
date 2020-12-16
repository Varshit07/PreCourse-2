// Time Complexity: O(N), Space Complexity: O(1)

class LinkedList 
{ 
    Node head; // head of linked list 
  
    /* Linked list node */
    class Node 
    { 
        int data; 
        Node next; 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
  
    /* Function to print middle of linked list */
   //Complete this function
    void printMiddle() 
    { 
	 /* If LL is empty then return */
        if(head == null) {
          	return;
        }
	// Initialize slow and fast pointers
	Node slow = head, fast = head;
	 
	// Loop until fast reaches the end of Linked List
	while(fast != null && fast.next != null) {
		// Move slow one node at a time
		slow = slow.next;
		// Move fast two nodes at a time		
		fast = fast.next.next;
        }
	    
      	// Print middle
      	System.out.println("Middle Element: " + slow.data );
    } 
  
    public void push(int new_data) 
    { 
        Node new_node = new Node(new_data); 
        new_node.next = head; 
        head = new_node; 
    } 

    public void printList() 
    { 
        Node tnode = head; 
        while (tnode != null) 
        { 
            System.out.print(tnode.data+"->"); 
            tnode = tnode.next; 
        } 
        System.out.println("NULL"); 
    } 
  
    public static void main(String [] args) 
    { 
        LinkedList llist = new LinkedList(); 
        for (int i=15; i>0; --i) 
        { 
            llist.push(i); 
            llist.printList(); 
            llist.printMiddle(); 
        } 
    } 
} 
