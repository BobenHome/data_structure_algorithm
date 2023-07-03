package segmenttree;

/**
 * @author dongliangliang
 * @date 2023/6/29 10:27:58
 */
public class SegmentTree<E> {

    private E[] data;
    private E[] tree;

    public SegmentTree(E[] arr) {
        data = (E[]) new Object[arr.length];

        for (int i = 0; i < arr.length; i++) {
            data[i] = arr[i];
        }

        tree = (E[]) new Object[4 * arr.length];
    }

    public int getSize() {
        return data.length;
    }

    public E get(int index) {
        if (index < 0 || index >= data.length) {
            throw new IllegalArgumentException("Error");
        }
        return data[index];
    }

    // 返回完全二叉树的数据表示中，一个索引所表示的元素的左孩子节点的索引
    private int leftChild(int index) {
        return 2 * index + 1;
    }

    // 返回完全二叉树的数组表示中，一个索引所表示的元素的右孩子节点的索引
    private int rightChild(int index) {
        return 2 * index + 2;
    }
}
