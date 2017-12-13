package Tree;

public class TreeNode {

	private int data; 
	public TreeNode left; 
	public TreeNode right; 
	

 
public TreeNode(int i) {
	this.data =i; 
		// TODO Auto-generated constructor stub
	}
public int getData() {
	return data; 
}
public void setData() {
	this.data = data; 
}
public TreeNode getLeft() {
	return left; 
}

public void setLeft(TreeNode left) {
	this.left = left; 
}

public TreeNode getRight() {
	return right; 
}
public void setRight(TreeNode right) {
	this.right = right; 
}
}