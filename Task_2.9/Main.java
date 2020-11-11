/*
Задание: Дан массив с числами. Проверьте, что в этом массиве есть число 5.
Если есть - выведите 'да', а если нет - выведите 'нет'.
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int nums[] = {4, 3, 5, 4, 75};


        for (int i = 0; i < nums.length; i++)
            if (nums[i] == 5) {
                System.out.println("да");
            }
            else { System.out.println("нет");
            }
    }
}
