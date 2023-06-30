// Найти минимальное значение, Найти максимальное значение, Найти среднее значение

package task1;

import java.util.ArrayList;
import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int val = rnd.nextInt(-100);
            list1.add(val);
        }
        System.out.printf("Список элементов %s\n", list1);
        int maxItem = list1.get(0);
        int minItem = list1.get(0);
        int sumItems = 0;
        for (int item : list1) {
            if (item > maxItem) {
                maxItem = item;
            }
            if (item < minItem) {
                minItem = item;
            }
            sumItems += item;
        }

        float average = (float) sumItems / list1.size();
        System.out.printf("Максимальный значение %s\n", maxItem);
        System.out.printf("Минимальный значение %s\n", minItem);
        System.out.printf("Среднее значение %s\n", average);
    }
}
