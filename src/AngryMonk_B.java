//import java.util.*;
//public class AngryMonk_B {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int t = in.nextInt();
//        while (t-- > 0) {
//            int n=in.nextInt();
//            int k=in.nextInt();
//            int arr[] = new int[k];
//            for (int i = 0; i < k; i++) {
//                arr[i]=in.nextInt();
//            }
//            Arrays.sort(arr);
//            int cnt=0, cnt1=0;
//            //cnt=no of steps to break
//            //cnt1=no of steps to join
//            for (int i = 0; i < k-1; i++) {
//                if(arr[i]!=1){
//                    cnt=cnt+arr[i]-1;
//                    cnt1=cnt1+arr[i];
//                } else {
//                    cnt1=cnt1+1;
//                }
//            }
//            System.out.println(cnt+cnt1);
//        }
//    }
//}
//
//import java.util.Scanner;
//
//public class AngryMonk_B {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int t = in.nextInt();
//        while (t-- > 0) {
//            int n = in.nextInt();
//            int ans;
//            if(n%4==0){
//                ans=n/4;
//            } else {
//                ans=n/4 +1;
//            }
//            System.out.println(ans);
//        }
//    }
//}

//import java.util.Scanner;
//
// class GridReduction {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//
//        while (t-- > 0) {
//            int n = sc.nextInt();
//            int k = sc.nextInt();
//
//            char[][] grid = new char[n][n];
//            for (int i = 0; i < n; i++) {
//                String row = sc.next();
//                for (int j = 0; j < n; j++) {
//                    grid[i][j] = row.charAt(j);
//                }
//            }
//
//            reduceGrid(grid, k);
//        }
//    }
//
//    private static void reduceGrid(char[][] grid, int k) {
//        int n = grid.length;
//        int newN = n / k;
//        char[][] reducedGrid = new char[newN][newN];
//
//        for (int i = 0; i < newN; i++) {
//            for (int j = 0; j < newN; j++) {
//                char value = grid[i * k][j * k];
//                boolean consistent = true;
//                for (int x = 0; x < k; x++) {
//                    for (int y = 0; y < k; y++) {
//                        if (grid[i * k + x][j * k + y] != value) {
//                            consistent = false;
//                            break;
//                        }
//                    }
//                    if (!consistent) {
//                        break;
//                    }
//                }
//                reducedGrid[i][j] = consistent ? value : '?'; // Handle inconsistent blocks
//            }
//        }
//
//        for (int i = 0; i < newN; i++) {
//            for (int j = 0; j < newN; j++) {
//                System.out.print(reducedGrid[i][j]);
//            }
//            System.out.println();
//        }
//    }
//}

