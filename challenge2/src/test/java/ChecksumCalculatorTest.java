import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ChecksumCalculatorTest {

    @Test
    public void basic() {
        assertEquals(0, ChecksumCalculator.calculateChecksum(new int[][]{{}}));
    }

}
