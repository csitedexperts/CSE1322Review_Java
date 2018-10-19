package queueImplementation;

// Please watch: https://www.youtube.com/watch?v=wjI1WNcIntg
class Node {
	int id;
	String name;
	Node next; 

	public Node(int id, String name){
		this.id = id;
		this.name = name;
	}

	public void displayANode(){
		System.out.println("id: " + id + " name:" + name );
	}

	public String toString(){   // Required
		return name;
	}

}  // End of the Node class

class Queue {

	Node top;
	Node tail;

	Queue(){   // Optional 
		top = null;  // null initialization
		tail = null;  // null initialization
		// Here to show the head and tail always start as null
	}

	public boolean isempty() {
		return(top == null);
	}

	public void peek() {
		System.out.println("The top node's id is : " + top.id);
	}


	public void enQueue(int id, String name) {
		Node node = new Node(id, name);

		if (top == null) {
			top = node;
		}
		else {
			tail.next = node;
		}
		tail = node;
	}

	public void deQueue() {
		int id = top.id;
		String name = top.name;
		top = top.next;
		if (top == null) {
			tail = null;
		}
		System.out.println("The node with Id: " + id + " and Name: "+ name + "  is deleted " );
	}


	public void displayAllNodes(){

		Node thisNode = top;

		while(thisNode != null){
			thisNode.displayANode();
			System.out.println("Next Node: " + thisNode.next);
			thisNode = thisNode.next;
			System.out.println();
		}

	}



}  // end of the Queue Class


public class QueueImplementationExplained {


	public static void main(String[] args) {

		System.out.println("Queue Implementation Explained ....... ");

		Queue myq = new Queue();
		
		myq.enQueue(1, "AA");
		System.out.println("myq.top = " + myq.top);
		System.out.println("myq.tail = " + myq.tail);
		
		System.out.println("myq.top.next = " + myq.top.next);
		System.out.println("myq.tail.next = " + myq.tail.next);
		
		myq.enQueue(2, "BB");
		
	
		myq.enQueue(3, "CC");
		myq.enQueue(4, "DD");
		myq.enQueue(5, "EE");
	
		myq.peek();

		myq.displayAllNodes();

		myq.deQueue();
		myq.deQueue();
		myq.deQueue();
		myq.peek();

		myq.displayAllNodes();

	}

}
