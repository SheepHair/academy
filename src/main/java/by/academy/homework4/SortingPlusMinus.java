package by.academy.homework4;

import java.util.List;

public class SortingPlusMinus<T extends Number> {
    public void sortPlusMinus(List<T> list) {
        for (int i = 0; i < list.size(); i++) {
            T min = list.get(i);
            int minIndex = i;

            for (int j = i + 1; j < list.size(); j++)
                if (min.intValue() < list.get(j).intValue()) {
                    min = list.get(j);
                    minIndex = j;
                }

            if (i != minIndex) {
                T box0 = list.get(i), box1 = list.get(minIndex);
                list.set(i, box1);
                list.set(minIndex, box0);
            }
        }
    }
}
