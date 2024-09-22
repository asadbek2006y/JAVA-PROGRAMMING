import java.util.Scanner;

public class sumandavarageofarray {

    public static void main(String[] args) {
        int[] array = {11,12,13,14,15};
        int length = array.length;
        int sum = 0;
        for(int i=0;i<length;i++){
            sum = sum + array[i];
        }
        System.out.println("Sum of elements of array : " + sum);
        float avarage = (float) sum /length;
        System.out.println("Avarage of elemnts of array : "  + avarage);
    }
}