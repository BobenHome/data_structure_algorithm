package leetcode;

import java.util.TreeSet;

/**
 * @author dongliangliang
 * @date 2023/6/7 17:32:54
 */
public class Question804 {

    // 唯一摩尔斯密码词
    public int uniqueMorseRepresentations(String[] words) {

        String[] codes = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
                "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-",
                ".--", "-..-", "-.--", "--.."};

        TreeSet<String> set = new TreeSet<>();
        for (String word : words) {
            StringBuilder res = new StringBuilder();
            for (char c : word.toCharArray()) {
                res.append(codes[c - 'a']);
            }
            set.add(res.toString());
        }
        return set.size();
    }
}
