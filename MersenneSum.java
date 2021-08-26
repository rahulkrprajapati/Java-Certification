import java.util.Scanner;

public class MersenneSum {
    boolean checkMersenne(int n){
        int n1 = n + 1;
        int power = 0;
        int ans = 0;
        boolean flag = false;
        for(int i=0;;i++)
        {
            power=(int)Math.pow(2,i);
            if(power>n1)
            {
                break;
            }
            else if(power==n1)
            {
               flag = true;
               ans=1;
            }
        }
        if(ans==0)
        {
         flag = false;
        }
         return flag; 
    }
    int addMersenne(String arr[]){
        int sum = 0;
        for (String value: arr){
            sum += Integer.parseInt(value);
        }
        return sum;
    }

    public static void main(String[] args) {
        MersenneSum obj = new MersenneSum();
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String s = sc.nextLine();
        String[] brr = s.split(" ");
        for(int i =0; i<brr.length; i++){
            if(obj.checkMersenne(Integer.parseInt(brr[i])) == false){
                brr[i] = "0";
            }
        }
        int sum = obj.addMersenne(brr);
        System.out.println(sum);
    }
}
