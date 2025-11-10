/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package productsales;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for ProductSales class.
 * Tests:
 * 1. GetSalesOverLimit_ReturnsNumberOfSales
 * 2. GetSalesUnderLimit_ReturnsNumberOfSales
 *
 * Student: Oregolele Mangwegape
 * Student Number: ST10471814
 */
public class ProductSalesTest {

    private ProductSales instance;

    @Before
    public void setUp() {
        instance = new ProductSales();
    }

    @After
    public void tearDown() {
        instance = null;
    }

    /**
     * Test to determine that the correct values are returned
     * when the GetSalesOverLimit method is called.
     */
    @Test
    public void GetSalesOverLimit_ReturnsNumberOfSales() {
        System.out.println("Testing GetSalesOverLimit...");
        // Expected: 2 sales are above the limit (700 and 600)
        int expected = 2;
        int actual = instance.GetSalesOverLimit();
        assertEquals("Number of sales over the limit should be 2", expected, actual);
    }

    /**
     * Test to determine that the correct values are returned
     * when the GetSalesUnderLimit method is called.
     */
    @Test
    public void GetSalesUnderLimit_ReturnsNumberOfSales() {
        System.out.println("Testing GetSalesUnderLimit...");
        // Expected: 4 sales are under or equal to the limit (300, 150, 250, 200)
        int expected = 4;
        int actual = instance.GetSalesUnderLimit();
        assertEquals("Number of sales under the limit should be 4", expected, actual);
    }
}
