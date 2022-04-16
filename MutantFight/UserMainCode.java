package MutantFight;
import java.io.*;
import java.util.*;


public class UserMainCode {
    public int[] resultMatrix(int input1,int[][] input2){
        // ArrayList<Integer> count = new ArrayList<>();
        int[] count = new int[input2.length];
        int pos = 0;
        int max = 0;
        for(int row=0; row<input2.length; row++){
            for(int column=0; column<input2[row].length;column++){
                if(input2[row][column]==1){
                    count[row] += 1;
                }
                if(count[row]>max){
                   pos = row; 
                   max = count[row];
                }
            }
        }
        // System.out.print(count);
        int[] results = new int[count.length];
        for(int i=0; i<count.length;i++){
            if(count[i]==max){
                results[i] = 1;
            }
            else{
                results[i] = 0;
            }
        }
        return results;
    }
    public static void main(String[] args) {
        UserMainCode obj = new UserMainCode();
        int[][] arr = {{0,1,1,0},{0,0,2,0},{0,2,0,0},{1,1,1,0}};
        int[] results = obj.resultMatrix(4, arr);
        for (int i : results) {
            System.out.println(i);
        }
    }    
}
