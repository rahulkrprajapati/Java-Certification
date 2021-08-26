package PandaClasses;

import java.util.*;
public class ArrayListObjectsMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<ItemType> arr = new ArrayList<ItemType>();
        for(int i=0; i<n; i++){
            String item = sc.nextLine();
            double deposit = Double.parseDouble(sc.nextLine());
            double cost = Double.parseDouble(sc.nextLine());
            ItemType obj = new ItemType(item, deposit, cost);
            arr.add(obj);
        }
        System.out.println(String.format("%-20s%-20s%-20s", "Name", "Deposit", "Cost"));
        for(ItemType obj: arr){
            System.out.println(String.format("%-20s%-20s%-20s", obj.getName(), obj.getDeposit(), obj.getCost()));

        }

    }
}
