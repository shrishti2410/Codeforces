////import java.util.*;
////public class NeneAndCardGame_B {
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        int t = sc.nextInt();
////        for (int i = 0; i < t; i++) {
////            int n = sc.nextInt();
////            HashSet<Integer> set = new HashSet<>();
////            int cnt=0;
////            for (int j = 0; j < n; j++) {
////                int num=sc.nextInt();
////                if(set.contains(num)){
////                    cnt++;
////                } else {
////                    set.add(num);
////                }
////            }
////            System.out.println(cnt);
////        }
////    }
////}
////import java.util.*;
////public class NeneAndCardGame_B {
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        int t = sc.nextInt();
////        for (int i = 0; i < t; i++) {
////            int n = sc.nextInt();
////            int k = sc.nextInt();
////            int[] arr=new int[n];
////            Map<Integer, Integer> q=new HashMap<>();
////            for(int j=0; j<n; j++){
////                arr[j]= sc.nextInt();
////                q.put(arr[j], q.getOrDefault(arr[j], 0) + 1);
////            }
////            int cnt = 0;
////            for (Map.Entry<Integer, Integer> entry : q.entrySet()) {
////                if (entry.getValue() >= k) {
////                    cnt ++;
////                }
////            }
////            if(cnt==0){
////                System.out.println(n);
////            } else {
////                System.out.println(k-1);
////            }
////        }
////    }
////}
//
//import java.util.*;
//public class NeneAndCardGame_B {
//    public static <flag> void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        for (int i = 0; i < t; i++) {
//            int n = sc.nextInt();
//            int m = sc.nextInt();
//            sc.nextLine();
//            char[][] grid = new char[n][m];
//            for (int j = 0; j < n; j++) {
//                String s = sc.nextLine();
//                for (int k = 0; k < m; k++) {
//                    grid[j][k] = s.charAt(k);
//                }
//            }
//
//            boolean f=true;
//
//            int cnt=0, c=0;
//            String s1="", s2="";
//
//            //vertical
//            int x=0;
//            for (int j = 1; j < n; j++) {
//                if((grid[j][x])==grid[j-1][x]) {
//                    s1= String.valueOf(grid[j][x]);
//                    cnt++;
//                } else {
//                    cnt=0;
//                    f=false;
//                    break;
//                }
//            }
//
//            if(cnt==n){
//                int y=m-1;
//                for (int j = 1; j < n; j++) {
//                    if((grid[j][y])==grid[j-1][y]) {
//                        s2= String.valueOf(grid[j][y]);
//                        c++;
//                    } else {
//                        c=0;
//                        f=false;
//                        break;
//                    }
//                }
//            }
//
//            if (!s1.equals(s2)) {
//                f = false;
//            }
//
//             cnt=0;
//            if(f==true){
//                //horizontal
//                x=0;
//                for (int j = 1; j < m; j++) {
//                    if((grid[x][j])==grid[x][j-1]) {
//                        s1= String.valueOf(grid[x][j]);
//                        cnt++;
//                    } else {
//                        cnt=0;
//                        f=false;
//                        break;
//                    }
//                }
//
//                if(cnt==m){
//                    int y=n-1;
//                    for (int j = 1; j < m; j++) {
//                        if((grid[y][j])==grid[y][j-1]) {
//                            s2= String.valueOf(grid[y][j]);
//                            c++;
//                        } else {
//                            c=0;
//                            f=false;
//                            break;
//                        }
//                    }
//                }
//
//                if (!s1.equals(s2)) {
//                    f = false;
//                }
//
//            }
//            if(f==true){
//                System.out.println("YES");
//            } else {
//                System.out.println("NO");
//            }
//        }
//    }
//}


