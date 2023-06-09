package leetcode;

import java.util.TreeMap;

/**
 * @author dongliangliang
 * @date 2023/7/6 21:45:46
 */
public class Question211 {

    // 请你设计一个数据结构，支持 添加新单词 和 查找字符串是否与任何先前添加的字符串匹配
    private class Node {
        public boolean isWord;
        public TreeMap<Character, Node> next;

        public Node(boolean isWord) {
            this.isWord = isWord;
            next = new TreeMap<>();
        }

        public Node() {
            this(false);
        }
    }

    private Node root;

    public Question211() {
        root = new Node();
    }

    public void addWord(String word) {
        Node cur = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (cur.next.get(c) == null) {
                cur.next.put(c, new Node());
            }
            cur = cur.next.get(c);
        }
        cur.isWord = true;
    }

    public boolean search(String word) {

        return match(root, word, 0);
    }

    private boolean match(Node node, String word, int index) {
        if (index == word.length()) {
            return node.isWord;
        }
        char c = word.charAt(index);
        if (c != '.') {
            if (node.next.get(c) == null) {
                return false;
            }
            return match(node.next.get(c), word, index + 1);
        } else {
            for (char ch : node.next.keySet()) {
                if (match(node.next.get(ch), word, index + 1)) {
                    return true;
                }
            }
            return false;
        }
    }
}
