package DDR.RFT;
public class CarUtils 
{
    public static double calculateDepreciation(double originalPrice, int ageInYears) 
    {
        if (originalPrice < 0 || ageInYears < 0) {
            throw new IllegalArgumentException("Az eredeti ár és életkor nem lehet 0, vagy kisebb szám.");
        }

        double depreciationRate = 0.2 + 0.1 * (ageInYears - 1); //interneten talált értékcsökkenési számolás
        depreciationRate = Math.min(depreciationRate, 0.9); 

        return originalPrice * (1 - depreciationRate);
    }
}
