
import java.util.*;
public class BinaryCut_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            int cnt=0;
            int c=0;
            for(int j=0; j<s.length()-1; j++){
                if(s.charAt(j)<s.charAt(j+1)) {
                    c=1;
                }
                if(s.charAt(j)!=s.charAt(j+1)) {
                    cnt++;
                }
            }
            System.out.println(cnt+1-c);
        }
    }
}