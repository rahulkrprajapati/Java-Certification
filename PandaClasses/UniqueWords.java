package PandaClasses;

//import java.util.Arrays;
//import java.util.HashSet;
import java.util.*;
public class UniqueWords {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s[] = (sc.nextLine()).split(" ");
        HashSet<String> unique = new HashSet<>(Arrays.asList(s));

        System.out.println(unique.size());
    }
}
