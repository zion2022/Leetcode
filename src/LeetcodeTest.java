
//import Leetcode.Leetcode.Leetcode.Solution;
//import Leetcode.Leetcode.Leetcode.Solution;

import Leetcode.ListNode;
import com.sun.org.apache.bcel.internal.generic.NEW;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import javafx.beans.binding.When;
import jdk.internal.util.xml.impl.ReaderUTF16;

import javax.swing.tree.TreeNode;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.net.Socket;
import java.time.temporal.Temporal;
import java.util.*;

import static java.lang.Character.forDigit;
import static java.lang.Character.getType;

/**
 * @author zy
 * @create 2021-07-08 19:13
 */
public class LeetcodeTest {
    public static void main(String[] args) {


    }
}
class Solution1 {
    public boolean isSymmetric(TreeNode root) {
        return check(root, root);
    }

    public boolean check(TreeNode p, TreeNode q) {
      if(p == null && q==null){
          return true;
      }
      if(p==null || q==null){
          return false;
      }
      return p.val ==q.val &&check(p.left,q.right) && check(p.right,)
    }
}

