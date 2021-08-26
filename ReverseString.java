import java.util.Scanner;
import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> arr = new ArrayList<>();
        List<String> brr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextLine());
        }

        for(String i: arr){
            String reverse = "";
            for(int j=0; j<i.length(); j++){
                reverse = i.charAt(j) + reverse;
            }
            brr.add(reverse);
        }
        for(String i: brr){
            System.out.println(i);
        }
    }    
}
