import java.util.regex.*;
import java.util.*;
import java.util.ArrayList;

class IndentifyWords {
    String getPossibleWords(String s1, String s2){
        String pattern = s1;
        String sentence = s2;
        Pattern p = Pattern.compile(pattern);
        Matcher matcher = p.matcher(sentence);
        String output = "";
        while(matcher.find()){
            // System.out.println(matcher.group());
            output += matcher.group()+":";
        }
        String[] strWords = output.split(":");
        LinkedHashSet<String> lhSetWords = new LinkedHashSet<String>( Arrays.asList(strWords) );
        output = String.join(":", lhSetWords);
        if(output.length() > 0 ){
            output = "Code_Error";
        } 
        return output;
    }
}
class Sherlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pattern = sc.nextLine().toUpperCase();
        pattern = pattern.replace('_', '.');
        String sentence = sc.nextLine().toUpperCase();
        IndentifyWords obj = new IndentifyWords();
        System.out.println(obj.getPossibleWords(pattern, sentence));

    }  
}
