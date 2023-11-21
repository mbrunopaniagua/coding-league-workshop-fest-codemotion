import java.util.Arrays;

public class ChecksumCalculator {

    public static int calculateChecksum(int[][] matrix) {
        return Arrays.stream(matrix)
            .mapToInt(ints ->
                Arrays.stream(ints).max().orElse(0) - Arrays.stream(ints).min().orElse(0)
            ).sum();
    }

}
