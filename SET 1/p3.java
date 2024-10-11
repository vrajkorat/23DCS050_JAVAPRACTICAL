
    import java.util.Scanner;
    public class p3 {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the distance in meters: ");
        double distanceInMeters = scanner.nextDouble();

        System.out.print("Enter the time taken in hours: ");
        int hours = scanner.nextInt();

        System.out.print("Enter the time taken in minutes: ");
        int minutes = scanner.nextInt();

        System.out.print("Enter the time taken in seconds: ");
        int seconds = scanner.nextInt();

        int totalTimeInSeconds = hours * 3600 + minutes * 60 + seconds;
        double speedInMetersPerSecond = distanceInMeters / totalTimeInSeconds;
        double speedInKilometersPerHour = speedInMetersPerSecond * 3.6;
        double speedInMilesPerHour = speedInMetersPerSecond * 3.6 / 1609;

        System.out.printf("Speed in meters per second: %.2f m/s%n", speedInMetersPerSecond);
        System.out.printf("Speed in kilometers per hour: %.2f km/h%n", speedInKilometersPerHour);
        System.out.printf("Speed in miles per hour: %.2f mph%n", speedInMilesPerHour);
     }
}
    

