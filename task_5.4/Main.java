/*
1. Ввести путь к файлу с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
-2
11
3
-5
2
10
Пример вывода:
-2
2
8
10
*/



import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Введите путь к файлу: ");
        String nameFile=scanner.nextLine();
        ArrayList <Integer> num = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader(nameFile);
            Scanner scan = new Scanner(fileReader);
            int numFile;
            String numbers ="";

            while (scan.hasNextLine()) {
                numbers = scan.nextLine();
                numFile = Integer.parseInt(numbers);
                if (numFile % 2 == 0)

                    num.add(numFile);
            }
                fileReader.close();



            Collections.sort(num);

            num.forEach(System.out::println);
          //  num.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
