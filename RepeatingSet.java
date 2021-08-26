import java.util.*;
public class RepeatingSet {
    static void printFirstRepeating(int arr[]) 
	{ 
		int min = -1; 

		HashSet<Integer> set = new HashSet<>(); 

		for (int i=arr.length-1; i>=0; i--) 
		{ 
			if (set.contains(arr[i])) 
				min = i; 
			else 
				set.add(arr[i]); 
		} 
		if (min != -1) 
		    System.out.println("first repeating element : " + arr[min]); 
		else
		    System.out.println("All elements are unique"); 
	} 

	public static void main (String[] args) throws java.lang.Exception 
	{  
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String s = sc.nextLine();
        String[] brr = s.split(" ");
        int[] arr = new int[brr.length];
        for(int i = 0; i < brr.length;  i++){
            arr[i] = Integer.parseInt(brr[i]);
        }
		printFirstRepeating(arr); 
	} 
    
}
