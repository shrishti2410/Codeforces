import java.util.*;
public class Bouquet_B2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            long m = in.nextLong();
            long [] a = new long[n];
            long [] b = new long[n];
            long maxSum=0, newMaxSum;
            for(int i = 0; i < n; i++) a[i] = in.nextLong();
            for(int i = 0; i < n; i++) b[i] = in.nextLong();
            HashMap<Long, Long> map = new HashMap<Long, Long>();
            for(int i = 0; i < n; i++) map.put(a[i], b[i]);
            Arrays.sort(a);
            for(int i = 0; i < n; i++) {
                System.out.println(a[i] + " " + map.get(a[i]));
            }
            for(int i = 0; i < n-1; i++) {
                if(a[i+1]-a[i]==1) {
                    newMaxSum = ((a[i]) * (map.get(a[i]))) + ((a[i+1]) * (map.get(a[i + 1])));
//                    System.out.print("int newSum-"+newMaxSum+" ");
                    if(newMaxSum>m){
                        long diff=newMaxSum-m;
                        long sub=0;
                        long m1=diff % a[i];
                        long m2=diff % a[i+1];
                        System.out.print("ai-"+a[i]+" ");
                        System.out.print("ai+1-"+a[i+1]+" ");
                        System.out.print("diff-"+diff+" ");
                        System.out.print("m1-"+m1+" ");
                        System.out.print("m2-"+m2+" ");
                        while (newMaxSum>m) {
                            if (m1 > m2) {
                                sub = a[i + 1] * ((diff / a[i + 1]) + 1);
                            } else if (m2 > m1) {
                                sub = a[i] * ((diff / a[i]) + 1);
                            } else {
                                sub=a[i];
                            }
                            System.out.print("SUB-"+sub+" ");
                            newMaxSum = newMaxSum - sub;
                        }
                    }

                    System.out.println(a[i] + " " + a[i + 1] + " " + newMaxSum);
                }
            }
        }
    }
}