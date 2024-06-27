//import java.util.*;
//public class BearAndBigBrotherA {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        int t=0;
//        while(b>=a) {
//            a=a*3;
//            b=b*2;
//            t++;
//        }
//        System.out.println(t);
//    }
//}


//
//import java.util.*;
//public class BearAndBigBrotherA {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        for (int i = 0; i < t; i++) {
//            int n= sc.nextInt();
//            String s= sc.next();
//            long s_i=Long.parseLong(s);
//            int sum = 0;
//            if(s_i==0){
//                System.out.println("YES");
//            }
//            else {
//                while (s_i != 0) {
//                    sum += s_i % 10;
//                    s_i /= 10;
//                }
//                if (sum % 2 == 0) {
//                    if (sum == 2) {
//                    for(int j=0; j<s.length(); j++){
//                        if(s.charAt(j)==s.charAt(j+1)){
//                            System.out.println("NO");
//                            break;
//                        }
//                        else {
//                            System.out.println("YES");
//                            break;
//                        }
//                    }
//                    } else {
//                        System.out.println("YES");
//                    }
//                } else {
//                    System.out.println("NO");
//                }
//            }
//
//        }
//    }
//}

//
//import java.util.*;
//public class BearAndBigBrotherA {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        for (int i = 0; i < t; i++) {
//            int n= sc.nextInt();
//            int k= sc.nextInt();
//            int r=0;
//            int arr[]=new int[n];
//            int m_arr[]=new int[n];
//            for(int j=0; j<n; j++){
//                arr[j]=sc.nextInt();
//            }
//            for (int j = 0; j < n; j++) {
//                // Copying elements from arr to m_arr
//                for (int x = 0; x < n; x++) {
//                    m_arr[x] = arr[x];
//                }
//                int temp=m_arr[j];
//                m_arr[j]=m_arr[k-1];
//                m_arr[k-1]=temp;
//                int cnt=0;
//                if(j>0) {
////                    for (int x = 0; x < n; x++) {
////                        System.out.print(m_arr[x]+ " ");
////                    }
//                    for (int l = j - 1; l < n-1; l++) {
//                        if (m_arr[l] < m_arr[l + 1]) {
//                            cnt++;
//                            //System.out.println("h"+cnt);
//                        } else {
//                            break;
//                        }
//                    }
//                    //System.out.println();
//                } else {
//                    for (int l = j ; l < n-1; l++) {
//                        if (m_arr[l] < m_arr[l + 1]) {
//                            cnt++;
//                            //System.out.println("j"+cnt);
//                        } else {
//                            break;
//                        }
//                        //System.out.println();
//                    }
//                }
//                r=Math.max(cnt,r);
//            }
//            System.out.println(r);
//        }
//    }
//}



//import java.util.*;
//public class BearAndBigBrotherA {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        for (int i = 0; i < t; i++) {
//            int n= sc.nextInt();
//            int a= sc.nextInt();
//            int b= sc.nextInt();
//            int r=n/2;
//            int s=n%2;
//            int m=((r*b)+(s*a));
//            int l=a*n;
//            System.out.println(Math.min(m,l));
//
//        }
//    }
//}


//import java.util.*;
//public class BearAndBigBrotherA {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        for (int i = 0; i < t; i++) {
//            int n= sc.nextInt();
//            int a= sc.nextInt();
//            int b= sc.nextInt();
//            int r=n/2;
//            int s=n%2;
//            int m=((r*b)+(s*a));
//            int l=a*n;
//            System.out.println(Math.min(m,l));
//
//        }
//    }
//}


//import java.util.*;
//public class BearAndBigBrotherA {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        for (int i = 0; i < t; i++) {
//            int n= sc.nextInt();
//            int a= sc.nextInt();
//            int b= sc.nextInt();
//            int r=n/2;
//            int s=n%2;
//            int m=((r*b)+(s*a));
//            int l=a*n;
//            System.out.println(Math.min(m,l));
//
//        }
//    }
//}

//import java.util.*;
//public class BearAndBigBrotherA {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        for (int i = 0; i < t; i++) {
//            int n= sc.nextInt();
//            int c= sc.nextInt();
//            int d= sc.nextInt();
//
//            long[] durability = new long[n];
//            for (int j = 0; j < n; j++) {
//                durability[i] = sc.nextLong();
//            }
//
//        }
//    }
//}
////
//import java.util.*;
//public class BearAndBigBrotherA {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        for (int i = 0; i < t; i++) {
//            int n= sc.nextInt();
//            long k= sc.nextLong();
//
//            int[] durability = new int[n];
//            int sum=0;
//            for (int j = 0; j < n; j++) {
//                durability[j] = sc.nextInt();
//                sum=sum+durability[j];
//            }
//
//            int f=0;
//            int l=n-1;
//            int s=0;
//                while(k>0){
//                    if(n-s==1 && k>=durability[f]){
//                        s++;
//                        k=0;
//                        break;
//                    }
//                    else{
//                        if(k%2==0){
//                            durability[f]--;
//                            durability[l]--;
//                            if(durability[f]==0){
//                                f++;
//                                s++;
//                            }
//                            if (durability[l]==0){
//                                l--;
//                                s++;
//                            }
//                            k=k-2;
//                        }
//                        else {
//                            durability[f]--;
//                            if(durability[f]==0){
//                                f++;
//                                s++;
//                            }
//                            k--;
//                        }
//                    }
//                }
//                System.out.println(s);
//            }
//        }
//    }

