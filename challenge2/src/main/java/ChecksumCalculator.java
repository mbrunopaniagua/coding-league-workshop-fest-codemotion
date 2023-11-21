public class ChecksumCalculator {

    public static int calculateChecksum(int[][] matrix) {
        int result = 0;

        for (int i = 0; i < matrix.length; i++) {
            int minValue = Integer.MAX_VALUE;
            int maxValue = Integer.MIN_VALUE;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < minValue) {
                    minValue = matrix[i][j];
                }
                if (matrix[i][j] > maxValue) {
                    maxValue = matrix[i][j];
                }
            }

            int different = maxValue - minValue;

            result += different;
        }

        return result;
    }

}
