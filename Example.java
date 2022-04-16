import java.util.*;

class Example {

    static int maximumSum(int[] arr, int M, int K) {
        int N = arr.length;
        int[] prefixSum = new int[N + 1];

        for (int i = 1; i <= N; ++i) {
            prefixSum[i] = prefixSum[i - 1]
                    + arr[i - 1];
        }

        Vector<Integer> subarraysSum = new Vector<Integer>();

        for (int i = K; i <= N; i++) {
            subarraysSum.add(
                    prefixSum[i]
                            - prefixSum[i - K]);
        }

        Collections.sort(subarraysSum, Collections.reverseOrder());

        int sum = 0;

        for (int i = 0; i < M; ++i) {
            sum += subarraysSum.get(i);
        }
        return sum;
    }

    // Driver Code
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int M = 1, K = 1;
        System.out.println(maximumSum(arr, M, K));
        M = 2;
        K = 1;
        System.out.println(maximumSum(arr, M, K));
        M = 3;
        K = 1;
        System.out.println(maximumSum(arr, M, K));
    }
}