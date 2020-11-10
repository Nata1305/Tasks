import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int[] num = new int[10];
        for (int i = 0; i < 10; i++) {
            num[i]= scan.nextInt();

        }
        int current = 1, max=0;
        for (int i = 1; i < num.length; i++) {
            if (num[i]==num[i-1]) {
                current++;
                if (current > max) {
                    max = current;
                }
            }else current=1;
        }
        System.out.println(max);
    }


}
