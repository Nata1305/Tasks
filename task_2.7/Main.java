/*
Задание: Дано число, например 31. Проверьте, что это число не делится ни на одно
 другое число кроме себя самого и единицы. То есть в нашем случае нужно проверить,
 что число 31 не делится на все числа от 2 до 30.
 Если число не делится - выведите 'false', а если делится - выведите 'true'.
*/import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
         int a = 31;
         int div=31/1;
        System.out.println(div);

        for (int i = 1; i <32 ; i++) {
            int b =a%i;
            System.out.println("число: "+i);
            if (b==0) System.out.println("true");
            else System.out.println("false");

        }


    }

}
