import java.util.Scanner;
public class p12 {
    public static void main(String[] args)
    {
       double conversionRate = 100.0; 
       double amount;
       if (args.length > 0) 
       {
          amount = Double.parseDouble(args[0]);
       } 
       else 
       { 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount in Pounds: ");
        amount = scanner.nextDouble();
       }
        
        double rupees = convertPoundsToRupees(amount, conversionRate);
        System.out.printf("%.2f Pounds = %.2f Rupees%n", amount, rupees);
    }  
        public static double convertPoundsToRupees(double pounds, double conversionRate) 
        {
          return pounds * conversionRate;
        }
}


    

