import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;
class Solution {
    public static void main(String args[]){
        int[] values = {111, 600, 4, 3, 5,3,6,7,8,600,2,9,4,10,10,111};
        for(int i = 0; i < values.length; i++) {  
            for(int j = i + 1; j < values.length; j++) {  
                if(values[i] == values[j])  
                    System.out.println(values[j]);  
            }  
        }  

    }
    
}
