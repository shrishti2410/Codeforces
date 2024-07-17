import java.util.*;
public class AngryMonk_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n=in.nextInt();
            int k=in.nextInt();
            int arr[] = new int[k];
            for (int i = 0; i < k; i++) {
                arr[i]=in.nextInt();
            }
            Arrays.sort(arr);
            int cnt=0, cnt1=0;
            //cnt=no of steps to break
            //cnt1=no of steps to join
            for (int i = 0; i < k-1; i++) {
                if(arr[i]!=1){
                    cnt=cnt+arr[i]-1;
                    cnt1=cnt1+arr[i];
                } else {
                    cnt1=cnt1+1;
                }
            }
            System.out.println(cnt+cnt1);
        }
    }
}