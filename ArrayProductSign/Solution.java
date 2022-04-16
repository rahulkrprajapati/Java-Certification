package ArrayProductSign;

import java.util.Arrays;

public class Solution {
    public int solution(int[] A){
        return Arrays.stream(A).reduce(1,(i1,i2)->Integer.signum(i1)*Integer.signum(i2));
    }

    public static void main(String[] args) {
        int[] arr = { 1, -2, -3, 5 };
        System.out.println(new Solution().solution(arr));
    }
}
