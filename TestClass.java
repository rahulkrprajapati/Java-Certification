import java.util.Scanner;

//PayPal

class TestClass {
    public int minSubArrayLen(int target, int[] nums) {
    
      int s =0 ;
      int e =0 ;
       int sum = 0 ; 
        int count = Integer.MAX_VALUE;
       while(e<nums.length) {
         sum = sum + nums[e]  ;
          
           
         if (sum > target){
            while(sum>target) {
                int c = e-s +1;
               count = Math.min(c,count);
                sum = sum - nums[s];
                    s++ ;
               
            } 
             
             
         }
           
           if (sum == target){
               int c = e-s +1;
               count = Math.min(c,count);
           }
           
           e++ ;
           
           
       }
        if (count==Integer.MAX_VALUE){
            return 0 ;
        }
        return count ;
        
         }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            int size = 0;
            size = sc.nextInt();
            int nums[] = new int[size];
            for(int i = 0; i < size; i++){
                nums[i] = sc.nextInt();

            }
            int target = sc.nextInt();
            System.out.println(new TestClass().minSubArrayLen(target, nums));
        }
    }