/*
I treid looking for IntNode Class in notes but I havnt found it there thus I tried making it 
as per my idea including some book refereces from this website
" https://home.cs.colorado.edu/~main/docs/edu/colorado/nodes/IntNode.html "
*/
public class IntNode {
	public int data;
	public IntNode n;
	
	
	public IntNode(int data, IntNode n) {
		this.data = data;
		this.n = n;
	}
    public IntNode(int data) {
		this.data = data;
		this.n = null;
	}
	
	public int getData() {
		return data;
	}
	
	public IntNode getLink() {
		return n;
	}
	
	public void setData(int data) {
		this.data = data;
	}
}