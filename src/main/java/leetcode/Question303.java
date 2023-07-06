package leetcode;

import segmenttree.SegmentTree;

/**
 * @author dongliangliang
 * @date 2023/7/5 11:05:16
 */
public class Question303 {

    // 区域和检索 - 数组不可变
    private SegmentTree<Integer> segmentTree;

    public Question303(int[] nums) {

        if (nums.length > 0) {
            Integer[] data = new Integer[nums.length];
            for (int i = 0; i < nums.length; i++) {
                data[i] = nums[i];
            }
            segmentTree = new SegmentTree<>(data, Integer::sum);
        }
    }

    public void update(int index, int val) {
        segmentTree.set(index, val);
    }

    public int sumRange(int i, int j) {
        if (segmentTree == null) {
            throw new IllegalArgumentException("Segment Tree is null");
        }
        return segmentTree.query(i, j);
    }
}
