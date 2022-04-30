package WiproReduceDishes;

import java.util.*;
import java.lang.*;
import java.io.*;

public class UserMainCode {
    public int reduce(int input1, int[] input2) {
        //Solution 1
        // int total = 0,res = 0;
        // Arrays.sort(input2);
        // for(int i = input2.length-1;i >= 0 && input2[i] > -total;i--){
        // total += input2[i];
        // res += total;
        // }
        // return res;

        // Solution 2
        // Arrays.sort(input2);
        // int max = Integer.MIN_VALUE;
        // for (int i = 0; i < input2.length; i++) {
        //     int count = 1;
        //     int sum = 0;
        //     for (int j = i; j < input2.length; j++) {
        //         sum += (input2[j] * count);
        //         count++;
        //     }
        //     if (sum > max)
        //         max = sum;
        // }

        // if (max >= 0)
        //     return max;
        // return 0;

        //Solution 3
        Arrays.sort(input2);
        
        int currentSum = 0;
        int maxSum = 0;
        int increment = 0;
        int i = input2.length - 1;
        
        while (i >= 0) {
            increment += input2[i];
            currentSum += increment;
            maxSum = Math.max(currentSum, maxSum);
            --i;
        }
        
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = { -1, -9, 0, 5, -7 };
        UserMainCode obj = new UserMainCode();
        System.out.println(obj.reduce(3, arr));
    }
}
