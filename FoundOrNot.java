import java.util.*;
import java.util.Collection;
public class FoundOrNot {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for(int i=0; i<size; i++){
            arr.add(sc.nextInt());
        }
        int search = sc.nextInt();
        ArrayList<Integer> brr = new ArrayList<>();

        String s = "Not found";
        for(int i: arr){
            brr.add(i);
            if(i == search){
                s = "Found";
            }
        }
        
        if(s.equals("Not found")){
            brr.add(search);
            Collections.sort(brr);
            int index = brr.indexOf(search) + 1;
            System.out.println(s +", added at position:" + index);
            System.out.println(brr);
        }
        else{
            Collections.sort(arr);
            int index = arr.indexOf(search) + 1;
            System.out.println(s+" at position:" + index);
            System.out.println(arr);
        }
        
        

    }
}
