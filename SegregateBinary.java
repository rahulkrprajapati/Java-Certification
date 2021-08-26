import java.util.*;
public class SegregateBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String s = sc.nextLine();
        String[] brr = s.split(" ");
        int count_zero = 0;
        int count_one = 0;
        for(String p: brr){
            if(p.equals("0")){
                count_zero += 1;
            }
            else if(p.equals("1")){
                count_one += 1;
            }
            else if(!p.equals("0") || !p.equals("1")){
                System.out.println("Invalid Input");
                System.exit(0);
            }
        }
        String result = "";
        String zeros = "";
        String ones = "";
        for (String p : brr) {
            if(count_one != 0){
                ones = "1 "+ ones;
                count_one -= 1;
            }
            else if(count_zero != 0){
                zeros =   "0 "+ zeros;
                count_zero -= 1;
            }
        }
        result = zeros + ones;
        result = result.trim();
        System.out.println(result);
    }
}
