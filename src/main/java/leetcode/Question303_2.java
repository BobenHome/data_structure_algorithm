package leetcode;

/**
 * @author dongliangliang
 * @date 2023/7/5 21:59:34
 */
public class Question303_2 {

    // sum[i]存储前i个元素和，sum[0] = 0
    // sum[i]存储 nums[0...i-1]的和
    private int[] sum;


    public Question303_2(int[] nums) {

        sum = new int[nums.length + 1];
        sum[0] = 0;

        for (int i = 1; i < sum.length; i++) {
            sum[i] = sum[i - 1] + nums[i - 1];
        }
    }

    public int sumRange(int left, int right) {
        return sum[right + 1] - sum[left];
    }
}
