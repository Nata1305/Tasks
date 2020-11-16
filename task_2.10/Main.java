public class Main {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 5, 45, 55, 55};

        for (int i = 1; i < numbers.length; i++) {
             if (numbers[i] == numbers[i-1])
                    System.out.println("Да");
                else {};


        }
    }
}
