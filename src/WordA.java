import java.util.*;

public class WordA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int l = 0, u = 0;

        for (int i = 0; i < s.length(); i++) {
            if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') {
                u++;
            }
            if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') {
                l++;
            }
        }

        if (l == u || l > u) {
            s = s.toLowerCase();
        } else {
            s = s.toUpperCase();
        }

        System.out.println(s);
    }
}
