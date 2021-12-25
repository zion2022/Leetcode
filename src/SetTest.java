import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author zy
 * @create 2021-08-22 17:46
 */
public class SetTest {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        set.add(10);
        set.add(3);
        set.add(5);
        set.add(2);
        set.add(2);
        System.out.println(set.toString());
        System.out.println(set.contains(2));
        set.remove(2);
        System.out.println(set.toString());
        System.out.println(set.size()
        );

    }


}

class MyHashSet {
    boolean[] map=new boolean[999999999];

    /** Initialize your data structure here. */
    public MyHashSet() {
    }

    public void add(int key) {
    map[key]=true;
    }

    public void remove(int key) {
        map[key]=false;
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return map[key]==true;

    }
}

