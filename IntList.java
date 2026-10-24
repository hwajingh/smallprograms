import java.util.HashMap;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class IntList {

    // FIX: the original used a fixed int[50] (51st addNum threw
    // ArrayIndexOutOfBoundsException) and static fields, so instances
    // shared state. Now instance fields, unbounded.
    private final List<Integer> list;
    private final HashMap<Integer, Integer> numberCount;

    public IntList() {
        list = new ArrayList<>();
        numberCount = new HashMap<>();
    }

    public void addNum(int num) {
        list.add(num);
        numberCount.put(num, numberCount.getOrDefault(num, 0) + 1);
    }

    public void outputColumns() {
        Set<Integer> keySet = numberCount.keySet();
        // FIX: raw type -> typed list (also removes the sort-then-reverse
        // workaround note: descending order is kept via reverse iteration).
        List<Integer> sortedList = new ArrayList<>(keySet);
        Collections.sort(sortedList);

        for(int i = sortedList.size() - 1; i >= 0; i--) {
            System.out.println(sortedList.get(i) + " " + numberCount.get(sortedList.get(i)));
        }
    }

    public static void main(String[] args) {
        IntList list = new IntList();
        list.addNum(-12);
        list.addNum(3);
        list.addNum(-12);
        list.addNum(4);
        list.addNum(1);
        list.addNum(1);
        list.addNum(-12);
        list.addNum(1);
        list.addNum(-1);
        list.addNum(1);
        list.addNum(2);
        list.addNum(3);
        list.addNum(4);
        list.addNum(2);
        list.addNum(3);
        list.addNum(-12);


        list.outputColumns();
    }
}
