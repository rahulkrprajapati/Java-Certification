import java.util.*;
public class Card{
    public static void main(String[] args) {
        Set<String> arr = new HashSet<String>();
        Set<String> unique = new HashSet<String>();
        Scanner sc = new Scanner(System.in);
        String card, symbol, number;
        int count = 0;

        while(true){
            symbol = sc.nextLine();
            number = sc.nextLine();
            symbol = symbol.trim();
            number = number.trim();
            card = symbol + " " + number;
            count += 1;
            if(arr.add(symbol)){
                unique.add(card);
            }
            
            if(unique.size() == 4){
                break;
            }
            
        }
        System.out.println("Four symbols gathered in "+ count + " cards");
        System.out.println("Cards in Set are:");
        for (String s : unique) {
            System.out.println(s);
            
        }
              
    }
}