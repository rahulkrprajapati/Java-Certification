package StudentExamly;
import java.util.Comparator;

class Sortbyroll implements Comparator<Student>{
    public int compare(Student a, Student b)
    {
        return a.rollno - b.rollno;
    }
}
