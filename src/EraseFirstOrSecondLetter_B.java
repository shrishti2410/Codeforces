//import java.util.HashSet;
//import java.util.Scanner;
//
//public class EraseFirstOrSecondLetter_B {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//
//        while (t-- > 0) {
//            int n = sc.nextInt();
//            String s = sc.next();
//
//            HashSet<String> uniqueStrings = new HashSet<>();
//
//            for (int i = 0; i < n; i++) {
//                String substring = s.substring(i);
//                uniqueStrings.add(substring);
//            }
//
//            // Generate all unique substrings by removing the second character
//            // from the already created substrings.
//            for (int i = 0; i < n - 1; i++) {
//                String substring = s.substring(i);
//                for (int j = 1; j < substring.length(); j++) {
//                    String modified = substring.charAt(0) + substring.substring(j + 1);
//                    uniqueStrings.add(modified);
//                }
//            }
//
//            System.out.println(uniqueStrings.size());
//        }
//    }
//}

import java.util.HashSet;
import java.util.Scanner;

public class EraseFirstOrSecondLetter_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String str = sc.next();
            int ans = 0;
            HashSet<Character> h = new HashSet<>();
            for (int i = 0; i < n; i++) {
                if (!h.contains(str.charAt(i))) {
                    h.add(str.charAt(i));
                    ans += n - i;
                }
            }
            System.out.println(ans);
        }
    }
}
