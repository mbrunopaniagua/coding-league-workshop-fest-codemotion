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

}
