package trees;

/**
 * Created by Bajal on 12/22/16.
 */
public class BinaryTree<E> {

    /*TreeNode<E> root;

    public BinaryTree(E data)
    {
        root = new TreeNode(data);
    }
*/
    public void addRight(TreeNode<E> parent,TreeNode<E> child)  {
        parent.right = child;
    }
    public void addLeft(TreeNode<E> parent,TreeNode<E> child)  {
        parent.left = child;
    }
    
    public static void main(String[] args) {
        TreeNode n1=new TreeNode(2);
        TreeNode n2=new TreeNode(7);
        TreeNode n3=new TreeNode(1);
        TreeNode n4=new TreeNode(3);
        TreeNode n5=new TreeNode(6);

        TreeNode root = new TreeNode(4);
        BinaryTree l1=new BinaryTree();
        l1.addLeft(root, n1);
        l1.addRight(root, n2);
        l1.addLeft(n1, n3);
        l1.addRight(n1, n4);
        l1.addLeft(n2,n5);
    }
}

class TreeNode<E> {
    E value;
    TreeNode<E> parent;
    TreeNode<E> left;
    TreeNode<E> right;

    public TreeNode(E value) {
        this.value = value;
        this.right = null;
        this.left = null;
    }
}