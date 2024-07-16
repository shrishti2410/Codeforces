import java.util.*;
public class OnlyPulses_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int v[] = new int[3];
            int x;
            for(int i=0;i<3;i++){
                x = in.nextInt();
                v[i] = x;
            }
            for(int i=0;i<5;i++){
                Arrays.sort(v);
                v[0]++;
            }
            System.out.println(v[0]*v[1]*v[2]);
        }
    }
}