import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;
/** This question asks us to calculate the viewing price as per the customized OTT plans
 * Each streaming service has a price per unit also a Unit in hours.
 * The constraint given is that the price per unit should only be in muntiple of units given.
 * We can calculate this by taking the mod(%) with the unit given.
 * If the mod comes out as zero the constraint is satisfied if not we cannot allow the customer
 * to subscribe to the service. 
 * The price calculated is the hours of sreaming service given as input mod(%) the unit in hours
 * multiplied with the price per unit.This helps us if more streaming services are added so makes the
 * code modular.
 * 
 * Approach: We define a one TreeMap with key denoting streaming service and value as price of service
 * and another TreeMap with key as streamng service and value as base price. And use this using the 
 * same calculation given above.
 */
public class OttSubs {
    //class variables declared denoting the price per unit of streaming sevices
    TreeMap<String, Integer> pricePerUnit;
    TreeMap<String, Integer> unitInHours;

    //non paramaterized constructor for initializing price per units
    OttSubs(){
        pricePerUnit = new TreeMap<>();
        unitInHours = new TreeMap<>();
        pricePerUnit.put("Netflix", 10);
        pricePerUnit.put("AmazonPrime", 2);
        pricePerUnit.put("Hotstar", 1);
        unitInHours.put("Netflix", 10);
        unitInHours.put("AmazonPrime", 5);
        unitInHours.put("Hotstar", 5);
    }
    //paramaterized constructor for changing default OTT price per unit values
    OttSubs(TreeMap<String, Integer> addPrice, TreeMap<String, Integer> addUitInHours){
        pricePerUnit.putAll(addPrice);
        addUitInHours.putAll(addUitInHours);
    }
    
    //this function is used to calculate the price of the streaming services
    int calculatePrice(TreeMap<String, Integer> input){
        //iterating through the input TreeMap
        int calculatedPrice = 0;

        for (Map.Entry<String, Integer> entry : input.entrySet()) {
            String key = entry.getKey();
            int watchHr = entry.getValue();
            int minimumHr = unitInHours.get(key);
            int priceOfUnit = pricePerUnit.get(key);
            if(watchHr % minimumHr == 0)
                calculatedPrice = calculatedPrice + (watchHr%minimumHr)*
            // System.out.println("Starting time: " + entry.getKey() + ". Ending time: " + entry.getValue());
       }
    }
}
