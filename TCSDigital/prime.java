package TCSDigital;
import java.util.*;
public class prime {
    public int returnPrimeDivisors(int n){
        TreeSet<Integer> factors = new TreeSet<>();
        while(n%2==0){
            factors.add(2);
            break;
        }
        for(int i=3; i<=Math.sqrt(n); i+=2){
            while(n%i==0){
                factors.add(i);
                n /= i;
            }
        }
        if(n>2){
            factors.add(n);
        }
        // System.out.println("Printing Factors of " + n + " :" + factors.size());
        return factors.size();
    }
    public int Solution(int N, String Arr[], int K){
        // System.out.println("Called Solution");
        int count = 0;
        for (String i : Arr) {
            if(returnPrimeDivisors(Integer.parseInt(i)) == K){
                count += 1;
                // System.out.println("Printing COunt" + count);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String Arr[] = sc.nextLine().split(" ");
        int K = Integer.parseInt(sc.nextLine());
        prime obj = new prime();
        int ans = obj.Solution(N, Arr, K);
        System.out.println(ans);
    }
}
