//import java.util.*;
//public class Bouquet_B1 {
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
//
//                maxPetals = Math.max(maxPetals, currentPetals);
//            }
//            System.out.println(maxPetals);
//        }
//
//    }
//}

import java.util.*;
public class Bouquet_B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int n = sc.nextInt();
            long m = sc.nextLong();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            long noOfPetals = 0;
            long maxPetals = 0;
            long currentCost = 0;
            long currentPetals = 0;
            for (int i = n-1; i > 0; i--) {
                if(arr[i]<=m){
                    noOfPetals=arr[i];
                    currentCost=arr[i];
                    if((arr[i]-arr[i-1]<=1) && currentCost+arr[i-1]<=m){
                        currentCost=currentCost+arr[i-1];
                        i--;
                    }
                }
                maxPetals=Math.max(maxPetals,noOfPetals);
            }
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            System.out.println(maxPetals);
            System.out.println();
        }
    }
}
