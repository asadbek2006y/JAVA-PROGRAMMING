import java.util.Scanner;

public class avarageofnumbers {

    public static void main(String[] args) {
        int count;
        System.out.println("Enter count of numbers :");
        Scanner sc = new Scanner(System.in);
        count = sc.nextInt();
        int number, sum = 0;
        float avarage = 0;
        for(int i=0; i<count; i++){
            number = sc.nextInt();
            sum = sum + number;
        }
        avarage = sum / count;
        System.out.println("Sum of entered numbers: " + sum);
        System.out.println("Avarage of entered numbers: " + avarage);
    }
}