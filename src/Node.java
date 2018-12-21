
public class Node {
	
	int PID;
	String name;
	String lastname;
	String email;
	String city;
	String phone;
	
    Node nextNode;

	public Node() {
		super();
	}
	
	public void nextNode(Node temp) {
		// TODO Auto-generated method stub
		nextNode = temp;
	}
   
    
}
