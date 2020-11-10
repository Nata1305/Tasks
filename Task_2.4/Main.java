import java.util.Scanner;
/*
Задание: Пользователь вводит сумму вклада и процент, который будет начисляться ежегодно.
Отобразить размер вклада поочередно на ближайшие 5 лет.
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите сумму вклада: ");
        int depositAmount = scan.nextInt();
        System.out.println("Введите процент вклада: ");
        int percents = scan.nextInt();


        for (int i = 1; i <6 ; i++) {
            depositAmount+=depositAmount*percents/100;

            System.out.println(i+"-й год: "+depositAmount);


        }

    }

}
