package test;
import models.SkipList;

/**
 *
 * @author Juliana Barrera, Lina Sanabria
 */
public class TestSkipList {
    public static void main(String[] args) {
        SkipList<Integer> sl = new SkipList<>();
        int[] data = {4,2,7,0,9,1,3,7,3,4,5,6,0,2,8};
        for (int i : data) {
            sl.insert(i);
        }

        sl.print();
        sl.search(4);

        sl.delete(9);
        sl.print();

        sl.insert(70);
        sl.print();
        sl.search(50);
    }
}
