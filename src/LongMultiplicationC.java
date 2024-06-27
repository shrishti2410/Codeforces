import java.util.*;
public class LongMultiplicationC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-->0) {
            String a1 = scanner.next();
            String b1 = scanner.next();

            if (a1.compareTo(b1) < 0) {
                String temp = a1;
                a1 = b1;
                b1 = temp;
            }

            boolean yes = false;
            StringBuilder a = new StringBuilder(a1);
            StringBuilder b = new StringBuilder(b1);

            for (int i = 0; i < a1.length(); i++) {
                if (a.charAt(i) > b.charAt(i) && yes) {
                    char temp = a.charAt(i);
                    a.setCharAt(i, b.charAt(i));
                    b.setCharAt(i, temp);
                }
                if (a.charAt(i) != b.charAt(i)) {
                    yes = true;
                }
            }
            System.out.println(a);
            System.out.println(b);
        }
    }
}
