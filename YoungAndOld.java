import java.util.*;
public class YoungAndOld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        if(Integer.parseInt(a) < 0){
            System.out.println("Invalid Input");
            System.exit(0);
        }
        String s = sc.nextLine();
        String[] brr = s.split(" ");
        int max = Integer.parseInt(brr[0]);
        int min = Integer.parseInt(brr[brr.length-1]);
        boolean negative = false;
        for(String each: brr){
            if(Integer.parseInt(each) > max)
                max = Integer.parseInt(each);
            if(Integer.parseInt(each) < min)
                min = Integer.parseInt(each);
            if(Integer.parseInt(each) < 0)
                negative = true;
        }
        if(negative != true)
            System.out.println(min+" "+ max);
        else
            System.out.println("Invalid Input");
    }
}
