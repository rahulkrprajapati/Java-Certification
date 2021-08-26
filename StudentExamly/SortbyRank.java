package StudentExamly;
import java.util.Comparator;

public class SortbyRank implements Comparator<Student> {
    boolean asc;
    SortbyRank(boolean asc){
        this.asc = asc;

    }
    public int compare(Student a, Student b)
    {
        if(asc == true)
            return a.rank - b.rank;
        else
            return b.rank - a.rank;
    }
}
