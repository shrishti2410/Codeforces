import java.util.Scanner;

public class StonesA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String stones = scanner.next();
        int count = 0;

        for (int i = 0; i < n - 1; i++) {
            if (stones.charAt(i) == stones.charAt(i + 1)) {
                count++;
            }
        }

        System.out.println(count);
    }
}