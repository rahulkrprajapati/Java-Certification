package PersonTeacherInheritance;

// A test driver program for Person and its subclasses
public class Test {
    public static void main(String[] args) {
        // Test Student class
        Student s1 = new Student("Suhesna Basu", "The 42nd, Park Street");
        s1.addCourseGrade("EC801", 97);
        s1.addCourseGrade("EC802", 68);
        s1.printGrades();
        System.out.println("Average is " + s1.getAverageGrade());

        // Test Teacher class
        Teacher t1 = new Teacher("Sandip Mukherjee", "9th, Sector V");
        System.out.println(t1);
        String[] courses = { "EC801", "EC802", "EC801" };
        for (String course : courses) {
            if (t1.addCourse(course)) {
                System.out.println(course + " added.");
            } else {
                System.out.println(course + " cannot be added.");
            }
        }
        for (String course : courses) {
            if (t1.removeCourse(course)) {
                System.out.println(course + " removed.");
            } else {
                System.out.println(course + " cannot be removed.");
            }
        }
    }
}