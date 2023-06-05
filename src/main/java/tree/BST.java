package tree;

/**
 * @author dongliangliang
 * @date 2023/6/2 14:51:58
 */
public class BST<E extends Comparable<E>> {

    private class Node {

        public E e;
        public Node left, right;

        public Node(E e) {
            this.e = e;
            left = null;
            right = null;
        }
    }

    private Node root;
    private int size;

    public BST() {
        root = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(E e) {

        if (null == root) {
            root = new Node(e);
            size++;
        } else {
            add(root, e);
        }
    }

    /**
     * 向以node为根的二分搜索树中插入元素E，递归算法
     *
     * @param node 根节点
     * @param e    要插入的元素
     */
    private void add(Node node, E e) {

        // 1.写递归的终止条件
        if (node.e.compareTo(e) == 0) {
            return;
        }
        if (e.compareTo(node.e) < 0 && node.left == null) {
            node.left = new Node(e);
            size++;
            return;
        }
        if (e.compareTo(node.e) > 0 && node.right == null) {
            node.right = new Node(e);
            size++;
            return;
        }

        // 2.递归逻辑
        if (e.compareTo(node.e) < 0) {
            add(node.left, e);
        } else {
            add(node.right, e);
        }
    }
}
