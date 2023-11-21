import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ChecksumCalculatorTest {

    @Test
    public void basic() {
        assertEquals(8, ChecksumCalculator.calculateChecksum(new int[][]{{5,1,9,5}}));
    }

}
