import java.util.HashMap;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class IntList {

    static int[] list;
    static HashMap<Integer, Integer> numberCount;
    static int index = 0;

    public IntList() {
        list = new int[50];
        numberCount = new HashMap<>();
    }

    public void addNum(int num) {
        list[index++] = num;
        numberCount.put(num, numberCount.getOrDefault(num, 0) + 1);
    }

    public void outputColumns() {
        Set<Integer> keySet = numberCount.keySet();
        List sortedList = new ArrayList(keySet);
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
