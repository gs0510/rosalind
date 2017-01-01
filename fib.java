import java.util.*;

public class fib	{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		long k = Long.parseLong(sc.next());
		long arr[]= new long[n];
		arr[0] = 1;
		arr[1] = 1;
		if(n>1)
		for(int i=2;i<n;i++){
			arr[i] = arr[i-1] + arr[i-2]*k;
		}
		System.out.println(arr[n-1]);
	}
}