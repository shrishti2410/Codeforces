import java.util.*;
public class SubstringAndSubsequence_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String a=sc.next();
            String b=sc.next();
            int m=a.length();
            int n=b.length();
            int mx=0;
            for(int i=0; i<n; i++){
                int st=i;
                for(int j=0;j<m;j++){
                    if(st<n && b.charAt(st)==a.charAt(j)){
                        st++;
                    }
                }
                mx=Math.max(mx,st-i);
            }
            System.out.println(m+n-mx);
        }
    }
}