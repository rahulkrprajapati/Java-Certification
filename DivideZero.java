import java.util.*;
public class DivideZero {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            String a = sc.nextLine();
            String[] brr = a.split(" ");
            System.out.println(Integer.parseInt(brr[0])/ Integer.parseInt(brr[1]));
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
