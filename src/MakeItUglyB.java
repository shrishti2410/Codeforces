import java.util.*;
public class MakeItUglyB {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0; i<t;i++){
            int n= sc.nextInt();
            int [] arr=new int[n];
            for(int j=0; j<n; j++){
                arr[j]= sc.nextInt();
            }
            int cnt=0;

            int ans=Integer.MAX_VALUE;
            for(int j=0; j<n; j++){
                if(arr[j]==arr[0]) {
                    cnt++;
                }else {
                    ans=(Math.min(ans,cnt));
                    cnt=0;
                }
            }
            ans=(Math.min(ans,cnt));
            if(ans==n){
                System.out.println("-1");
            }
            else {
                System.out.println(ans);
            }
        }
    }
}
