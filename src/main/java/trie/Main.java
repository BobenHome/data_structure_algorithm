package trie;

import set.BSTSet;
import set.FileOperation;

import java.util.ArrayList;

/**
 * @author dongliangliang
 * @date 2023/7/6 21:02:48
 */
public class Main {

    public static void main(String[] args) {

        String filename = "pride-and-prejudice.txt";
        System.out.println(filename);
        ArrayList<String> words = new ArrayList<>();
        if (FileOperation.readFile("src/" + filename, words)) {
            System.out.println("Total words: " + words.size());
            long startTime = System.nanoTime();
            BSTSet<String> set = new BSTSet<>();
            for (String word : words) {
                set.add(word);
            }
            for (String word : words) {
                set.contains(word);
            }
            System.out.println("Total different words: " + set.getSize());
            long endTime = System.nanoTime();
            double time = (endTime - startTime) / 1000000000.0;
            System.out.println("BSTSet cost: " + time + "s");

            startTime = System.nanoTime();
            Trie trie = new Trie();
            for (String word : words) {
                trie.add(word);
            }
            for (String word : words) {
                trie.contains(word);
            }
            System.out.println("Total different words: " + trie.getSize());
            endTime = System.nanoTime();
            time = (endTime - startTime) / 1000000000.0;
            System.out.println("Trie cost: " + time + "s");
        }
    }
}
