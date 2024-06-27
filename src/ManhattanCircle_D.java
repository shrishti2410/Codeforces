import java.util.Scanner;

public class ManhattanCircle_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int totalX = 0, totalY = 0, count = 0;

            // Read the grid
            char[][] grid = new char[n][m];
            for (int j = 0; j < n; j++) {
                String line = sc.next();
                for (int k = 0; k < m; k++) {
                    grid[j][k] = line.charAt(k);
                    if (grid[j][k] == '#') {
                        totalX += j + 1;
                        totalY += k + 1;
                        count++;
                    }
                }
            }

            int centerX = totalX / count;
            int centerY = totalY / count;

            System.out.println(centerX + " " + centerY);
        }
    }
}

