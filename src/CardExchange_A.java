import java.util.*;
public class CardExchange_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr=new int[n];
            Map<Integer, Integer> q=new HashMap<>();
            for(int j=0; j<n; j++){
                arr[j]= sc.nextInt();
                q.put(arr[j], q.getOrDefault(arr[j], 0) + 1);
            }
            int cnt = 0;
            for (Map.Entry<Integer, Integer> entry : q.entrySet()) {
                if (entry.getValue() >= k) {
                    cnt ++;
                }
            }
            if(cnt==0){
                System.out.println(n);
            } else {
                System.out.println(k-1);
            }
        }
    }
}

