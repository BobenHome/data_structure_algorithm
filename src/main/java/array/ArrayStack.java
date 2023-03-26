package array;

/**
 * @author Leslie Tung created on 2023-01-14 20:26
 */
public class ArrayStack<E> implements Stack<E> {

  Array<E> array;

  public ArrayStack(int capacity) {
    array = new Array<>(capacity);
  }

  public ArrayStack() {
    array = new Array<>();
  }

  @Override
  public int getSize() {
    return array.getSize();
  }

  @Override
  public boolean isEmpty() {
    return array.isEmpty();
  }

  public int getCapacity() {
    return array.getCapacity();
  }

  @Override
  public void push(E e) {
    array.addLast(e);
  }

  @Override
  public E pop() {
    return array.removeLast();
  }

  @Override
  public E peek() {
    return array.getLast();
  }

  @Override
  public String toString() {
    return "ArrayStack{" +
        "array=" + array +
        '}';
  }
}
