import java.util.*;
public class SakurakoExam_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int a= in.nextInt();
            int b= in.nextInt();
            int totalSum = a + 2 * b;
            if (totalSum % 2 != 0) {
                System.out.println("No");
            } else {
                int target = totalSum / 2;
                if (target % 2 == 0 || a > 0) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
    }
}