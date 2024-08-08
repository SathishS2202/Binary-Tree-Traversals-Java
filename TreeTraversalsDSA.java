import java.util.*;
class TreeNode
{
    int value;
    TreeNode left,right;
    TreeNode(int value)
    {
        this.value=value;
        left=right=null;
    }
}
public class TreeTraversalsDSA
{
    public void PreOrder(TreeNode root)
    {
        if(root==null)
        return;
        System.out.println(root.value+" ");
        PreOrder(root.left);
        PreOrder(root.right);
    }
    public void InOrder(TreeNode root)
    {
        if(root==null)
        return;
         InOrder(root.left);
         System.out.println(root.value+" ");
         InOrder(root.right);
    }
    public void PostOrder(TreeNode root)
    { 
        if(root==null)
        return;
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.println(root.value+" ");
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(4);
        root.left=new TreeNode(2);
        root.left.left=new TreeNode(3);
        root.left.left.right=new TreeNode(9);
        root.left.left.right.left=new TreeNode(1);
        root.right=new TreeNode(5);
        root.right.left=new TreeNode(7);
        root.right.right=new TreeNode(6);
        root.right.right.left=new TreeNode(8);
        TreeTraversalsDSA tree=new TreeTraversalsDSA();
        System.out.println("PreOrder Traversal");
        tree.PreOrder(root);
        System.out.println("InOrder Traversal");
        tree.InOrder(root);
        System.out.println("PostOrder Traversal");
        tree.PostOrder(root);

    }
}