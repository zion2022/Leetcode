import javax.swing.tree.TreeNode;

/**
 * @author zy
 * @create 2021-10-08 20:59
 */
public class TreeNode2 {
    int val;
     TreeNode2 left;
     TreeNode2 right;
      TreeNode2() {};
     TreeNode2(int val) { this.val = val; };
     TreeNode2(int val, TreeNode2 left, TreeNode2 right) {
        this.val = val;
        this.left = left;
        this.right = right;
     }
}
