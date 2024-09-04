import java.util.Scanner;

public class OsuMania_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            scanner.nextLine();
            String[] rows = new String[n];

            for (int j = 0; j < n; j++) {
                rows[j] = scanner.nextLine();
            }

            for (int j = n - 1; j >= 0; j--) {
                String row = rows[j];
                for (int k = 0; k < 4; k++) {
                    if (row.charAt(k) == '#') {
                        System.out.print((k + 1) + " ");
                        break;
                    }
                }
            }

            System.out.println();
        }

        scanner.close();
    }
}

