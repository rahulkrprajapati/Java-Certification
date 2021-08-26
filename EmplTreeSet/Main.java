package EmplTreeSet;

import java.util.TreeSet;
import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        TreeSet<Empl> nameComp = new TreeSet<>(new MyNameComp());
        TreeSet<Empl> salComp = new TreeSet<>(new MySalaryComp());

        for (int i = 0; i < n; i++) {
            String sal = sc.nextLine();
            int name = Integer.parseInt(sc.nextLine());
            nameComp.add(new Empl(sal, name));
            salComp.add(new Empl(sal, name));
        }
        System.out.println("After sorting the employee names:");
        for(Empl e: nameComp){
            System.out.println(e);
        }

        System.out.println("After sorting the salary:");
        for(Empl e: salComp){
            System.out.println(e);
        }

    }
}
