package set;

import java.util.ArrayList;

/**
 * @author dongliangliang
 * @date 2023/6/7 15:32:52
 */
public class Main {

    public static void main(String[] args) {

        String filename = "pride-and-prejudice.txt";
        BSTSet<String> bstSet = new BSTSet<>();
        double time1 = testSet(bstSet, filename);
        System.out.println("BST set: " + time1 + "s");
        System.out.println();
        LinkedListSet listSet = new LinkedListSet();
        double time2 = testSet(listSet, filename);
        System.out.println("LinkedList set: " + time2 + "s");
    }

    private static double testSet(Set<String> set, String filename) {
        long startTime = System.nanoTime();

        System.out.println(filename);
        ArrayList<String> words = new ArrayList<>();
        if (FileOperation.readFile("src/" + filename, words)) {
            System.out.println("Total words: " + words.size());
            for (String word : words) {
                set.add(word);
            }
            System.out.println("Total different words: " + set.getSize());
        }
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000000.0;
    }
}
