import java.util.*;

public class TonsOfTNT_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr=new int[n];
            for(int j=0; j<n; j++){
                arr[j]=sc.nextInt();
            }
            long max_diff=0;
            for(int k=1; k<=n; k++){
                if(n%k==0){
                    long max_box = 0;
                    long min_box = Long.MAX_VALUE;
                    for (int s = 0; s < n/k; s++) {
                        //-----n/k=no of trucks
                        long box = 0;
                        for (int j = 0; j < k; j++) {
                            box += (long) arr[s*k + j];
                        }
                        max_box = Math.max(max_box, box);
                        min_box = Math.min(min_box, box);
                    }
                    max_diff = Math.max(max_box - min_box, max_diff);
                }
            }
            System.out.println(max_diff);
        }
    }
}
