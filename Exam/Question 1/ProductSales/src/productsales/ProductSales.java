package productsales;

/**
 *
 * @author User
 */
public class ProductSales implements IProduct{
    
    public static void main(String[] args){
        ProductSales report = new ProductSales();
        report.Report();
    }
private final int[][] salesData = {
    {300, 150, 700}, //sales for year 1
    {250, 200, 600}  //sales for year 2
    };

    @Override
    public int TotalSales(int[][] productSales) {
        int total = 0;
        for(int[] year : productSales){
            for (int sale : year){
                total += sale;
            }
        }
    return total;
        
    }

    @Override
    public double AverageSales(int[][] productSales) {
        int count = 0;
        int total = 0;
        for(int[] year : productSales){
            for(int sale : year){
                total += sale;
                count++;
            }
        }
    return (double) total/count;
    }

    @Override
    public int MaxSale(int[][] productSales) {
        int max = productSales[0][0];
        for(int[] year : productSales){
            for(int sale : year){
                if (sale > max){
                    max = sale;
                }
            }
        }
        return max;
    }

    @Override
    public int MinSale(int[][] productSales) {
        int min = productSales[0][0];
        for(int[] year : productSales){
            for(int sale : year){
                if (sale < min){
                    min = sale;
                }
            }
        }
        return min;
    }
    
    //this is the produc sales report
    public void Report(){
       System.out.println("PRODUCT SALES REPORT - 2025");
       System.out.println("----------------------------------");
       System.out.print("Total sales: " + TotalSales(salesData));
       System.out.print("\nAverage sales: " + AverageSales(salesData));
       System.out.print("\nMaximum sales: " + MaxSale(salesData));
       System.out.print("\nMinimum sales: " + MinSale(salesData));
       System.out.println("\n----------------------------------");
    }
}
