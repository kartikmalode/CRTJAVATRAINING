package Day14;
import java.util.*;

public class ArrayListPr {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(5);
        ar.add(6);
        ar.add(9);
        ar.add(2);
        ar.add(45);

        Collections.sort(ar);
        System.out.println(ar);
    }
}
