package Arrays;
class A27 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 5, 3};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("First Repeated = " + arr[i]);
                    return;
                }
            }
        }
        System.out.println("No repeated element");
    }
}
