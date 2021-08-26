package StudentExamly;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Student {
    int rollno, rank;
    String name, address;
    
    public Student(int rollno, String name, String address, int rank){
        this.rollno = rollno;
        this.name = name;
        this.address = address;
        this.rank = rank;
    }

    @Override
    public String toString(){
        return this.rollno+" "+ this.name+ " "+this.address+" "+ this.rank;
    }
}