//import java.util.*;
//public class NeneAndCardGame_B {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        for (int i = 0; i < t; i++) {
//            int n = sc.nextInt();
//            HashSet<Integer> set = new HashSet<>();
//            int cnt=0;
//            for (int j = 0; j < n; j++) {
//                int num=sc.nextInt();
//                if(set.contains(num)){
//                    cnt++;
//                } else {
//                    set.add(num);
//                }
//            }
//            System.out.println(cnt);
//        }
//    }
//}
//import java.util.*;
//public class NeneAndCardGame_B {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        for (int i = 0; i < t; i++) {
//            int n = sc.nextInt();
//            int k = sc.nextInt();
//            int[] arr=new int[n];
//            Map<Integer, Integer> q=new HashMap<>();
//            for(int j=0; j<n; j++){
//                arr[j]= sc.nextInt();
//                q.put(arr[j], q.getOrDefault(arr[j], 0) + 1);
//            }
//            int cnt = 0;
//            for (Map.Entry<Integer, Integer> entry : q.entrySet()) {
//                if (entry.getValue() >= k) {
//                    cnt ++;
//                }
//            }
//            if(cnt==0){
//                System.out.println(n);
//            } else {
//                System.out.println(k-1);
//            }
//        }
//    }
////}
//
//import java.util.*;
//public class NeneAndCardGame_B {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        for (int i = 0; i < t; i++) {
//            String s = sc.next();
//            int cnt=0;
//            int c=0;
//            for(int j=0; j<s.length()-1; j++){
//                if(s.charAt(j)<s.charAt(j+1)) {
//                    c=1;
//                }
//                if(s.charAt(j)!=s.charAt(j+1)) {
//                    cnt++;
//                }
//            }
//            System.out.println(cnt+1-c);
//        }
//    }
//}

//import java.util.*;
//public class NeneAndCardGame_B {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        for (int i = 0; i < t; i++) {
//            int a= sc.nextInt();
//            int b= sc.nextInt();
//            if(a>b){
//                System.out.println(b+" "+a);
//            } else {
//                System.out.println(a+" "+b);
//            }
//        }
//    }
//}

//
//import java.util.*;
//public class NeneAndCardGame_B {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        for (int i = 0; i < t; i++) {
//            int cnt=0;
//            String s = sc.next();
//            for(int j=0; j<s.length()-1; j++){
//                if(s.charAt(j)==s.charAt(j+1)) {
//                    cnt++;
//                }
//            }
//            if(cnt==s.length() || s.length()==1){
//                System.out.println("NO");
//            } else {
//                System.out.println("YES");
//                System.out.println();
//            }
//        }
//    }
//}

//
//import java.util.Scanner;
//import java.util.Arrays;
//
// class Main1 {
//    // Function to solve the problem for a single test case
//    public static String solve(String s) {
//        // Check if all characters are the same
//        if (s.chars().distinct().count() == 1) {
//            // If all characters are the same, it's not possible to form a different string
//            return "NO";
//        } else {
//            // If not, sort the characters to get a new string
//            char[] chars = s.toCharArray();
//            Arrays.sort(chars);
//            String sortedString = new String(chars);
//
//            // Check if the sorted string is equal to the original string
//            if (sortedString.equals(s)) {
//                // If it's equal, swap the first two characters to make it different
//                return "YES\n" + sortedString.substring(1) + sortedString.substring(0, 1);
//            } else {
//                // If it's not equal, the sorted string itself is different
//                return "YES\n" + sortedString;
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Input number of test cases
//        int t = scanner.nextInt();
//        scanner.nextLine(); // Consume newline
//
//        // Iterate through each test case
//        for (int i = 0; i < t; i++) {
//            // Input the string for this test case
//            String s = scanner.nextLine();
//            // Output the result of this test case
//            System.out.println(solve(s));
//        }
//        scanner.close();
//    }
//}

