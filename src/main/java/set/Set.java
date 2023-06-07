package set;

/**
 * @author dongliangliang
 * @date 2023/6/7 14:48:41
 */
public interface Set<E> {

    void add(E e);

    void remove(E e);

    boolean contains(E e);

    int getSize();

    boolean isEmpty();
}
