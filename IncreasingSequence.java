import java.util.*;
import java.util.Collection;
public class IncreasingSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<Integer>();
        //List<Integer> brr = new ArrayList<Integer>();
        int n = sc.nextInt();
        boolean max = true;
        for(int i=0; i<n; i++){
            int input = sc.nextInt();
            max = true;
            if(arr.size() != 0){
                for (Integer j : arr) {
                    if(j > input)
                        max = false;
                }

                if(max != false)
                    arr.add(input);
            }
            else{
                arr.add(input);
            }
        }
        System.out.println(arr);

    }
}
