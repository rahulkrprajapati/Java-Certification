package PandaClasses;

import java.util.*;
public class SearchHash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        HashSet<String> unique = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            unique.add(s);
        }
        String search = sc.nextLine();
        if(unique.contains(search)){
            System.out.println(search + " is in the hash set.");
        }
        else{
            System.out.println(search + " is not in the hash set.");
        }
    }
    
}
