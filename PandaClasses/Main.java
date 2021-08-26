package PandaClasses;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer, Integer> tm = new TreeMap<Integer, Integer>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0; i<n; i++){
            String s = sc.nextLine();
            String arr[] = s.split(" ");
            tm.put(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));
        }

        System.out.println(tm);
    }
}
