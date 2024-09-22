import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;  // Corrected the exception

public class findsumofFirstnNumbers {
    public static void main(String[] arguments) throws NumberFormatException, IOException {
        int n;
        System.out.println("Enter n value: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        n = Integer.parseInt(br.readLine()); // Parse input value

        // Code to calculate the sum of first n numbers
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("The sum of the first " + n + " numbers is: " + sum);
    }
}
