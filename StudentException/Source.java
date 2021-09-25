package StudentException;

public class Source {
    public static void main(String[] args) {
        //TODO implement main for package student exception
        Student obj = new Student(2, "Rahul");
        ExceptionCheck ec = new ExceptionCheck();
        try{
            ec.validateStudent(obj);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
}
