package Arrays;
class A46 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 1, 0, 0};
        int maxLen = 0;
        for (int i = 0; i < arr.length; i++) {
            int zeros = 0, ones = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] == 0) zeros++;
                else ones++;
                if (zeros == ones) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        System.out.println("Maximum Length = " + maxLen);
    }
}
