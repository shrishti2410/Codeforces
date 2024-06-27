import java.util.*;
public class ElephantA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt=0;
        int n = sc.nextInt();
        while(n>5){
            cnt=cnt+1;
            n=n-5;
        }
        if(n<6){
            cnt=cnt+1;
        }
        System.out.println(cnt);
    }
}

