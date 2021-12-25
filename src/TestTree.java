import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author zy
 * @create 2021-12-05 18:31
 */
public class TestTree {
    public static void main(String[] args) {
        //创建二叉树节点
        TreeNode2 head = new TreeNode2(1);
        TreeNode2 n1 = new TreeNode2(2);
        TreeNode2 n2 = new TreeNode2(3);
        TreeNode2 n3 = new TreeNode2(4);
        TreeNode2 n4 = new TreeNode2(5);
        TreeNode2 n5 = new TreeNode2(6);
        TreeNode2 n6 = new TreeNode2(7);
        //生成二叉树
        head.left = n1;
        head.right = n2;
        n1.left = n3;
        n1.right = n4;
        n2.left = n5;
        n2.right = n6;
        //递归方式中序遍历二叉树
      /*  Solution3 solution3 = new Solution3();
        List<Integer> result = solution3.inorderTraversal(head);
        System.out.println(result);*/
        Solution4 solution4 = new Solution4();
        System.out.println(solution4.postOrder(head));
    }
    }

class Solution3 {
    public List<Integer> inorderTraversal(TreeNode2 root) {
        ArrayList<Integer> result = new ArrayList<>();
        helper(root,result);//把节点放进去，包含他的左右，result作为结果集
        return result;//最后把结果集返回
    }
    public void helper(TreeNode2 node,List<Integer> list){
        if(node==null){//如归节点为空，直接返回
            return;
        }
        helper(node.left,list);//首先递归左边直到该节点左节点为null
        list.add(node.val);//左节点为null时，该节点加到结果集里
        helper(node.right,list);//再递归右边
    }
}

class Solution4 {
    public static List<Integer> postOrder(TreeNode2 root){
        Stack<TreeNode2> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        TreeNode2 cur = root;
        TreeNode2 p = null;//用来记录上一节点
        while(!stack.isEmpty() || cur != null){
            while(cur != null){
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.peek();
//            后序遍历的过程中在遍历完左子树跟右子树cur都会回到根结点。所以当前不管是从左子树还是右子树回到根结点都不应该再操作了，应该退回上层。
//            如果是从右边再返回根结点，应该回到上层。
            //主要就是判断出来的是不是右子树，是的话就可以把根节点=加入到list了
            if(cur.right == null || cur.right == p){
                list.add(cur.val);
                stack.pop();
                p = cur;
                cur = null;
            }else{
                cur = cur.right;
            }

        }
        return list;
    }

}
