import java.util.*;
class Fair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);
        int ma = Math.max(a, b);
        int mi = Math.min(a,b);
        System.out.println(ma - c - mi);
    }
}
