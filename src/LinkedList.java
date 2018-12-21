
public class LinkedList {
	
	private Node head;

    public void insert(int pID, String name) {
        //create a new Node and store a data.
        Node node = new Node();
        node.PID = pID;
        node.name = name;
        node.nextNode = null;

        //check the head is null or not.
        //if head is null, assign the Node and exit.
        if (this.head == null) {
            head = node;
            return;
        }

        //assign a head into the temp Node and loop it until find the null reference.
        Node tempNode = this.head;
        while (tempNode.nextNode != null) {
            tempNode = tempNode.nextNode;
        }

        //assign new node.
        tempNode.nextNode = node;
    }

    public void print() {
        if (this.head == null) {
            return;
        }
        //print all nodes
        Node tempNode = this.head;
        while (tempNode != null) {
            System.out.print(tempNode.name + "->");
            tempNode = tempNode.nextNode;
        }
        System.out.println("NULL");
    }

}
