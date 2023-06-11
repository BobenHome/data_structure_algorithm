package map;

import set.FileOperation;

import java.util.ArrayList;

/**
 * @author Leslie Tung created on 2023-06-11 22:10
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("pride-and-prejudice");
        String filename = "pride-and-prejudice.txt";
        ArrayList<String> words = new ArrayList<>();
        if (FileOperation.readFile("src/" + filename, words)) {
            System.out.println("Total words: " + words.size());

            LinkedListMap<String, Integer> map = new LinkedListMap<>();
            for (String word : words) {
                if (map.contains(word)) {
                    map.set(word, map.get(word) + 1);
                } else {
                    map.add(word, 1);
                }
            }
            System.out.println("Total different words: " + map.getSize());
            System.out.println("Frequency of Pride: " + map.get("pride"));
            System.out.println("Frequency of Prejudice: " + map.get("prejudice"));
        }
    }
}
