package OTTService;
import java.util.*;
//ye 
public class Main {
    ArrayList<Ott> streamingList = new ArrayList<>();
    Main(){
        streamingList.add(new Ott("Netflix", 10, 10));
        streamingList.add(new Ott("AmazonPrime", 2, 5));
        streamingList.add(new Ott("Hotstar", 1, 5));
    }
    
    int calculatePrice(TreeMap<String, Integer> input){
        //iterating through the input TreeMap
        int calculatedPrice = 0;

        for (Map.Entry<String, Integer> entry : input.entrySet()) {
            String key = entry.getKey();
            int watchHr = entry.getValue();
            int minimumHr = 0;
            int priceOfUnit = 0;
            for (Ott saved : streamingList) {
                if(saved.getName().equals(key)){
                    priceOfUnit = saved.getPricePerUnit();
                    minimumHr = saved.getUnitInHours();
                }
            }
            
            if(watchHr % minimumHr == 0)
                calculatedPrice = calculatedPrice + (watchHr/minimumHr)*priceOfUnit;
            else{
                System.out.println(key + " allows viewing hours in multiple of " + minimumHr + " only");
                return 0;
            }
        }
        
        return calculatedPrice;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<String, Integer> input = new TreeMap<>();
        System.out.println("Viewing hours for Netflix:");
        int nHour = Integer.parseInt(sc.nextLine());
        System.out.println("Viewing hours for Amazon Prime:");
        int pHour = Integer.parseInt(sc.nextLine());
        System.out.println("Viewing hours for Hotstar:");
        int hHour = Integer.parseInt(sc.nextLine());
        input.put("Netflix", nHour);
        input.put("AmazonPrime", pHour);
        input.put("Hotstar", hHour);
         
        Main obj = new Main();
        if (obj.calculatePrice(input) != 0) 
            System.out.println("Total amount should be paid: Rs. " + obj.calculatePrice(input));
        sc.close();
    }
}
