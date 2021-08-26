import java.util.*;
class Panda {
    public void fun1(int a, int b, int c){
        System.out.println(a*b*c);
    }
    public void fun1(int a, int b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        Panda obj = new Panda();
        if(arr.length-1 == 2)
            obj.fun1(Integer.parseInt(arr[1]), Integer.parseInt(arr[2]));
        else if (arr.length-1 == 3)
            obj.fun1(Integer.parseInt(arr[1]), Integer.parseInt(arr[2]), Integer.parseInt(arr[3]));
        else 
            System.out.println("WRONG INPUT");
    }
    
}
