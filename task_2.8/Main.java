/*
/*
Задание: Дан массив с элементами [2, 3, 4, 5]. С помощью цикла for найдите произведение элементов этого массива.
*/import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int nums[] = {2,3,4,5};
        int com =1;
        for (int i = 0; i < nums.length; i++) {
            com=com*nums[i];}
            System.out.println(com);

    }
}
