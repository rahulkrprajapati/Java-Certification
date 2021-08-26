import java.util.*;
public class LexicalCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        a = a.toLowerCase();
        b = b.toLowerCase();
        if(a.compareTo(b) > 0)
            System.out.println(8);
        else if(a.compareTo(b) == 0)
            System.out.println(0);
        else
            System.out.println(-3);
    }
}
