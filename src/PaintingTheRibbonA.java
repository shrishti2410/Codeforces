import java.util.Scanner;

public class PaintingTheRibbonA {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int t= sc.nextInt();
            for(int i=-0; i<t; i++){
                int n= sc.nextInt();
                int m= sc.nextInt();
                int k= sc.nextInt();
                int s=n/m;
                if (n == 1 || m == 1 || k==n) {
                    System.out.println("NO");
                } else if (m==2) {
                    if(k>=n/2){
                        System.out.println("NO");
                    }
                    else {
                        System.out.println("YES");
                    }
                } else {
                    if(n%m==0){
                        if(k>=n-s){
                            System.out.println("NO");
                        }
                        else {
                            System.out.println("YES");
                        }
                    } else {
                        if(k>=n-s-1){
                            System.out.println("NO");
                        }
                        else {
                            System.out.println("YES");
                        }
                    }
                }
            }
        }
    }
