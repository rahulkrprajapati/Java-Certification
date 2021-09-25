package hackerearth;

public class hack1 {
    private int hack_method1(int hack){
        return hack++;
    }
    public int hack_method2(int hack){
        System.out.println(hack);
        return hack_method1(hack++);
    }
}
