package PandaClasses;

public class InvalidInputException extends Exception{
    String desc;
    InvalidInputException(String desc){
        super(desc);
    }
    
}
