import java.util.*;
public class InhabitantOfTheDeepSea_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            long k = sc.nextLong();

            long l=k/2;
            long r=k/2;
            if(k%2==1){
                l++;
            }

            long[] durability = new long[n];
            long sum=0;
            for (int j = 0; j < n; j++) {
                durability[j] = sc.nextInt();
                sum=sum+durability[j];
            }

            if(k>=sum){
                System.out.println(n);
            }
            else {
                int cnt=0;
                int u=0;
                int v=n-1;
                while(u<n && l>=durability[u]) {
                    l=l-durability[u];
                    u++;
                    cnt++;
                }
                if(u<n){
                    durability[u]=durability[u]-l;
                    if(durability[u]==0){
                        cnt++;
                    }
                }

                while(v>=u && r>=durability[v]) {
                    r=r-durability[v];
                    v--;
                    cnt++;
                }
                if(v>=u){
                    durability[v]=durability[v]-r;
                    if(durability[v]==0){
                        cnt++;
                    }
                }
                System.out.println(cnt);
            }
        }
    }
}
