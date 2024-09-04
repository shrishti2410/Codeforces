import java.util.*;
public class SakurakoHobby_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr=new int[n];
            for(int i = 0 ; i < n ; i++){
                arr[i] = sc.nextInt();
                arr[i]--;
            }
            int ans[] = new int[n];
            boolean vis[] = new boolean[n];
            Arrays.fill(vis,false);
            String s = sc.next();
            for(int i=0; i<n; i++){
                if(!vis[i]){
                    List<Integer> l = new ArrayList();
                    int b = 0;
                    int curr = i;
                    while(!vis[curr]) {
                        vis[curr] = true;
                        l.add(curr);
                        if(s.charAt(curr) == '0'){
                            b++;
                        }
                        curr = arr[curr];
                    }
                    for(int count : l){
                        ans[count] = b;
                    }
                }
            }
            for(int i = 0 ; i < n ; i++){
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}
