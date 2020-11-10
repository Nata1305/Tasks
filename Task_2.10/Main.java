public class Main {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 5, 45, 55, 55};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j])
                    System.out.println("Да");
                else {};
                
            }
        }
    }
}
