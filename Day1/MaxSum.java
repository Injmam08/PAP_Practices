class MaxSum {
    public static void main(String[] args) {
        int arr[] = { 100,200,300,400 };
        int k = 2;
        int n = arr.length;
        int max_sum = Integer.MIN_VALUE;

        for (int i = 0; i <= n - k; i++) {
            int current_sum = 0;
            for (int j = 0; j < k; j++) {
                current_sum += arr[i + j];
            }
            max_sum = Math.max(current_sum, max_sum);
        }

        System.out.println(max_sum);
    }
}