import java.util.*;
public class BearAndBigBrotherA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n= sc.nextInt();
            long k= sc.nextLong();

            int[] durability = new int[n];
            int sum=0;
            for (int j = 0; j < n; j++) {
                durability[j] = sc.nextInt();
                sum=sum+durability[j];
            }

            int f=0;
            int l=n-1;
            int s=0;
                while(k>0){
                    if(n-s==1 && k>=durability[f]){
                        s++;
                        k=0;
                        break;
                    }
                    else{
                        if(durability[f]<durability[l]){
                            if(k-(durability[f])<0){
                                break;
                            }
                            else if(k-(2*(durability[f]))<0){
                                if (k-(2*(durability[f]))==(-1))
                                {
                                    s++;
                                }
                                break;
                            }
                            else {
                                durability[l]=durability[l]-durability[f];
                                k=k-(2*(durability[f]));
                                s++;
                                f++;
                            }
                        } else if (durability[f]>durability[l]) {
                            if(k-(durability[l])<0){
                                break;
                            }
                            else if(k-(2*(durability[l]))<0){

                                if (k-(2*(durability[l]))==(-1))
                                {
                                    s++;
                                }
                                break;
                            }
                            else {
                                durability[f]=durability[f]-durability[l];
                                k=k-(2*(durability[l]));
                                l--;
                                s++;
                            }
                        } else {
                            if(k-durability[f]<0){
                                break;
                            } else if(k-(2*(durability[l]))<0){
                                if (k-(2*(durability[f]))==(-1))
                                {
                                    s++;
                                }
                                break;
                            } else if ((k-(2*(durability[l]))==0)) {
                                s=s+2;
                                k=k-(2*(durability[l]));
                                break;
                            } else {
                                k=k-(2*(durability[l]));
                                s=s+2;
                                f++;
                                l--;
                            }
                        }
                    }
                }
                System.out.println(s);
            }
        }
    }

//import java.util.*;
//
// class GoodArrays {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int t = scanner.nextInt(); // number of test cases
//
//        for (int testCase = 0; testCase < t; testCase++) {
//            int n = scanner.nextInt(); // length of array a
//            int m = scanner.nextInt(); // length of array b
//            int k = scanner.nextInt(); // number of matching elements
//
//            int[] a = new int[n];
//            int[] b = new int[m];
//
//            // Reading array a
//            for (int i = 0; i < n; i++) {
//                a[i] = scanner.nextInt();
//            }
//
//            // Reading array b
//            for (int i = 0; i < m; i++) {
//                b[i] = scanner.nextInt();
//            }
//
//            // Counting good subsegments
//            int count = 0;
//            for (int i = 0; i <= n - m; i++) {
//                int[] subsegment = Arrays.copyOfRange(a, i, i + m);
//                Arrays.sort(subsegment);
//                Arrays.sort(b);
//
//                int matching = 0;
//                int pointerA = 0;
//                int pointerB = 0;
//
//                while (pointerA < m && pointerB < m) {
//                    if (subsegment[pointerA] == b[pointerB]) {
//                        matching++;
//                        pointerA++;
//                        pointerB++;
//                    } else if (subsegment[pointerA] < b[pointerB]) {
//                        pointerA++;
//                    } else {
//                        pointerB++;
//                    }
//                }
//
//                if (matching >= k) {
//                    count++;
//                }
//            }
//
//            System.out.println(count);
//        }
//    }
//}
//import java.util.*;
//
//class GoodArrays {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int t = scanner.nextInt(); // number of test cases
//
//        for (int testCase = 0; testCase < t; testCase++) {
//            int n = scanner.nextInt(); // length of array a
//            int m = scanner.nextInt(); // length of array b
//            int k = scanner.nextInt(); // number of matching elements
//
//            int[] a = new int[n];
//            int[] b = new int[m];
//
//            // Reading array a
//            for (int i = 0; i < n; i++) {
//                a[i] = scanner.nextInt();
//            }
//
//            // Reading array b
//            for (int i = 0; i < m; i++) {
//                b[i] = scanner.nextInt();
//            }
//
//            // Preprocessing array b
//            Arrays.sort(b);
//
//            // Counting good subsegments
//            int count = 0;
//            for (int i = 0; i <= n - m; i++) {
//                int[] subsegment = Arrays.copyOfRange(a, i, i + m);
//
//                // Preprocessing subsegment
//                Arrays.sort(subsegment);
//
//                // Counting matches
//                int matching = countMatches(subsegment, b);
//                if (matching >= k) {
//                    count++;
//                }
//            }
//
//            System.out.println(count);
//        }
//    }
//
//    private static int countMatches(int[] subsegment, int[] b) {
//        int matching = 0;
//        int pointerA = 0;
//        int pointerB = 0;
//
//        while (pointerA < subsegment.length && pointerB < b.length) {
//            if (subsegment[pointerA] == b[pointerB]) {
//                matching++;
//                pointerA++;
//                pointerB++;
//            } else if (subsegment[pointerA] < b[pointerB]) {
//                pointerA++;
//            } else {
//                pointerB++;
//            }
//        }
//
//        return matching;
//    }
//}
