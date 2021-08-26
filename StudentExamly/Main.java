package StudentExamly;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        ArrayList<Student> ar = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String Welcome = "Student Interactive Console: \n1). Add User\n2). Sort Student List by Roll no \n3). Sort Student List by name \n4). Sort Student List by Rank \n5). Exit form the system";

        int choice = 0;
        do{
            System.out.println(Welcome);
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                sc.nextLine();
                System.out.println("Enter the rollno, name, address and rank( seperated by comma)");
                String [] temp = sc.nextLine().split(",");
                Student stu = new Student(Integer.parseInt(temp[0]), temp[1], temp[2], Integer.parseInt(temp[3]));
                ar.add(stu);
                break;

                case 2:
                sc.nextLine();
                Collections.sort(ar, new Sortbyroll());
                System.out.println("\nStudents List sorted by rollno");
                for(int i=0; i<ar.size(); i++)
                    System.out.println(ar.get(i));
                break;

                case 3:
                sc.nextLine();
                Collections.sort(ar, new Sortbyname());
                System.out.println("\nStudents List sorted by name");
                for(int i=0; i<ar.size(); i++)
                    System.out.println(ar.get(i));
                break;

                case 4:
                sc.nextLine();
                System.out.println("Sort by ascending or descending ( asc/ desc)");
                boolean asc = sc.nextLine().equalsIgnoreCase("asc") ? true: false;

                Collections.sort(ar, new SortbyRank(asc));
                System.out.println("\nStudents List sorted by Rank");
                for(int i=0; i<ar.size(); i++)
                    System.out.println(ar.get(i));
                break;

                case 5:
                System.out.println("Exiting ....");
                System.exit(0);
                break;
                
                default:
                sc.nextLine();
                System.out.println("\nInvalid Input Try again !!!");


            }
        }while(choice !=5);
    }
}
