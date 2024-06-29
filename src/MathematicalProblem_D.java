import java.util.*;

 public class MathematicalProblem_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tests = scanner.nextInt();

        for(int t = 0; t < tests; t++){
            int n = scanner.nextInt();
            char[] s = scanner.next().toCharArray();

            int mn = -1;

            for(int j = 0; j < s.length - 1; j++){
                int ans = 1;

                for(int i = 0; i < n; i++){
                    int x;
                    x = s[i] - '0';
                    if(j == i){
                        x *= 10;
                        x += s[i + 1] - '0';
                        i++;
                    }
                    if(ans * x > ans + x)ans += x;
                    else ans *= x;
                }
                if(mn == -1 || mn > ans)mn = ans;
            }
            System.out.println(mn);

        }
    }
}