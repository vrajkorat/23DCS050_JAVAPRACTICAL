import java.util.Scanner;

public class p7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scanner.nextLine();
        System.out.println("Enter a number:");
        int n = scanner.nextInt();
         p7 main = new p7();
        System.out.println(main.frontTimes(str, n));
    }

    public String frontTimes(String str, int n) {
        String front = str.substring(0, Math.min(3, str.length()));
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(front);
        }
        return result.toString();
    }
}