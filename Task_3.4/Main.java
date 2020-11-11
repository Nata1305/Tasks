/*
Задание: Сделайте функцию, которая параметрами принимает 2 числа.
Если их сумма больше 10 - пусть функция вернет true, а если нет - false.
*/


public class Main {
    public static void main(String[] args) {
        main(5,11);

    }
    public static void main (int a, int b) {
        int sum = a+b;
        if (sum>10) System.out.println("true");
        else System.out.println("false");
    }
}
