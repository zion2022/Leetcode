

import java.util.LinkedList;

/**
 * @author zy
 * @create 2021-09-07 19:36
 */
public class LinkListTest {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        LinkedList list= solution2.GetoroginalSout();
      //  Solution3 solution3 = new Solution3();
       //LinkedList linkedList = solution3.GetoroginalSout();
    }
}

class Solution2 {
    public LinkedList GetoroginalSout(){
        String[] arr = new String[]{
                "1","3","2","4"};
        LinkedList<String> b = new LinkedList<>();
        for (String a : arr) {
            b.addFirst(a);
            if (b.size() != arr.length) {
                b.addFirst(b.pollLast());
            }
            System.out.println(b);
        }
        return b;

}



    class Solution3 {
        public LinkedList GetoroginalSout(){
            String[] arr = new String[]{"2","4","5","3","1"};
            LinkedList<String> b = new LinkedList<>();
            for(String a:arr){
                if(b.size()>1){
                    b.addFirst(b.pollLast());
                }
                b.addFirst(a);
                System.out.println(b);
            }
            //System.out.println(b);
            return b;
        }
    }}