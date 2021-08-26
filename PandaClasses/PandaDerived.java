package PandaClasses;

public class PandaDerived extends PandaBase{
    void display(){
        System.out.println("Hello from the derived class");
        System.out.println("The Derived class method ");
    }
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Output when the parent class object is invoked");
        PandaBase obj1 = new PandaBase();
        obj1.display();

        System.out.println();
        System.out.println("Output when the derived class object is invoked");
        PandaBase obj = new PandaDerived();
        obj.display();

    }
}
