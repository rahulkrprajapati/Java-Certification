package ExamlyHeadaches;

import java.util.*;
public class DistinctCard {

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

		HashMap<Character, ArrayList> cardsMap = new HashMap<>();
		
		Scanner sc = new Scanner(System.in);
		
		int noOfCards= sc.nextInt();
		while(noOfCards-->0) {
			char sym = sc.next().charAt(0);;
			int num = sc.nextInt();
			
			if(cardsMap.containsKey(sym)) {
				ArrayList<Card> al = cardsMap.get(sym);
				al.add(new Card(sym,num));
				cardsMap.put(sym, al);
			}else {
				ArrayList<Card> al = new ArrayList<>();
				al.add(new Card(sym,num));
				cardsMap.put(sym, al);
			}
			
		}
		
		System.out.println("Distinct Symbols are:");
		

        ArrayList<Character> cardDistKeys = new ArrayList<>(cardsMap.keySet());
		Collections.sort(cardDistKeys);
		
		for(Character c: cardDistKeys) {
		
			System.out.print(c + " ");
		}
		System.out.println();
		
		for(Character c: cardDistKeys) {
			
			int sum =0;
			System.out.println("Cards in " + c + " Symbol:");
			
			ArrayList<Card> al = cardsMap.get(c);
			
			for(Card card: al) {
				System.out.println(card.symbol + " " + card.number);
				sum+=card.number;
			}
			
			System.out.println("Number of Cards: " + al.size()) ;
			System.out.println("Sum of Numbers: " + sum);
			
		}		

	}	

}