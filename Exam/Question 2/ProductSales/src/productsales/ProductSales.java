package productsales;

/**
 * Student name: Oregolele Mangwegape
 * Student number: ST10471814
 * Exam: PROG6112
 */
public class ProductSales implements IProductSales {
private final int limit = 500;
private final int[][] salesData = {
    {300, 150, 700}, //sales for year 1
    {250, 200, 600}  //sales for year 2
    };
    
    @Override
    public int[][] GetProductSales() {
     return salesData;
    }

    @Override
    public int GetTotalSales() {
      int total = 0;
      for(int[] yearSales : salesData){
          for(int sale : yearSales){
              total += sale;
          }
      }
      return total;
    }

    @Override
    public int GetSalesOverLimit() {
       int count = 0;
       for(int[] yearSales : salesData){
           for(int sale : yearSales){
               if(sale > limit){
                   count++;
               }
           }
       }
       return count; 
    }
    

    @Override
    public int GetSalesUnderLimit() {
     int count = 0;
     for(int [] yearSales : salesData){
         for(int sale : yearSales){
             if(sale <= limit){
                 count++;
             }
         }
     }
     return count;
    }

    @Override
    public int GetProductsProcessed() {
        return salesData.length; //this is for number of years
    }

    @Override
    public double GetAverageSales() {
     int total = GetTotalSales();
     int count =  0;
     for(int[] yearSales : salesData){
         count += yearSales.length;
     }
     return (double) total/count;
    }
    
}

