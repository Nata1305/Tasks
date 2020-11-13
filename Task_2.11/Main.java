/*
Задание: Дан массив с числами. Узнайте сколько элементов с начала массива надо сложить,
чтобы в сумме получилось больше 10-ти.
*/

public class Main {
    public static void main(String[] args) {
        int numbers[] = {3, 6, 7, 8, 9};
        int sum = 0;
        int item = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
            while (sum > 10) {
                item++;break;
                }
        }            System.out.println(item);

    }
}
