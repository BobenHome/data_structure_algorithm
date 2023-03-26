package array;

/**
 * @author Leslie Tung created on 2023-01-15 22:02
 */
public interface Queue<E> {

  int getSize();

  boolean isEmpty();

  void enqueue(E e);

  E dequeue();

  E getFront();
}
