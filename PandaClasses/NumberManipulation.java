package PandaClasses;

public class NumberManipulation {
    static int arr[] = new int[9];
    void extractDigits(String n){
        for(int i = 0; i<n.length();i++){
            arr[i] = Integer.parseInt(""+n.charAt(i));
        }
    }
    int findLastDigit(String n){
        extractDigits(n);
        int count = 1;
        int ld = 0;
        for(int i: arr){
            ld += i*count;
            count += 1;
        }
        return ld;
    }
    public static void main(String[] args) {
        NumberManipulation obj = new NumberManipulation();
        System.out.println(obj.findLastDigit("103000001")%11);
        for (int i : arr) {
            System.out.println(i);
        }
    }

}
