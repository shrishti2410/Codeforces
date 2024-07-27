//import java.util.*;
//public class SubstringAndSubsequence_B {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while (t-- > 0) {
//            String a=sc.next();
//            String b=sc.next();
//            int m=a.length();
//            int n=b.length();
//            int mx=0;
//            for(int i=0; i<n; i++){
//                int st=i;
//                for(int j=0;j<m;j++){
//                    if(st<n && b.charAt(st)==a.charAt(j)){
//                        st++;
//                    }
//                }
//                mx=Math.max(mx,st-i);
//            }
//            System.out.println(m+n-mx);
//        }
//    }
//}
//
//import java.util.*;
//public class SubstringAndSubsequence_B {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while (t-- > 0) {
//
//            int n= sc.nextInt();
//            long m=sc.nextLong();
//            int arr[]=new int[n];
//            for (int i=0; i<n; i++){
//                arr[i]=sc.nextInt();
//            }
//            Arrays.sort(arr);
//            long maxPetals = 0;
//            long currentCost = 0;
//            long currentPetals = 0;
//
//            int left = 0;
//            for (int right = 0; right < n; right++) {
//                currentCost += arr[right];
//                currentPetals += arr[right];
//
//                while (currentCost > m || (right > left && arr[right] - arr[left] > 1)) {
//                    currentCost -= arr[left];
//                    currentPetals -= arr[left];
//                    left++;
//                }
//                maxPetals = Math.max(maxPetals, currentPetals);
//            }
//            System.out.println(maxPetals);
//        }
//
//    }
//}

//import java.util.*;
//public class SubstringAndSubsequence_B {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while (t-- > 0) {
//
//            int n= sc.nextInt();
//            long m=sc.nextLong();
//            int arr[]=new int[n];
//            //int nums[]=new int[n];
//            for (int i=0; i<n; i++){
//                arr[i]=sc.nextInt();
//            }
//            for (int i=0; i<n; i++){
//                arr[i]=sc.nextInt();
//            }
//
//            Arrays.sort(arr);
//            long maxPetals = 0;
//            long currentCost = 0;
//            long currentPetals = 0;
//            int right=n-1;
//            while (right>0){
//                if((arr[right]-arr[right-1]<=1) && currentCost<m){
//                    currentCost += arr[right];
//                    currentPetals += arr[right];
//                }
//                maxPetals = Math.max(maxPetals, currentPetals);
//                right--;
//            }
//            System.out.println(maxPetals);
//        }
//    }
//}
//


//import java.util.*;
//public class SubstringAndSubsequence_B {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while (t-- > 0) {
//            int n = sc.nextInt();
//            int k = sc.nextInt();
//
//            int sum=n;
//            int cnt=1;
//            int s=n-1;
//            while (s>0){
//                sum=sum+(2*s);
//                cnt=cnt+2;
//                s--;
//            }
//            int num=sum-cnt;
//            if(k<=num){
//                System.out.println(0);
//            } else {
//                k=k-num;
//                System.out.println(cnt-(cnt-k));
////                System.out.println(k-(n*n)+((2*n)-1));
//            }
//        }
//    }
//}


//import java.util.*;
//import java.math.BigInteger;
//public class SubstringAndSubsequence_B {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while (t-- > 0) {
//
//            int n = sc.nextInt();
////            BigInteger biginteger=new BigInteger("8976543245");
//            int ans=0;
//            long arr[]=new long[n];
//            for (int i=0; i<n; i++){
//                arr[i]=sc.nextLong();
//            }
//            for (int i=0; i<n-1; i++){
//                if((arr[i]>arr[i+1]) && arr[i+1]==1){
//                    ans=-1;
//                    break;
//                }
//                if(arr[i]>arr[i+1]){
//                    arr[i+1]=arr[i+1]*arr[i+1];
//                    ans++;
//                    i--;
//                }
//            }
//            System.out.println(ans);
//        }
//    }
//}

//import java.util.*;
//import java.math.BigInteger;
//
//public class SubstringAndSubsequence_B {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while (t-- > 0) {
//            int n = sc.nextInt();
//            int ans = 0;
//            BigInteger[] arr = new BigInteger[n];
//            for (int i = 0; i < n; i++) {
//                arr[i] = sc.nextBigInteger();
//            }
//            for (int i = 0; i < n - 1; i++) {
//                if (arr[i].compareTo(arr[i + 1]) > 0 && arr[i + 1].equals(BigInteger.ONE)) {
//                    ans = -1;
//                    break;
//                }
//                if (arr[i].compareTo(arr[i + 1]) > 0) {
//                    arr[i + 1] = arr[i + 1].multiply(arr[i + 1]);
//                    ans++;
//                    i--;
//                }
//            }
//            System.out.println(ans);
//        }
//        sc.close();
//    }
//}


import java.util.*;
public class SubstringAndSubsequence_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[]=new int[n];
            for (int i=0; i<n; i++){
                arr[i]=sc.nextInt();
            }

//            int j;
//            if(arr[0]==1){
//                j=1;
//            } else {
//                j=0;
//            }
            double p=0, q, sum=0;
            for (int i=1; i<n; i++){

                if((arr[i-1]>arr[i]) && arr[i]==1){
                    sum=-1;
                    break;
                }

                double ratio = ((Math.log(arr[i - 1]) / Math.log(2)) / (Math.log(arr[i]) / Math.log(2)));
                double logBase2Ratio = Math.log(ratio) / Math.log(2);
                q = (Math.ceil(logBase2Ratio))+p;
                p=q;
                sum=sum+p;
            }
            System.out.println((int) sum);
        }
    }
}
