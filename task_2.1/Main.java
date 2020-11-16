public class Main {
    public static void main(String[] args) {
        String words[] = {"Мама", "Мыла","Раму"};



        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (i != j & i != k & j != k)
                        System.out.println(words[i] + words[j] + words[k]);
                }
            }
        }

    }
}
