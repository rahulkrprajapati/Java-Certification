import java.util.*;
public class SwapInwards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int n = Integer.parseInt(a);
        String s = sc.nextLine();
        String[] brr = s.split(" ");
        List<String> list = new ArrayList<String>();
        for(String i: brr){
            list.add(i);
        }
        String temp = "";
        for(int i=0; i<n/2; i++){
            temp = list.get(i);
            list.set(i, list.get(n-i-1));
            list.set(n-i-1, temp);
            System.out.println(list);

        }
    }
}
