import java.util.Scanner;

public class DoraSet_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            if (l % 2 == 0) {
               l++;
            }
            System.out.println((r-l+2)/4);
        }
    }
}
