package segmenttree;

/**
 * @author dongliangliang
 * @date 2023/7/4 21:16:10
 */
public class Main {

    public static void main(String[] args) {
        Integer[] nums = {-2, 0, 3, -5, 2, -1};
        SegmentTree<Integer> segmentTree = new SegmentTree<>(nums, Integer::sum);
//        System.out.println(segmentTree);
        System.out.println(segmentTree.query(0, 5));
    }
}
