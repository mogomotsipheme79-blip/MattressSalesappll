package packagemattresssalesapp;

import java.util.Scanner;

public class packagemattresssalesapp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] products = {
            "Cozy Nights Monarch mattress",
            "Restonic Barbados mattress",
            "Sealy Phuket mattress"
        };

        int[][] sales = new int[3][3];
        int[] totalPerProduct = new int[3];
        int totalSales = 0;

        for (int i = 0; i < products.length; i++) {
            for (int month = 0; month < 3; month++) {
                System.out.print("Enter number of sales for month " + (month + 1)
                        + " for " + products[i] + ": ");
                sales[i][month] = input.nextInt();

                totalPerProduct[i] += sales[i][month];
                totalSales += sales[i][month];
            }
            System.out.println();
        }

        double average = (double) totalSales / 9;

        int topPosition = 0;
        for (int i = 1; i < totalPerProduct.length; i++) {
            if (totalPerProduct[i] > totalPerProduct[topPosition]) {
                topPosition = i;
            }
        }

        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println("********************************************");
        System.out.println("TOTAL PRODUCT SALES: " + totalSales);
        System.out.println("AVERAGE PRODUCT SALES: " + (int) average);
        System.out.println("MOST POPULAR PRODUCT: " + products[topPosition]
                + " (" + totalPerProduct[topPosition] + ")");
    }
}