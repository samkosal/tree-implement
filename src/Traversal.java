public class Traversal {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(10, null, null);
    root.left = new TreeNode(9, null, null);
    root.left.left = new TreeNode(5, null, null);
    root.left.right = new TreeNode(2, null, null);

    root.right = new TreeNode(15, null, null);
    root.right.left = new TreeNode(-3, null, null);
    root.right.right = new TreeNode(-3, null, null);
    root.right.right.right = new TreeNode(-3, null, null);
    System.out.println(root.value);
    System.out.println(root.left.value);


    // preorder(root);
    // postorder(root);
    inorder(root);
  }

  //print a tree roted at the given node in pre-order
  public static void preorder(TreeNode node) {
    if (node == null) {
      return;
    }
    //print value
    System.out.println(node.value);
    //traverse left
    preorder(node.left);
    //traverse right
    preorder(node.right);

  }

  public static void postorder(TreeNode node) {
    if (node == null) return;
    postorder(node.left);
    postorder(node.right);
    System.out.println(node.value);
  }

  public static void inorder(TreeNode node) {
    if (node == null) return;
    inorder(node.left);
    System.out.println(node.value);
    inorder(node.right);

  }
}
