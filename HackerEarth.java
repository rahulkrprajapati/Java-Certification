public class HackerEarth {
    // static int val = 3;

    // static int getValue(){
    //     return val--;
    // }
    // public static void main(String[] args) {
    //     int n;
    //     for(int i=0; i<5; i++){
    //         n = getValue();
    //         assert n > 2;
    //         System.out.println(" " + n);
    //     }
    // }
    private static int hack;
    public HackerEarth(){
        hack++;
    }
    protected static int hack_method(){
        return hack;
    }
    public static void main(String[] args) {
        HackerEarth h1 = new HackerEarth();
        HackerEarth h2 = new HackerEarth();
        HackerEarth h3 = new HackerEarth();
        HackerEarth h4 = new HackerEarth();
        HackerEarth h5 = new HackerEarth();
        HackerEarth h6 = new HackerEarth();
        h6.hack++;
        System.out.println(hack_method());
    }
    
}
