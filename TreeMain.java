package Tree;

public class TreeMain {

	public static void main(String[] args) {
		// TODO Auto-generated methd stub
		TreeNode n1= new TreeNode(1); 
		TreeNode n2= new TreeNode(2);
		TreeNode n3= new TreeNode(3);
		TreeNode n4= new TreeNode(4);
		TreeNode n5= new TreeNode(5);
		TreeNode n6= new TreeNode(6);

		
		n1.left = n2; 
		n2.left = n4; 
		n2.right = n5; 
		n1.right = n3; 
		n3.left = n6; 

		MyTree mt = new MyTree(n1); 

		mt.preOrder(mt.root);
		
		System.out.println("   is For pre Order");
		mt.inOrder(mt.root);
		System.out.println("  is for inOrder");
		mt.postOrder(mt.root);
		System.out.println("   is for postOrder");

		
	}
}
