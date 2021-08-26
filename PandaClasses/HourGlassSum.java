package PandaClasses;

import java.util.*;
public class HourGlassSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[6][6];

        for(int i = 0; i<6; i++){
            String s[] = (sc.nextLine()).split(" ");
            for(int j = 0; j<6; j++){
                array[i][j] = Integer.parseInt(s[j]);
            }
        }
        
        boolean isFirst = true;
        int maximumHourglass = 0;
        
        for (int i = 0; i != 4; i++)
        {
            for (int j = 0; j != 4; j++)
            {
                int currentHourglass =
                    array[i][j] + array[i][j+1] + array[i][j+2] 
                    + array[i+1][j+1] 
                    + array[i+2][j] + array[i+2][j+1] + array[i+2][j+2];
                
                if (isFirst || currentHourglass > maximumHourglass)
                {
                    isFirst = false;
                    maximumHourglass = currentHourglass;
                }
            }
        }
        
        System.out.println(maximumHourglass);
    }
    
}
