package WiproMaxRacer;
import java.io.*;
import java.util.*;

public class UserMainCode {
    public int maxRacers(int input1, int[][] input2){
         
         Arrays.sort(input2,(a,b)->Integer.compare(a[0],b[0]));
        
         
         PriorityQueue<Integer> pq = new PriorityQueue<>();
         
         int i=0,res=0,n=input2.length;
         
         
         for(int d=1;d<=(int)(1e5);d++){
         
            
             while(!pq.isEmpty()&&pq.peek()<d)
                 pq.poll();
             
             
             while(i<n && input2[i][0]==d)
                 pq.offer(input2[i++][1]);
             
             
             if(!pq.isEmpty()){
                 pq.poll();
                 res++;
             }                        
         }
         
         return res-1;
          
    }

    public static void main(String[] args) {
        int [][] arr = {{1,3},{2,5},{2,4},{3,5}};
        int [][] brr = {{1,7},{2,4},{6,9},{3,8},{5,10}};
        int [][] crr = {{1,7},{2,4},{6,9},{3,8},{5,10}};
        UserMainCode obj = new UserMainCode();
        System.out.println(obj.maxRacers(4,arr));
    }  

}
  
