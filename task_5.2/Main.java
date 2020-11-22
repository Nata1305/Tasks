/*
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи
Лондон
Пример вывода:
Абрамовичи */


import java.util.*;

/*
Модернизация ПО
*/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> cityFamily = new ArrayList<>();
        String family = scanner.nextLine().toLowerCase();
        cityFamily.add(family);

        while (true) {
            family = scanner.nextLine().toLowerCase();
            if ( cityFamily.indexOf(family)==-1) cityFamily.add(family);
            else System.out.println(cityFamily.get(cityFamily.indexOf(family)+1));


            }
      }

}
