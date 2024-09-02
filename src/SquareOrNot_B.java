import java.util.*;
public class SquareOrNot_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n= in.nextInt();
            String s= in.next();
            // Check if n is a perfect square
            int k = (int) Math.sqrt(n);
            if (k * k != n) {
                System.out.println("No");
                continue;
            }

            boolean isBeautiful = true;

            // Check the first and last rows
            for (int j = 0; j < k; j++) {
                if (s.charAt(j) != '1' || s.charAt(n - k + j) != '1') {
                    isBeautiful = false;
                    break;
                }
            }

            // Check the first and last columns of middle rows
            for (int row = 1; row < k - 1 && isBeautiful; row++) {
                if (s.charAt(row * k) != '1' || s.charAt((row + 1) * k - 1) != '1') {
                    isBeautiful = false;
                }
                // Check the inner elements
                for (int col = 1; col < k - 1; col++) {
                    if (s.charAt(row * k + col) != '0') {
                        isBeautiful = false;
                        break;
                    }
                }
            }

            System.out.println(isBeautiful ? "Yes" : "No");
        }
    }
}


