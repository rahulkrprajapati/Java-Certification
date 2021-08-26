import java.util.*;
public class ListOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String s = sc.nextLine();
        String[] brr = s.split(" ");
        String se = sc.nextLine();
        String de = sc.nextLine();
        List<String> list = new ArrayList<String>();
        for(String i: brr){
            list.add(i);
        }
        System.out.println("The List of Elements");
        System.out.println(list);
        for(String i: list){
            if(i.equals(se))
                System.out.println(i+" is found in the list");
        }
        list.remove(de);
        System.out.println("The List of Elements after deleting "+de);
        System.out.println(list);
    }
}
