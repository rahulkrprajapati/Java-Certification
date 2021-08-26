import java.util.*;
import java.util.Collection;
public class CountNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> arr = new ArrayList<String>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0; i<n; i++){
            arr.add(sc.nextLine());
        }
        String search = sc.nextLine();
        System.out.println(Collections.frequency(arr, search));
    }
}
