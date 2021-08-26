package PandaClasses;
import java.util.*;
public class NumberManipMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        try{
            if(s.length() != 9){
                throw new InvalidInputException("ISBN must be exactly 9 digits");
            }
            else{
                NumberManipulation obj = new NumberManipulation();
                int n = obj.findLastDigit(s) % 11;
                if( n == 10){
                    s = s + "X";
                }
                else{
                    s = s + n;
                }
                System.out.println("ISBN : " + s);
            }
        }
        catch(InvalidInputException e){
            System.out.println(e);
        }
    }
}
