package packagemattresssalesapp;

public class Product implements IProduct {

    private String[] products;
    private int[][] sales;

    public Product(String[] products, int[][] sales) {
        this.products = products;
        this.sales = sales;
    }

    @Override
    public int GetTotalProductsSold() {
        int total = 0;
        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                total = total + sales[i][j];
            }
        }
        return total;
    }

    @Override
    public double GetAverageProductSold() {
        return (double) GetTotalProductsSold() / 9;
    }

    @Override
    public String GetMostPopularProduct() {
        int highestTotal = 0;
        int highestIndex = 0;

        for (int i = 0; i < products.length; i++) {
            int productTotal = 0;
            for (int j = 0; j < 3; j++) {
                productTotal = productTotal + sales[i][j];
            }
            if (productTotal > highestTotal) {
                highestTotal = productTotal;
                highestIndex = i;
            }
        }

        int highestSingleMonth = 0;
        for (int j = 0; j < 3; j++) {
            if (sales[highestIndex][j] > highestSingleMonth) {
                highestSingleMonth = sales[highestIndex][j];
            }
        }
        return products[highestIndex] + " (" + highestSingleMonth + ")";
    }
}