import java.math.BigInteger;
import java.util.Scanner;

public class SecretBox_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < t; i++) {
            BigInteger x = sc.nextBigInteger();
            BigInteger y = sc.nextBigInteger();
            BigInteger z = sc.nextBigInteger();
            BigInteger k = sc.nextBigInteger();
            BigInteger ANS = BigInteger.ZERO;

            for (BigInteger a = BigInteger.ONE; a.compareTo(x) <= 0; a = a.add(BigInteger.ONE)) {
                for (BigInteger b = BigInteger.ONE; b.compareTo(y) <= 0; b = b.add(BigInteger.ONE)) {
                    if (k.mod(a.multiply(b)).equals(BigInteger.ZERO) && k.divide(a.multiply(b)).compareTo(z) <= 0) {
                        BigInteger s1 = a;
                        BigInteger s2 = b;
                        BigInteger s3 = k.divide(a.multiply(b));
                        BigInteger ans = (x.subtract(s1).add(BigInteger.ONE))
                                .multiply(y.subtract(s2).add(BigInteger.ONE))
                                .multiply(z.subtract(s3).add(BigInteger.ONE));
                        ANS = ANS.max(ans);
                    }
                }
            }
            System.out.println(ANS);
        }
    }
}
