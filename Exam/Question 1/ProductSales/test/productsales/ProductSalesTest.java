package productsales;

import org.junit.Test;
import static org.junit.Assert.*;

public class ProductSalesTest {

    // Shared test data for both tests
    private final int[][] productSales = {
        {300, 150, 700}, // Year 1
        {250, 200, 600}  // Year 2
    };

    private final ProductSales instance = new ProductSales();

    /**
     * Test 1: CalculateTotalSales_ReturnsTotalSales
     * Verifies that TotalSales() returns the correct total.
     */
    @Test
    public void CalculateTotalSales_ReturnsTotalSales() {
        System.out.println("Testing TotalSales...");

        int expectedTotal = 300 + 150 + 700 + 250 + 200 + 600; // 2200
        int actualTotal = instance.TotalSales(productSales);

        assertEquals("Total sales should match the expected total.", expectedTotal, actualTotal);
    }

    /**
     * Test 2: AverageSales_ReturnsAverageProductSales
     * Verifies that AverageSales() returns the correct average.
     */
    @Test
    public void AverageSales_ReturnsAverageProductSales() {
        System.out.println("Testing AverageSales...");

        double expectedAverage = (300 + 150 + 700 + 250 + 200 + 600) / 6.0; // 366.67
        double actualAverage = instance.AverageSales(productSales);

        assertEquals("Average sales should match the expected average.", expectedAverage, actualAverage, 0.01);
    }
}
