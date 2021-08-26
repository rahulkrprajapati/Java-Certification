package ExamlyHeadaches;
import java.util.*;
public class CardGame {

	public static class Card implements Comparable{
	
		char symbol;
		int number;
		
		public Card(char symbol, int number) {
			this.symbol=symbol;
			this.number = number;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
		        return true;
		    if (obj == null || getClass() != obj.getClass())
		        return false;
		    
		    Card other = (Card) obj;
		    
		    return this.symbol == other.symbol;
		}
		
		@Override
		public int hashCode() {
			return (int)this.symbol;
		}

		@Override
		public int compareTo(Object o) {

			return this.symbol-((Card)o).symbol;
		}
		
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HashSet<Card> cards= new HashSet<>();
		int noOfCards= 0;
		while(true) {
			noOfCards++;
			char sym = sc.next().charAt(0);;
			int num = sc.nextInt();
			
			cards.add(new Card(sym,num));
			
			if(cards.size()==4) {
				break;
			}
		}
		
		System.out.println("Four symbols gathered in "+ noOfCards + " cards");
        System.out.println("Cards in Set are:");

        ArrayList<Card> cardAL = new ArrayList<>();
        
		for(Card c: cards) {
			cardAL.add(c);
		}
		
		Collections.sort(cardAL);
		
		for(Card c: cardAL) {
			
			System.out.println(c.symbol + " " + c.number);
		}
	}

}