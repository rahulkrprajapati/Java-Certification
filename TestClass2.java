import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class TestClass2 {
	static int mod = 1000000007;

	static long maxSum(ArrayList<Integer> arr, int N, int K) {
		long ans = 0;

		HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();
		for (int j = 0; j < K; j++) {
			if (freq.containsKey(arr.get(j))) {
				freq.put(arr.get(j), freq.get(arr.get(j)) + 1);
			} else
				freq.put(arr.get(j), 1);
		}

		long sum = 0;

		for (int m : freq.keySet()) {
			sum = (sum + ((long) (Math.pow(m, freq.get(m)))) % mod) % mod;
		}

		ans = Math.max(ans, sum);

		for (int i = 1; i <= N - K; i++) {

			if (freq.containsKey(arr.get(i - 1))) {
				sum -= freq.get(arr.get(i - 1)) > 0
						? ((long) (Math.pow(
								arr.get(i - 1),
								freq.get(arr.get(i - 1)))))
								% mod
						: 0;

				freq.put(arr.get(i - 1), freq.get(arr.get(i - 1)) - 1);


				sum += freq.get(arr.get(i - 1)) > 0
						? ((long) (Math.pow(
								arr.get(i - 1),
								freq.get(arr.get(i - 1)))))
								% mod
						: 0;
			}

			if (freq.containsKey(arr.get(i + K - 1))) {
				sum -= freq.get(arr.get(i + K - 1)) > 0
						? ((long) (Math.pow(
								arr.get(i + K - 1),
								freq.get(arr.get(i + K - 1)))))
								% mod
						: 0;
			}

			if (freq.containsKey(arr.get(i + K - 1)))
				freq.put(arr.get(i + K - 1), freq.get(arr.get(i + K - 1)) + 1);
			else
				freq.put(arr.get(i + K - 1), 1);


			sum += freq.get(arr.get(i + K - 1)) > 0
					? ((long) (Math.pow(
							arr.get(i + K - 1),
							freq.get(arr.get(i + K - 1)))))
							% mod
					: 0;

			ans = Math.max(ans, sum);
		}
		return ans;
	}

	public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);
        String d = sc.nextLine();
        String[] det = d.split(" ");
		int N = Integer.parseInt(det[0]);
        int K = Integer.parseInt(det[1]);
        String n = sc.nextLine();
        det = n.split(" ");
        ArrayList<Integer> arr = new ArrayList<Integer>(); 
        for (String string : det) {
            arr.add(Integer.parseInt(string));
        }

		// Output the variable to STDOUT
		System.out.println(maxSum(arr, N, K));
	}
}
