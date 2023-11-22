import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ChecksumCalculatorTest {

    @Test
    public void basic() {
        assertEquals(8, ChecksumCalculator.calculateChecksum(new int[][]{{5,1,9,5}}));
    }

    @Test
    public void getChecksum3Rows() {
        assertEquals(18, ChecksumCalculator.calculateChecksum(new int[][]{
            {5,1,9,5},
            {7,5,3},
            {2,4,6,8}
        }));
    }

    @Test
    public void getCodemotionSolution() {
        assertEquals(1761299265, ChecksumCalculator.calculateChecksum(new int[][]{
            {345922, 3894033, 2222234, 400348596, 333920},
            {323322, 9994433, 3392884, 2384456, 333222299},
            {3399224, 553993, 2222, 443344, 993844, 9934555},
            {33220, 33333, 553553, 5555, 3333, 23485656, 3233922},
            {39392233, 48393434, 999233, 994382056, 393923},
            {39392, 483934, 9233, 992056, 333923}
        }));
    }

}
