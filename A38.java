package Arrays;
class A38 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5};
        int sum = 33;

        for (int i = 0; i < arr.length; i++) {
            int currSum = 0;
            for (int j = i; j < arr.length; j++) {
                currSum += arr[j];
                if (currSum == sum) {
                    System.out.println("Subarray from " + i + " to " + j);
                    return;
                }
            }
        }
        System.out.println("No subarray found");
    }
}
