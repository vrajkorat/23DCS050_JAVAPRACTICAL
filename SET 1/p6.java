 import java.util.Scanner;

public class p6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of days (n) for which you want to generate your exercise routine: ");
        int n = scanner.nextInt();

        int[] fibonacciSeries = new int[n];
        fibonacciSeries[0] = 0;
        fibonacciSeries[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacciSeries[i] = fibonacciSeries[i-1] + fibonacciSeries[i-2];
        }

        System.out.println("Here is your exercise routine for the next " + n + " days:");
        for (int i = 0; i < n; i++) {
            System.out.println("Day " + (i+1) + ": Exercise for " + fibonacciSeries[i] + " minutes");
        }
    }
} 
