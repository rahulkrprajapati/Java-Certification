import java.util.*;

interface StringConcat {
    String concat(String s, String w);
}
public class LambdaConcat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String u = sc.nextLine();
        String v = sc.nextLine();
        StringConcat d = (s, w) -> {
            return (s + " " + w); 
        };
        System.out.println(d.concat(u, v));
    }
}
