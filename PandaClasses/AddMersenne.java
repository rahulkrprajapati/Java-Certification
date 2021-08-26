package PandaClasses;
import java.util.*;
public class AddMersenne {
    static int returnMersenne(int n){
        int n1 = n + 1;

        int power = 0;
        int ans = 0;
        for(int i=0;;i++)
        {
            power=(int)Math.pow(2,i);
            if(power>n1)
            {
                break;
            }
            else if(power==n1)
            {
               ans=1;
            }
        }
        if(ans==0)
        {
        return 0;
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String s[] = (sc.nextLine()).split(" ");
        int sum = 0;

        for (String i : s) {
           sum += returnMersenne(Integer.parseInt(i)); 
        }
        System.out.println(sum);
    }
}
