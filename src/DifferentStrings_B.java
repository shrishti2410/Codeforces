import java.util.Scanner;
import java.util.Arrays;

 public class DifferentStrings_B {
     // Function to solve the problem for a single test case
     public static String solve(String s) {
         // Check if all characters are the same
         if (s.chars().distinct().count() == 1) {
             // If all characters are the same, it's not possible to form a different string
             return "NO";
         } else {
             // If not, sort the characters to get a new string
             char[] chars = s.toCharArray();
             Arrays.sort(chars);
             String sortedString = new String(chars);

             // Check if the sorted string is equal to the original string
             if (sortedString.equals(s)) {
                 // If it's equal, swap the first two characters to make it different
                 return "YES\n" + sortedString.substring(1) + sortedString.substring(0, 1);
             } else {
                 // If it's not equal, the sorted string itself is different
                 return "YES\n" + sortedString;
             }
         }
     }
 }
