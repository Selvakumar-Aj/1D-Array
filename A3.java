package Arrays;
import java.util.Scanner;

public class A3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int runningSum = 0;

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Running sum:");
        for (int i = 0; i < n; i++) {
            runningSum += arr[i];
            System.out.print(runningSum + " ");
        }
    }
}
