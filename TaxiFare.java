import java.util.Scanner;
public class TaxiFare {
    /** This question asks us to calculate the fare of our traffic journey using the peer hour fare price*/
    //declaring static class variables
    double rate, fare, duration;
    
    //non-parameterized constructor
    TaxiFare(){
        //initializing initial values to zero
        rate = 0.0;
        fare = 0.0;
        duration = 0.0;
    }

    //parameterized constructor
    TaxiFare(double fare, double duration){
        rate = 0.0;
        this.fare = fare;
        this.duration = duration;
    }

    //function to calculate the Taxi Fare according to the class variable values
    double returnFare(){
        //converting the duration from minutes to hours
        rate = fare * duration/60.0;
        return rate;
    }

    //main function code
    public static void main(String[] args) {

        // initializing scanner object for taking user inputs from command line
        Scanner sc = new Scanner(System.in);
        //user prompt to enter the taxi fare
        System.out.print("Enter the rate of the Taxi Fare: ");
        //accepting the user input
        double inputRate = sc.nextDouble();
        // user prompt to enter the trip duration in minutes
        System.out.print("Enter the duration of your trip in minutes: ");
        double inputDuration = sc.nextDouble();
        
        //creating the class object and initializing with the user values
        TaxiFare objTaxiFare = new TaxiFare(inputRate, inputDuration);
        //formating the input to 2 decimal places
        System.out.printf("Your Trip costs: %.2f", objTaxiFare.returnFare());
        //closing scanner object to prevent memory leak
        sc.close();
    }
}
