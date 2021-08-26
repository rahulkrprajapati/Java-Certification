package PandaClasses;

import java.util.*;
public class CardActions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        TreeMap<String, List<Integer>> tm = new TreeMap<String, List<Integer>>();
        String unique = "";
        for(int i=0; i<n; i++){
            String sym = sc.nextLine();
            int num = Integer.parseInt(sc.nextLine());
            
            List<Integer> temp = new ArrayList<Integer>();
            if(tm.get(sym) != null){
                //System.out.println(tm.get(sym));
                for(int a: tm.get(sym)){
                    temp.add(a);
                }
                temp.add(num);
                tm.put(sym, temp);
            }
            else{
                temp.add(num);
                tm.put(sym, temp);
                //unique += sym + " ";
            }
            
        }
        for (Map.Entry<String, List<Integer>> entry: tm.entrySet()){
            unique += entry.getKey() + " ";
        }
        unique = unique.trim();
        System.out.println("Distinct symbols are:");
        System.out.println(unique);
        for (Map.Entry<String, List<Integer>> entry: tm.entrySet()) {
            System.out.println("Cards in "+ entry.getKey()+" Symbol:");
            int sum = 0;
            for(int val: entry.getValue()){
                System.out.println(entry.getKey()+ " " + val);
                sum += val;
            }
            System.out.println("Number of Cards: "+ (entry.getValue()).size());
            System.out.println("Sum of Numbers: "+ sum);
            
        }
    }
}
