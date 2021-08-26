package PandaItemType;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class ArrayListObjectMain {
    public static void main(String[] args) {
        List<ItemType> li = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            String name = sc.next();
            double deposit = sc.nextInt();
            double costPerDay = sc.nextDouble();
            li.add(new ItemType(name, deposit, costPerDay));
        }
        String s = String.format("%-20s%-20s%-20s", "Name", "Deposit", "costPerDay");
        System.out.println(s);
        for (ItemType itemType : li) {
            System.out.println(itemType);
            
        }
    }
}
