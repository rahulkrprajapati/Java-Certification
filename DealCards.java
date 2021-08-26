import java.util.*;
public class DealCards {

    public String returnRandom(ArrayList<String> a, int r){
        return a.get(r);
    }

    public static void main(String[] args) {
        ArrayList<String> suit = new ArrayList<String>();
        ArrayList<String> n = new ArrayList<String>();
        String arr[] = {"Spades", "Hearts", "Diamonds", "Clubs"};
        for (String s : arr) {
            suit.add(s);
        }
        String num[] = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        
        for(String s: num){
            n.add(s);
        }

        Scanner sc = new Scanner(System.in);
        Random rand = new Random(0);
        int hands = sc.nextInt();
        int cards = sc.nextInt();
        String s, d, f;
        DealCards obj = new DealCards();
        for(int i=0; i<hands; i++){
            ArrayList<String> result = new ArrayList<String>();
            for(int j=0; j<cards; j++){
                s = obj.returnRandom(suit, rand.nextInt(suit.size()));
                d = obj.returnRandom(n, rand.nextInt(n.size()));
                f = d + " of " + s;
                result.add(f);
                
            }
            System.out.println(result);
        }
    }
}
