package Arrays;
class A30{
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int[] temp = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean duplicate = false;
            for (int k = 0; k < j; k++) {
                if (arr[i] == temp[k]) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                temp[j++] = arr[i];
            }
        }
        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
