/**
 * AgeReg
 */
import java.util.Scanner;
import java.util.regex.*;

public class AgeReg {

    static String editString(String str, int n, boolean invert){
        //defining base variables
        String editedString = "";
        StringBuilder newString = new StringBuilder();
        newString.append(str);
        //logic for pattern recognition
        // Pattern digitPattern = Pattern.compile("\\d[+-]?[0-9]+");
        Pattern digitPattern = Pattern.compile("[+-]?\\d+");
        Matcher matcher = digitPattern.matcher(str);
        
        //matching required pattern
        while(matcher.find()){
            String temp = matcher.group();
            int num = Integer.parseInt(temp);
            num = num>0 ? (num + n): (num - n);
            System.out.println("num: " + num);
            editedString = Integer.toString(num);
            if(invert){
                // System.out.println("Executing Invert block");
                StringBuilder build = new StringBuilder();
                if(temp.contains("-")){
                    build.append(Integer.toString(num));
                    build.reverse().deleteCharAt(temp.length()-1);
                    // System.out.println(n);
                }
                else{
                    build.append(Integer.toString(num));
                    build.reverse();
                    // n = Integer.parseInt(build.toString());
                    // System.out.println(n);
                    System.out.println("build" + build);
                }
                editedString = build.toString();
                // System.out.println(editedString);
                // newString = newString.replace(matcher.start(), matcher.end(), editedString);
            }
            newString = newString.replace(matcher.start(), matcher.end(), editedString);
            // newString = newString.replaceAll(temp+"$", n>0 ? Integer.toString(n + num): "-"+ Integer.toString(Math.abs(n) + num));
            // System.out.println(matcher.start()+  " to " + matcher.end());
        }
        System.out.println(newString);
        return newString.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int num = Integer.parseInt(sc.nextLine());
        Boolean invert = sc.nextBoolean();
        // System.out.println(invert);
        System.out.println(editString(str, num,invert));

    }
}