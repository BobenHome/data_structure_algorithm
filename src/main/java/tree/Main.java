package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author dongliangliang
 * @date 2023/6/5 16:12:25
 */
public class Main {

    public static void main(String[] args) {
        BSTV2<Integer> bst = new BSTV2<>();

        Random random = new Random();
        int n = 1000;

        for (int i = 0; i < n; i++) {
            bst.add(random.nextInt(10000));
        }

        List<Integer> list = new ArrayList<>();
        while (!bst.isEmpty()) {
            list.add(bst.removeMin());
        }
        System.out.println(list);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1) > list.get(i)) {
                throw new IllegalArgumentException("Error");
            }
        }
    }
}
