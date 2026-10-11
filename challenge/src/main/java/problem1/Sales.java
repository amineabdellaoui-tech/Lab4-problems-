package problem1;
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        //qst 6 ask the user for sales people
        int nbrSalesPeople;
        System.out.print("Enter the number of sales people : ");
        nbrSalesPeople = scan.nextInt();
        //final int SALESPEOPLE = 5;
        int[] sales = new int[nbrSalesPeople];
        int sum;


        for (int i=0; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + (i+1) + ": ");
            sales[i] = scan.nextInt();
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;


        //variables for finding the maximum sale with its index
        int maxIndex =0;
        int maxSale=sales[0];
        //variables for finding the minimum sale with its index
        int minIndex =0;
        int minSale=sales[0];

        for (int i=0; i<sales.length; i++)
        {
            System.out.println(" " + (i+1) + " " + sales[i]);
            sum += sales[i];
            if(sales[i]>=maxSale){
                maxSale=sales[i];
                maxIndex=i;
            }
            if(sales[i]<=minSale){
                minSale=sales[i];
                minIndex=i;
            }
        }
        System.out.println("\nTotal sales: " + sum);

        //printing and computing the average sale
        double avgSale =(double) sum/sales.length;
        System.out.println("The average sale is "+avgSale);

        //printing the maximum sale
        System.out.println("Salesperson "+(maxIndex+1)+" had the highest sale with $"+maxSale+".");

        //printing the minimum sale
        System.out.println("Salesperson "+(minIndex+1)+" had the lowest sale with $"+minSale+".");

        //Asking the use to enter a value
        int userVal;
        System.out.print("Enter a value to find each salesperson who exceeded that amount, and the \n" +
                "amount of their sales : ");
        userVal = scan.nextInt();
        //displaying all those who exceeded the amount while keeping yhe counter of their numbers
        int counter=0;
        System.out.println("The salesperson who exceeded the amount "+userVal+" : ");
        for(int i=0;i<sales.length;i++){
            if(sales[i]>userVal){
                counter++;
                System.out.println("The salesperson of index "+(i+1)+" with sale "+sales[i]+".");
            }
        }
        System.out.println("And the number of person who exceeded that amount is "+counter);

        //for qst 5 I changed i by i+1 in the loop to avoid the problem
        //for qst 6 : I removed "final int SALESPEOPLE = 5"
    }
}