import java.util.*;
public class ClockAndStrings_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a= sc.nextInt();
            int b= sc.nextInt();
            int c= sc.nextInt();
            int d= sc.nextInt();

            if(a>b){
                if(c>a || c<b){
                    if(d>b && d<a){
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                } else if (d>a || d<b) {
                    if(c>b && c<a){
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                } else {
                    System.out.println("NO");
                }
            } else if (b>a) {
                if(c>b || c<a){
                    if(d>a && d<b){
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                } else if (d>b || d<a) {
                    if(c>a && c<b){
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }
        }
    }
}


