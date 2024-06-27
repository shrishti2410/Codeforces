
import java.util.Scanner;

public class CreatingWords_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < t; i++) {
            String s = sc.nextLine();

            String A=s.substring(0,3);
            String B=s.substring(4,7);
            StringBuilder a = new StringBuilder(A);
            StringBuilder b = new StringBuilder(B);
            String resultA = b.charAt(0) + a.substring(1);
            String resultB = a.charAt(0) + b.substring(1);

            System.out.println(resultA+ " " +resultB);
            //System.out.println();
        }
    }
}


