import java.util.*;
public class Passengers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "";
        s = sc.nextLine();
        int r = Integer.parseInt(s);
        s = sc.nextLine();
        int c = Integer.parseInt(s);
        //int r = sc.nextInt();
        //int c = sc.nextInt();
        int arr[][] = new int[r][];
        //int[][] arr = new int[rows][]; // notice how we do not tell the cols here
        for(int i=0;i<arr.length;i++){
        String line = sc.nextLine();
        String[] splitLine = line.split(" ");
        int[] rowArr = new int[splitLine.length];
            for(int x=0;x<splitLine.length;x++){
                rowArr[x] = Integer.parseInt(splitLine[x]);
            }
        arr[i] = rowArr;
        }
        s = sc.nextLine();
        int x = Integer.parseInt(s);
        int sum = 0, count = 0;
        for (int[] is : arr) {
            sum = 0;
            for (int val : is) {
                sum += val;
            }
            if((sum/is.length) > x )
                count += 1;   
        }
        System.out.println(count);
    }
}
