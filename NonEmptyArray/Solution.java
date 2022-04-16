package NonEmptyArray;

import java.util.Arrays;
public class Solution {
    public int solution(int[] A) {
        int N = A.length;
        int result = 0;
        // for (int i = 0; i < A.length; i++) {
        //     for (int j = 0; j < A.length; j++) {
        //         if(A[i] == A[j])
        //             result = Math.max(result, Math.abs(i-j));
        //     }
        // }
        // return result;
        int hash[] = new int[A.length];
        return Arrays.stream(A).reduce(0, (m, v, i) -> Math.max(m, i - (hash[v] = Arrays.asList(hash).contains(v) ? hash[v] : i)));
    }
    public static void main(String[] args) {
        int[] arr = { 4, 6, 2, 2, 6, 6, 1 };
        System.out.println(new Solution().solution(arr));
    }
}
