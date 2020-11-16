/*
Задание: Дан массив с числами. Проверьте, что в этом массиве есть число 5.
Если есть - выведите 'да', а если нет - выведите 'нет'.
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int [] numbers = {1, 2, 6, 45, 55, 55};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 5) {
                System.out.println("Да");
                break;

            }else if(i== numbers.length-1) System.out.println("нет");
        }

    }
}
