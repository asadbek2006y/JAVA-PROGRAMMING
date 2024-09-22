import java.util.Scanner;

public class addDigitsinanumber {

    public static void main(String[] args) {
        int number;
        System.out.println("Enter the of to find sum of digits: ");
        Scanner sc = new Scanner(System.in);

        number = sc.nextInt();
        int sum = 0;
        while(number > 0){
            int lastDigit = number % 10;
            number = number / 10;
            sum = sum + lastDigit;
        }
        System.out.println("Sum of all digits is : " + sum);
    }
}