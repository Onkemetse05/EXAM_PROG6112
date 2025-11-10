
package productsales;

/**
 * Student name: Oregolele Mangwegape
 * Student number: ST10471814
 * Exam: PROG6112
 */

public interface IProductSales {
    int[][] GetProductSales();
    int GetTotalSales();
    int GetSalesOverLimit();
    int GetSalesUnderLimit();
    int GetProductsProcessed();
    double GetAverageSales();
}
