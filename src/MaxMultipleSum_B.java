
import java.util.Scanner;
public class MaxMultipleSum_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int optimalX = 2;
            int maxSum = 0;
            for (int x = 2; x <= n; x++) {
                int sum = 0;
                for (int k = 1; k * x <= n; k++) {
                    sum += k * x;
                }
                if (sum > maxSum) {
                    maxSum = sum;
                    optimalX = x;
                }
            }
            System.out.println(optimalX);
        }
    }
}
