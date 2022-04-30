package WiproReduceDishes;
import java.util.*;
import java.lang.*;
import java.io.*;

public class UserMainCode {
    public int reduce(int input1, int[] input2) {
        int total = 0,res = 0;
        Arrays.sort(input2);
        for(int i = input2.length-1;i >= 0 && input2[i] > -total;i--){
            total += input2[i];
            res += total;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {-1,3,4};
        UserMainCode obj = new UserMainCode();
        System.out.println(obj.reduce(3, arr));
    }
}
