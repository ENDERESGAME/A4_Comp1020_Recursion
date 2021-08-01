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