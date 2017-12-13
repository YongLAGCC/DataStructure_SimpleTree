package Tree;

public class MyTree{
	
	TreeNode root; 
	public MyTree(TreeNode root) {
		this.root = root; 
	}

	public void showData(TreeNode tn) {
		System.out.print("" + tn.getData());
	}
	
	public void preOrder(TreeNode tn) {
		if(tn!=null) {
			showData(tn); 
			preOrder(tn.left); 
			preOrder(tn.right); 
		}
	}

	public void inOrder(TreeNode tn) {
		if(tn!=null) {
			 
			inOrder(tn.left);
			showData(tn);
			inOrder(tn.right); 
		}
	}
	public void postOrder(TreeNode tn) {
		if(tn!=null) {
			 
			postOrder(tn.left); 
			postOrder(tn.right); 
			showData(tn);
		}
	}
}
