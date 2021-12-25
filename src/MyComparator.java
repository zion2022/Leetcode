import java.util.Comparator;

/**
 * @author zy
 * @create 2021-09-04 15:56
 */
public class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }
}
