import java.util.Arrays;

public class ChecksumCalculator {

    public static int calculateChecksum(int[][] matrix) {
        int result = 0;

        for (int[] ints : matrix) {
            int minValue = Arrays.stream(ints).min().getAsInt();
            int maxValue = Arrays.stream(ints).max().getAsInt();

            int different = maxValue - minValue;

            result += different;
        }

        return result;
    }

}
