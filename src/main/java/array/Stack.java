package array;

/**
 * @author Leslie Tung created on 2023-01-14 20:25
 */
public interface Stack<E> {

  int getSize();

  boolean isEmpty();

  void push(E e);

  E pop();

  E peek();
}
