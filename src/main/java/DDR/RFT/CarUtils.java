package DDR.RFT;

/**
 * Segédosztály az autóval kapcsolatos számításokhoz, például az értékcsökkenéshez.
 * <p>
 * Ez az osztály metódusokat biztosít egy autó aktuális értékének becsléséhez.
 * Az eredeti ár és a kor alapján, segítve a felhasználókat a megalapozott döntések meghozatalában.
 * A használt autók vásárlásáról vagy eladásáról.
 * <p>
 */

public class CarUtils 
{
    /**
     * Kiszámítja az árcsökkenést az autó életkorához, és eredeti árához képest.
     * <p>
     * A kalkuláció magába foglalja:
     * <ul>
     *     <li>20% árcsökkenés az első évben</li>
     *     <li>10% árcsökkenés minden követő évben</li>
     *     <li>A maximum árcsökkenés 90% lehet</li>
     * </ul>
     * </p>
     *
     * @param originalPrice az autó eredeti ára HUF-ban
     * @param ageInYears az autó életkora években
     * @return az autó várható értéke HUF-ban
     * @throws IllegalArgumentException ha az eredeti ár negatív, vagy a kora 0
     */
    public static double calculateDepreciation(double originalPrice, int ageInYears) 
    {
        if (originalPrice < 0 || ageInYears < 0) 
        {
            throw new IllegalArgumentException("Az eredeti ár és életkor nem lehet 0, vagy kisebb szám.");
        }

        double depreciationRate = 0.2 + 0.1 * (ageInYears - 1); //interneten talált értékcsökkenési számolás
        depreciationRate = Math.min(depreciationRate, 0.9); 

        return originalPrice * (1 - depreciationRate);
    }
}
