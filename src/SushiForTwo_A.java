import java.util.*;
public class SushiForTwo_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] sushi = new int[n];
        for (int i = 0; i < n; i++) {
            sushi[i] = sc.nextInt();
        }
        List<Integer> segmentLengths = new ArrayList<>();
        List<Integer> segmentTypes = new ArrayList<>();
        int currentType = sushi[0];
        int currentLength = 1;

        for (int i = 1; i < n; i++) {
            if (sushi[i] == currentType) {
                currentLength++;
            } else {
                segmentTypes.add(currentType);
                segmentLengths.add(currentLength);
                currentType = sushi[i];
                currentLength = 1;
            }
        }
        segmentTypes.add(currentType);
        segmentLengths.add(currentLength);
        int maxLength = 0;
        for (int i = 1; i < segmentLengths.size(); i++) {
            if (segmentTypes.get(i) != segmentTypes.get(i - 1)) {
                maxLength = Math.max(maxLength, 2 * Math.min(segmentLengths.get(i), segmentLengths.get(i - 1)));
            }
        }
        System.out.println(maxLength);
    }
}