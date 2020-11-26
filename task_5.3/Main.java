/*
 * Задание: Дана коллекция с числами. Запишите в новую коллекцию только те числа, которые больше нуля и меньше 10-ти.
 * Коллекции вы создаёте сами
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList ();

        nums.add(1);
        nums.add(4);
        nums.add(25);
        nums.add(100);
        nums.add(11);
        nums.add(8);
        nums.add(6);

        System.out.println(nums);
        ArrayList <Integer> newnums = new ArrayList<>();
        nums.removeIf(integer -> (integer>0&&integer>10));

       System.out.println(nums);
    }

}

