import java.util.Scanner;

public class SecretBox_E {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long t=in.nextInt();

        while(t-->0)
        {
            long x=in.nextLong();
            long y=in.nextLong();
            long z=in.nextLong();

            long v=in.nextLong();

            long ans=0;
            for(long i=1;i<=x;i++)
            {
                for(long j=1;j<=y;j++)
                {
                    long k=v/(i*j);

                    if(i*j*k ==v)
                        ans=Math.max((x-i+1)*(y-j+1)*(z-k+1),ans);
                }
            }

            System.out.println(ans);
        }


    }
}
