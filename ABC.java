import java.util.TreeMap;
import java.util.Map;
import java.util.Scanner;
/** */
/** Menu driven program to handle doctor's appointments and bookings */
public class ABC {

    // Tree map containing appointments with starting time as key and calculated ending time as value
    TreeMap<String, String> doctorMap;
    //{"17:45":"18:15", }
    //default non parameterized constructor 
    ABC(){
        //initializing tree map
        doctorMap = new TreeMap<>();

    }
    
    //accepts string time in 24 hour format i.e. "17:45" for 5:45, 10:45 for 10
    boolean bookAppointment(String time){
        // get the hour from the entered time i.e 17
        int endTimeHour = Integer.parseInt(time.split(":")[0]);//this returns 17
        //get the ending minute time by splitting on colon : and add 30 minutes to get the ending minute
        int endTimeMinute = Integer.parseInt(time.split(":")[1])+ 30;//this returns 45 + 30 = 75
        //if after adding 30 minutes the minute is more than 60 increse hour by one
        if(endTimeMinute > 59){
            endTimeHour += 1;
            // if the hour is greater than 24 after adding 1 return false i.e cannot book appointment
            if(endTimeHour > 24){
                return false;
            }
            //update ending minute by subtracting 60 so if we add 30 minutes to 17:45 it gives 17:75 so we process this to get 18:15
            endTimeMinute -= 60;
        }
        String endTime = "";
        if(endTimeMinute == 0)
            endTime = Integer.toString(endTimeHour)+":"+ "00";
        // get the ending time as string and seperate by colon :
        else
            endTime = Integer.toString(endTimeHour)+":"+ Integer.toString(endTimeMinute);

        // if the tree map contains starting time then return false don't book appointment
        //{"17:45":"18:15"}
        if(doctorMap.containsKey(time.split(":")[0])){
            return false;
        }
        // if the tree map contains ending time then return false don't book appointment
        else if(doctorMap.containsValue(endTime)){
            return false;
        }
        //add appointment time to the doctor's tree map
        else{
            doctorMap.put(time, endTime);
        }
        return true;
    }

    //check whether time entered is correct or not
    //takes input as 17:45 checks whether hour s under 24 i.e. here it's 17 and the minute is under 60, 
    //here it's 45 so this return true
    //wrong input : 30:70:40
    
    boolean timeSanityCheck(String time){
        String arr[] = time.split(":");
        if(arr.length < 3){
            //hour cannot be greater than 24 and minute cannot be greater than 60 so user entered wrong time
            if(Integer.parseInt(arr[0]) < 24 & Integer.parseInt(arr[1]) < 60){
                return true;
            }
        }
        return false;
    }

    //print the list of doctor's appointment
    void displayAllAppointments(){
        //for each loop to print the doctorMap TreeMap by getting the Map series using entrySet 
        //TreeMap = {"17:45":"18:15", "10:45":"11:15"}
        for (Map.Entry<String, String> entry : doctorMap.entrySet()) {
            System.out.println("Starting time: " + entry.getKey() + ". Ending time: " + entry.getValue());
       }
    }

    //main function with menu driven code implementation
    public static void main(String[] args) {
        //initializing scanner class object
        Scanner sc = new Scanner(System.in);
        //creating object for ABC class
        ABC objAppointment = new ABC();
        //infinite while loop for taking user choices consistently
        while(true){
            //Menu option for the menu driven code
            System.out.println("---------------------------------------------------------");
            System.out.println("Read the instructions and enter the values for booking the doctor's appointment");
            System.out.println("Press 1 to Enter your preferred time");
            System.out.println("Press 2 to view the doctor's appointments for the day");
            System.out.println("Press 3 to exit");
            //accepting choice from user
            int choice = Integer.parseInt(sc.nextLine());
            switch(choice){
                case 1:
                    System.out.println("Enter your preferred time in hh:mm in 24 hr format");
                    String time = sc.nextLine();//17:45
                    //sanity check for user's time check input
                    if(objAppointment.timeSanityCheck(time)){
                        //trying to create the appointment print if true printing booked
                        if(objAppointment.bookAppointment(time))
                            System.out.println("Congratulations Appointment booked");
                        else
                            System.out.println("Doctor's not available");
                    }
                    else{
                        //user entered wrong time
                        System.out.println("Time sanity check failed");
                    }
                break;

                case 2:
                    //displaying the list of appointments
                    System.out.println("The appointments for the day are: ");
                    objAppointment.displayAllAppointments();
                break;

                case 3:
                    //exiting and closing the scanner stream
                    System.out.println("Thank you for considering us");
                    System.exit(0);
                    sc.close();
                break;

                default:
                    //default message for when the user enters a wrong value outside the menu options
                    System.out.println("Let's try reading the choices again");
            }
        }
        
    }
}