import java.util.*;
public class NeneAndCardGame_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            HashSet<Integer> set = new HashSet<>();
            int cnt=0;
            for (int j = 0; j < n; j++) {
                int num=sc.nextInt();
                if(set.contains(num)){
                    cnt++;
                } else {
                    set.add(num);
                }
            }

            System.out.println(cnt);
        }
    }
}