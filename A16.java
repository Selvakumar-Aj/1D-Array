package Arrays;
class A16 {
    public static void main(String[] args) {
        int[] arr = {9, 7, 5, 3, 1};
        boolean sorted = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                sorted = false;
                break;
            }
        }
        System.out.println(sorted ? "Sorted Descending" : "Not Sorted Descending");
    }
}
