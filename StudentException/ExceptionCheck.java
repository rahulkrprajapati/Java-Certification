package StudentException;

public class ExceptionCheck {
    String validateStudent(Student student) throws InvalidStudentException{
        try {
            if(student.studentName == null || student.studentName.length() < 3){
                throw new InvalidStudentException("Student name is invalid");
            }
            else if(student.studentID == null || student.studentID <= 100){
                throw new InvalidStudentException("Student id invalid");
            }
            else{
                return student.status = "success";
            }
        } catch (InvalidStudentException e) {
            //TODO: handle exception
            student.status = e.getMessage();
            throw e;
        }
        catch(Exception e){
            student.status = "unknown error occured";
            throw e;
        }
    }
}
