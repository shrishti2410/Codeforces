import java.util.*;
public class TestOfLove_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 0; j < t; j++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            String s=sc.next();
            int a=m-1,b=0,c=0;
            for(int i=0;i<s.length();i++) {
                if(s.charAt(i)=='L')
                    a=m;
                else if(s.charAt(i)=='W') {
                    if(a<=0)
                        b++;
                }
                else {
                    if(a<=0)
                        c++;
                }
                a--;
            }
            if(b>k)
                c++;
            if(c!=0)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}