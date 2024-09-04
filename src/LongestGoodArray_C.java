import java.util.*;
public class LongestGoodArray_C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int l= in.nextInt();
            int r= in.nextInt();
            int i=1;
            int cnt=1;
            while ((l+i)<=r){
                l=l+i;
                cnt++;
                i++;
            }
            System.out.println(cnt);
        }
    }
}

