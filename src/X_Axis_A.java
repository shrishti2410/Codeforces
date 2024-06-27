import java.util.Scanner;
public class X_Axis_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a= sc.nextInt();
            int b= sc.nextInt();
            int c= sc.nextInt();

            int a1=a-a;
            int b1=b-a;
            int c1=c-a;
            if(a1<0){
                a1=a1*(-1);
            }
            if(b1<0){
                b1=b1*(-1);
            }
            if(c1<0){
                c1=c1*(-1);
            }
            int A=(a1+b1+c1);

            int a2=a-b;
            int b2=b-b;
            int c2=c-b;
            if(a2<0){
                a2=a2*(-1);
            }
            if(b2<0){
                b2=b2*(-1);
            }
            if(c2<0){
                c2=c2*(-1);
            }
            int B=(a2+b2+c2);

            int a3=a-c;
            int b3=b-c;
            int c3=c-c;
            if(a3<0){
                a3=a3*(-1);
            }
            if(b3<0){
                b3=b3*(-1);
            }
            if(c3<0){
                c3=c3*(-1);
            }
            int C=(a3+b3+c3);

            int s=(Math.min(A,B));
            System.out.println(Math.min(s,C));
        }
    }
}