//import java.util.Scanner;
//
//public class AngryMonk_B {
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        int t = in.nextInt();
//        in.nextLine();
//
//
//        for (int testCase = 0; testCase < t; testCase++) {
//            int n = in.nextInt();
//            int k = in.nextInt();
//            in.nextLine();
//
//
//            char[][] grid = new char[n][n];
//            for (int i = 0; i < n; i++) {
//                grid[i] = in.nextLine().toCharArray();
//            }
//
//
//            int reducedSize = n / k;
//            char[][] reducedGrid = new char[reducedSize][reducedSize];
//
//
//            for (int i = 0; i < n; i += k) {
//                for (int j = 0; j < n; j += k) {
//                    char value = grid[i][j];
//                    int reducedRow = i / k;
//                    int reducedCol = j / k;
//                    reducedGrid[reducedRow][reducedCol] = value;
//                }
//            }
//
//
//            for (int i = 0; i < reducedSize; i++) {
//                for (int j = 0; j < reducedSize; j++) {
//                    System.out.print(reducedGrid[i][j]);
//                }
//                System.out.println();
//            }
//        }
//    }
//}
//
//import java.util.*;
//public class AngryMonk_B {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int t = in.nextInt();
//        while (t-- > 0) {
//            int n = in.nextInt();
//            int q = in.nextInt();
//            String a = in.next();
//            String b = in.next();
//            in.nextLine();
//            String aa, bb;
//
//            for (int i = 0; i < q; i++) {
//                int l= in.nextInt();
//                int r= in.nextInt();
//                in.nextLine();
//                 aa=a.substring(l-1,r);
//                 bb=b.substring(l-1,r);
//
//                char[] A = aa.toCharArray();
//                char[] B = bb.toCharArray();
//                Arrays.sort(A);
//                Arrays.sort(B);
//                String sortedAA = new String(A);
//                String sortedBB = new String(B);
//                int cnt=0;
//                if(sortedAA.equals(sortedBB)){
//                    cnt=0;
//                } else {
//                    int k=0;
//                    for(int j=0; j<r-l+1; j++){
//                        if(sortedAA.charAt(j)==sortedBB.charAt(k)){
//                            k++;
//                        }else {
//                            cnt++;
//                        }
//                    }
//                }
//
//                System.out.println(cnt);
//
//            }
//        }
//    }
//}
//
//import java.util.*;
//
//public class AngryMonk_B {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int t = in.nextInt();
//        while (t-- > 0) {
//            int n = in.nextInt();
//            int q = in.nextInt();
//            String a = in.next();
//            String b = in.next();
//            in.nextLine();
//
//            for (int i = 0; i < q; i++) {
//                int l = in.nextInt();
//                int r = in.nextInt();
//                in.nextLine();
//
//                String aa = a.substring(l-1, r);
//                String bb = b.substring(l-1, r);
//                Map<Character, Integer> freqA = new HashMap<>();
//                Map<Character, Integer> freqB = new HashMap<>();
//
//                for (char c : aa.toCharArray()) {
//                    freqA.put(c, freqA.getOrDefault(c, 0) + 1);
//                }
//                for (char c : bb.toCharArray()) {
//                    freqB.put(c, freqB.getOrDefault(c, 0) + 1);
//                }
//                int cnt = 0;
//
//                for (Map.Entry<Character, Integer> entry : freqA.entrySet()) {
//                    char key = entry.getKey();
//                    int countA = entry.getValue();
//                    int countB = freqB.getOrDefault(key, 0);
//                    cnt += Math.abs(countA - countB);
//                }
//                for (Map.Entry<Character, Integer> entry : freqB.entrySet()) {
//                    char key = entry.getKey();
//                    if (!freqA.containsKey(key)) {
//                        cnt += entry.getValue();
//                    }
//                }
//                System.out.println(cnt/2);
//            }
//        }
//    }
//}

//import java.util.Scanner;
//
// class Fun {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while (t-- > 0) {
//            int n = sc.nextInt();
//            int x = sc.nextInt();
//            long count = 0;
//
//            for (int a = 1; a <= x; a++) {
//                for (int b = 1; b <= x - a; b++) {
//                    int maxC = x - a - b;
//                    if (maxC <= 0) continue;
//
//                    long maxCByCondition = (n - a * b) / (a + b);
//                    if (maxCByCondition > maxC) {
//                        maxCByCondition = maxC;
//                    }
//
//                    if (maxCByCondition > 0) {
//                        count += maxCByCondition;
//                    }
//                }
//            }
//
//            System.out.println(count);
//        }
//    }
//}

import java.util.*;

public class AngryMonk_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            int q = in.nextInt();
            String a = in.next();
            String b = in.next();

            for (int i = 0; i < q; i++) {
                int l = in.nextInt();
                int r = in.nextInt();
                in.nextLine();

                String aa = a.substring(l - 1, r);
                String bb = b.substring(l - 1, r);

                StringBuilder A = new StringBuilder(aa);
                StringBuilder B = new StringBuilder(bb);
                int cnt=0;

                for (int j = 0; j < bb.length(); j++) {
                    char charToRemove = B.charAt(j);
                    int index = A.indexOf(Character.toString(charToRemove));
                    if (index != -1) {
                        A.deleteCharAt(index);
                    }else {
                        cnt++;
                    }
                }

                System.out.println(cnt);
            }
        }
    }
}
