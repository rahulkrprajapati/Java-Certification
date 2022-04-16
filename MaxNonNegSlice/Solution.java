package MaxNonNegSlice;

public class Solution {

    public int solution(int[] A){
        int l = A.length;
        int sum = 0, i = 0;
        int max = -1;
        while (i < l) {
            while (i < l && A[i] < 0) {
                i++;
                continue;
            }
            while (i < l && 0 <= A[i]) {
 
                sum += A[i++];
                max = Math.max(max, sum);
            }
            sum = 0;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = { -1, 2, 1, 2, 0, 2, 1, -3, 4, 3, 0, -1 };
        System.out.println(new Solution().solution(arr));
    }
}
