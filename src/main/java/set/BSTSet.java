package set;


import tree.BSTV2;

/**
 * @author dongliangliang
 * @date 2023/6/7 15:14:15
 */
public class BSTSet<E extends Comparable<E>> implements Set<E> {

    private BSTV2<E> bst;

    public BSTSet() {
        bst = new BSTV2<>();
    }

    @Override
    public void add(E e) {
        bst.add(e);
    }

    @Override
    public void remove(E e) {
        bst.remove(e);
    }

    @Override
    public boolean contains(E e) {
        return bst.contains(e);
    }

    @Override
    public int getSize() {
        return bst.size();
    }

    @Override
    public boolean isEmpty() {
        return bst.isEmpty();
    }
}
