package PandaClasses;

import java.util.Scanner;

public class MyCalculator {
    static long power(int n, int p) throws Exception{
        if( n < 0 || p < 0){
            throw new Exception("n and p should be non-negative");
        }
        else if( n == 0 && p == 0){
            throw new Exception("n and p should not be zero");
        }
        long ans = 1;
        for (int i = 0; i < p; i++) {
            ans *= n;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        try{
            System.out.println(power(n,p));
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
}