//
//import java.util.*;
//public class NeneAndCardGame_B {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        for (int i = 0; i < t; i++) {
//            int a= sc.nextInt();
//            int b= sc.nextInt();
//            int c= sc.nextInt();
//            int d= sc.nextInt();
//
//            if(a>b){
//                if(c>a || c<b){
//                    if(d>b && d<a){
//                        System.out.println("YES");
//                    } else {
//                        System.out.println("NO");
//                    }
//                } else if (d>a || d<b) {
//                    if(c>b && c<a){
//                        System.out.println("YES");
//                    } else {
//                        System.out.println("NO");
//                    }
//                } else {
//                    System.out.println("NO");
//                }
//            } else if (b>a) {
//                if(c>b || c<a){
//                    if(d>a && d<b){
//                        System.out.println("YES");
//                    } else {
//                        System.out.println("NO");
//                    }
//                } else if (d>b || d<a) {
//                    if(c>a && c<b){
//                        System.out.println("YES");
//                    } else {
//                        System.out.println("NO");
//                    }
//                } else {
//                    System.out.println("NO");
//                }
//            } else {
//                System.out.println("NO");
//            }
//        }
//    }
//}
//
//
//import java.util.*;
//public class NeneAndCardGame_B {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        for (int i = 0; i < t; i++) {
//            int n = sc.nextInt();
//            int k = sc.nextInt();
//            int q = sc.nextInt();
//            int[] a = new int[k + 1];
//            int[] b = new int[k + 1];
//            //c=speed
//            double[] c=new double[k+1];
//            a[0]=0;
//            b[0]=0;
//            c[0]=0;
//            for(int j=1; j<=k; j++){
//                a[j]= sc.nextInt();
//            }
//            for(int j=1; j<=k; j++){
//                b[j]= sc.nextInt();
//            }
//            for(int j=1; j<=k; j++){
//                c[j]=((a[j]-a[j-1]))/((b[j]-b[j-1]));
//            }
//            for (int j = 0; j < q; j++) {
//                double d = sc.nextDouble();
//                double cnt=0, m;
//                if(d==0){
//                    System.out.print(0);
//                } else {
//                    while(d!=0){
//                    int x=1;
//                        if((a[x]-a[x-1])<=d){
//                            m=a[x]-a[x-1];
//                            cnt=cnt+(m/c[x]);
//                            d=d-m;
//                        } else {
//                            cnt=cnt+(d/c[x]);
//                            d=0;
//                        }
//                    }
//                }
//                System.out.print(Math.round(cnt)+" ");
//            }
//            System.out.println();
//        }
//    }
//}
//import java.util.*;
//
//public class NeneAndCardGame_B {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        for (int i = 0; i < t; i++) {
//            int n = sc.nextInt();
//            int k = sc.nextInt();
//            int q = sc.nextInt();
//            int[] a = new int[k + 1];
//            int[] b = new int[k + 1];
//            double[] c = new double[k + 1];
//            a[0] = 0;
//            b[0] = 0;
//            c[0] = 0;
//            for (int j = 1; j <= k; j++) {
//                a[j] = sc.nextInt();
//            }
//            for (int j = 1; j <= k; j++) {
//                b[j] = sc.nextInt();
//            }
//            for (int j = 1; j <= k; j++) {
//                c[j] = (double) (a[j] - a[j - 1]) / (b[j] - b[j - 1]);
//            }
//            for (int j = 0; j < q; j++) {
//                double d = sc.nextDouble();
//                double cnt = 0;
//                if (d == 0) {
//                    System.out.print(0 + " ");
//                } else {
//                    int x = 1;
//                    while (d > 0) {
//                        double m = Math.min(d, a[x] - a[x - 1]);
//                        cnt += m / c[x];
//                        d -= m;
//                        x++;
//                    }
//                    System.out.print((int) Math.floor(cnt) + " ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}
import java.util.*;

public class NeneAndCardGame_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            long q = sc.nextLong();
            long[] a = new long[(int)(k + 1)];
            long[] b = new long[(int)(k + 1)];
            double[] c = new double[(int)(k + 1)];
            a[0] = 0;
            b[0] = 0;
            c[0] = 0;
            for (int j = 1; j <= k; j++) {
                a[j] = sc.nextLong();
            }
            for (int j = 1; j <= k; j++) {
                b[j] = sc.nextLong();
            }
            for (int j = 1; j <= k; j++) {
                c[j] = (double) (a[j] - a[j - 1]) / (b[j] - b[j - 1]);
            }
            for (int j = 0; j < q; j++) {
                double d = sc.nextDouble();
                double cnt = 0;
//                if (d == 0) {
//                    System.out.print(0 + " ");
//                } else {
                    int x = 1;
                    while (d > 0) {
                        double m = Math.min(d, a[x] - a[x - 1]);
                        cnt += m / c[x];
                        d -= m;
                        x++;
                    }
                    System.out.print((long) Math.floor(cnt) + " ");
                //}
            }
            System.out.println();
        }
    }
}

//
//import java.util.*;
//public class NeneAndCardGame_B {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        for (int i = 0; i < t; i++) {
//            int r= sc.nextInt();
//        }
//    }
//}
