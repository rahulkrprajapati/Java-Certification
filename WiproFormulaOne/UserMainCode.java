package WiproFormulaOne;

import java.util.*;
import java.lang.*;
import java.io.*;

public class UserMainCode {
    static class pair {
        int first;
        char second;

        pair(int first, char second) {
            this.first = first;
            this.second = second;
        }
    }

    public int maxRacers(int input1, int[][] input2) {

        int ans = 0;
        int count = 0;
        ArrayList<pair> data = new ArrayList<>();

        for (int i = 0; i < input2.length; i++) {

            data.add(new pair(input2[i][0], 'x'));

            data.add(new pair(input2[i][1], 'y'));
        }

        Collections.sort(data, (a, b) -> a.first - b.first);

        for (int i = 0; i < data.size(); i++) {

            if (data.get(i).second == 'x')
                count++;

            if (data.get(i).second == 'y')
                count--;

            ans = Math.max(ans, count);
        }

        return ans;
    }

    public static void main(String[] args) {
        int [][] arr = {{1,3},{2,5},{2,4},{3,5}};
        int [][] brr = {{1,7},{2,4},{6,9},{3,8},{5,10}};
        int [][] crr = {{1,7},{2,4},{6,9},{3,8},{5,10}};
        UserMainCode obj = new UserMainCode();
        System.out.println(obj.maxRacers(4,brr));
    }
}
