package Arrays;

class A19 {
    public static void main(String[] args) {
        int[] arr = {4, 9, 2, 7, 5};
        int min = arr[0];

        for (int x : arr) {
            if (x < min) min = x;
        }

        System.out.println("Minimum = " + min);
    }
}
