import java.util.Scanner;
public class SoliderAndBananasA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int w = scanner.nextInt();


        int totalCost = 0;
        for (int i = 1; i <= w; i++) {
            totalCost += i * k;
        }

        int borrow = (totalCost <= n) ? 0 :totalCost - n;
        System.out.println(borrow);

        scanner.close();
    }
}
