import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SortByLen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<String> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextLine());
        }
        arr.sort((first, second) -> Integer.compare(first.length(), second.length()));
        System.out.println(arr);
    }    
}
