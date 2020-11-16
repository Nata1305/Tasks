/*
 * Задание: Дана коллекция с числами. Запишите в новую коллекцию только те числа, которые больше нуля и меньше 10-ти.
 * Коллекции вы создаёте сами
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(4);
        nums.add(25);
        nums.add(100);
        nums.add(11);
        ArrayList<Integer> nums2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            nums2.add(i);
        }
        nums.removeAll(nums2);

        System.out.println(nums);
        }

}


