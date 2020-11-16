/*
Задание: Даны переменные a и b. Проверьте, что a делится без остатка на b.
 Если это так - выведите 'Делится' и результат деления, иначе выведите 'Делится с остатком' и остаток от деления.
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
         int a = 5;
         int b = 15;
         int mod=a%b;
         int div= a/b;


        if (mod==0)
            System.out.println("Делится: "+div);
        else System.out.println("Делится с остатком, остаток:"+mod);

    }

}
