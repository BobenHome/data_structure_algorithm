package array;

import java.util.Stack;

/**
 * @author Leslie Tung created on 2022-12-29 17:54
 */
public class Main {

  public static void main(String[] args) {

    LinkedList<Integer> list = new LinkedList<>();
    for (int i = 0; i < 5; i++) {
      list.addFirst(i);
      System.out.println(list);
    }

    list.add(2, 999);
    System.out.println(list);

    list.remove(2);
    System.out.println(list);

    list.removeFirst();
    System.out.println(list);

    list.removeLast();
    System.out.println(list);
  }

  public boolean isValid(String s) {

    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c == '(' || c == '[' || c == '{') {
        stack.push(c);
      } else {
        if (stack.isEmpty()) {
          return false;
        }
        char topChar = stack.pop();
        if (c == ')' && topChar != '(') {
          return false;
        }
        if (c == ']' && topChar != '[') {
          return false;
        }
        if (c == '}' && topChar != '{') {
          return false;
        }
      }
    }
    return stack.isEmpty();
  }
}
