
public class LinkedList {

	private Node head;

	public void insertLast(int pID, String name) {
		// create a new Node and store a data.
		Node node = new Node();
		node.PID = pID;
		node.name = name;
		node.nextNode = null;

		// check the head is null or not.
		// if head is null, assign the Node and exit.
		if (this.head == null) {
			head = node;
			return;
		}

		// assign a head into the temp Node and loop it until find the null reference.
		Node tempNode = this.head;
		while (tempNode.nextNode != null) {
			tempNode = tempNode.nextNode;
		}

		// assign new node.
		tempNode.nextNode = node;
	}

	public void insertFirst(int pID, String name) {

	}

	public void delete(int pID) {

		if (this.head == null) {
			return;
		}
		// print all nodes
		Node tempNode = this.head;
		Node prevNode = null;

		while (tempNode != null) {
			if (tempNode.PID == pID) {
				System.out.print(tempNode.name + " " + tempNode.PID + " delete");
				if (tempNode == head) {
					head = head.nextNode;
				} else { // fixed indenting/newline
					prevNode.nextNode = tempNode.nextNode;
				}
				// fixed indenting

			} else {
				// only advance the prevNode when there's no match.
				prevNode = tempNode;
			}
			tempNode = tempNode.nextNode;

		}

		//tempNode = tempNode.nextNode;
	
		System.out.println("NULL");

	}
	
	
	
	public void deleteFirst() {

		if (this.head == null) {
			return;
		}
		// print all nodes
		Node tempNode = this.head;
		Node prevNode = null;

		while (tempNode != null) {
			System.out.print(tempNode.name + " " + tempNode.PID + " delete");
			if (tempNode == head) {
				head = head.nextNode;
			} else { // fixed indenting/newline
				prevNode.nextNode = tempNode.nextNode;
			}
			// fixed indenting
			tempNode = tempNode.nextNode;
			break;

		}

		//tempNode = tempNode.nextNode;
	
		System.out.println("NULL");

	}
	

	public void print() {
		if (this.head == null) {
			return;
		}
		// print all nodes
		Node tempNode = this.head;
		while (tempNode != null) {
			System.out.print(tempNode.name + " " + tempNode.PID + "->");
			tempNode = tempNode.nextNode;
		}
		System.out.println("NULL");
	}

}