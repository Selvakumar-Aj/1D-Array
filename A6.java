package Arrays;
import java.util.Scanner;

public class A6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int count = 0;

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 != 0) {
                count++;
            }
        }

        System.out.println("Number of odd elements = " + count);
    }
}