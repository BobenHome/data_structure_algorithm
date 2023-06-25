package leetcode;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author dongliangliang
 * @date 2023/6/25 21:20:25
 */
public class Question349 {
    // 给定两个数组 nums1 和 nums2 ，返回 它们的交集 。输出结果中的每个元素一定是 唯一 的。我们可以 不考虑输出结果的顺序 。
    // 输入：nums1 = [1,2,2,1], nums2 = [2,2]
    // 输出：[2]

    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set = new HashSet<>();
        for (int i : nums1) {
            set.add(i);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i : nums2) {
            if (set.contains(i) && !list.contains(i)) {
                list.add(i);
            }
        }

        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
