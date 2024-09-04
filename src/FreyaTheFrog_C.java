import java.util.Scanner;
public class FreyaTheFrog_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int k = sc.nextInt();

//            int X = 0, Y=0;

//            if(x/k==0) {
//                 X =x/k;
//            } else {
//                 X= x/k + 1;
//            }
//
//            if(y/k==0) {
//                 Y =y/k;
//            } else {
//                 Y= y/k + 1;
//            }
            long X = (x + k - 1) / k;
            long Y = (y + k - 1) / k;

            if(Y>X) {
                System.out.println((2 * X) + (2 * (Y - X)));
            } else if (X>Y) {
                System.out.println(((2 * Y) + (2 * (X - Y) - 1)));
            } else {
                System.out.println(X+Y);
            }
        }
    }
}

//import java.util.Scanner;
//
// class MinimumValueOfX {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int t = scanner.nextInt();
//
//        while (t-- > 0) {
//            int n = scanner.nextInt();
//            int k = scanner.nextInt();
//
//            long totalSum = (long) n * k + (long) n * (n - 1) / 2;
//            long prefixSum = 0;
//            long minX = Long.MAX_VALUE;
//
//            // We only need to iterate to find the minimum x
//            for (int i = 1; i <= n; i++) {
//                prefixSum += k + (i - 1);
//                long x = Math.abs(2 * prefixSum - totalSum);
//                if (x < minX) {
//                    minX = x;
//                }
//            }
//
//            System.out.println(minX);
//        }
//
//        scanner.close();
//    }
//}


//import java.util.Scanner;
//
// class RightTriangles {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int t = scanner.nextInt();
//
//        while (t-- > 0) {
//            int n = scanner.nextInt();
//
//            int countY0 = 0;
//            int countY1 = 0;
//
//            for (int i = 0; i < n; i++) {
//                int x = scanner.nextInt();
//                int y = scanner.nextInt();
//
//                if (y == 0) {
//                    countY0++;
//                } else if (y == 1) {
//                    countY1++;
//                }
//            }
//
//            // Calculate the number of right triangles
//            long triangles = (long) countY0 * (countY0 - 1) / 2 * countY1 +
//                    (long) countY1 * (countY1 - 1) / 2 * countY0;
//
//            System.out.println(triangles);
//        }
//
//        scanner.close();
//    }
//}
//
//import java.util.Scanner;
//
// class RightTriangles {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int t = scanner.nextInt();
//
//        while (t-- > 0) {
//            int n = scanner.nextInt();
//            int[][] points = new int[n][2];
//
//            // Read points and store them in a 2D array
//            for (int i = 0; i < n; i++) {
//                points[i][0] = scanner.nextInt();
//                points[i][1] = scanner.nextInt();
//            }
//
//            long rightTriangleCount = 0;
//
//            // Check all combinations of three points
//            for (int i = 0; i < n - 2; i++) {
//                for (int j = i + 1; j < n - 1; j++) {
//                    for (int k = j + 1; k < n; k++) {
//                        if (isRightTriangle(points[i], points[j], points[k])) {
//                            rightTriangleCount++;
//                        }
//                    }
//                }
//            }
//
//            System.out.println(rightTriangleCount);
//        }
//
//        scanner.close();
//    }
//
//    // Method to check if three points form a right triangle
//    private static boolean isRightTriangle(int[] p1, int[] p2, int[] p3) {
//        int x1 = p1[0], y1 = p1[1];
//        int x2 = p2[0], y2 = p2[1];
//        int x3 = p3[0], y3 = p3[1];
//
//        // Calculate squared lengths of the sides
//        int d1 = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
//        int d2 = (x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2);
//        int d3 = (x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3);
//
//        // Check if the sum of the squares of any two sides equals the square of the third side
//        return (d1 + d2 == d3) || (d2 + d3 == d1) || (d1 + d3 == d2);
//    }
//}
