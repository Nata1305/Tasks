/*
Задание: Дан массив с числами.
 Выведите последовательно его элементы
 используя рекурсию и не используя цикл.
*/


public class Main {
    public static void main(String[] args) {
        int num[] = {4,2,6,2,65};
        items(num, 0);

    }
    public static void items (int numbers[], int index) {

        if (index < numbers.length) {
            System.out.println(numbers[index]);
            index++;
            items(numbers, index);
        }
    }
}
