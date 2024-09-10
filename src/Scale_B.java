import java.util.Scanner;

public class Scale_B
{
    static int a[], b[];

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        while(x-->0) {
            int a,b;
            a=sc.nextInt();b=sc.nextInt();
            char arr[][]=new char[a][a];

            for (int i = 0; i < a; i++) {
                arr[i]=sc.next().toCharArray();
            }
            for (int i = 0; i <a; i+=b) {
                for (int j = 0; j < a; j+=b) {
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
        }
    }
}