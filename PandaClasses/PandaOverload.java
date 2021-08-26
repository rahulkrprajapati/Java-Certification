package PandaClasses;
public class PandaOverload {
    //function signature to calculate square's area
    void calculateArea(int a){
        System.out.println("The area of a square with side " + a + " is: " +(a*a));
    }

    //function signature to calculate rectangle's area
    void calculateArea(int l, int b){
        System.out.println("The are of a rectangle with length " + l + " and breadth "+ b +" is: "+ (l*b) );
    }
    public static void main(String[] args) {
        PandaOverload obj = new PandaOverload();
        //compiler matches function calls with function signature
        obj.calculateArea(4);// square's area method matches because it has one argument
        obj.calculateArea(4, 5);// rectangle's area method matches because it has two arguments
    }
}
