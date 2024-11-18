package DDR.RFT;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarUtilsTest 
{

    @Test //Helyes értékcsökkenés számítása normál adatokra.
    void testCalculateDepreciationValidInput() {
        double result = CarUtils.calculateDepreciation(5000000, 3);
        assertEquals(2500000, result, 0.01, "Helytelen az értékcsökkenési kalkuláció.");
    }

    @Test //Maximális értékcsökkenés határának betartása.
    void testCalculateDepreciationMaxDepreciation() {
        double result = CarUtils.calculateDepreciation(5000000, 15);
        assertEquals(500000, result, 0.01, "Az érték nem csökkenhet az eredeti ár 10% alá.");
    }

    @Test //Hibás bemeneti adatok kezelése.
    void testCalculateDepreciationInvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> CarUtils.calculateDepreciation(-1000, 3));
        assertThrows(IllegalArgumentException.class, () -> CarUtils.calculateDepreciation(5000000, -1));
    }
}