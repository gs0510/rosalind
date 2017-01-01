import java.util.*;

public class CountDNA1	{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		String s = sc.next();
		int a=0,t=0,g=0,c=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='A')a++;
			if(s.charAt(i)=='T')t++;
			if(s.charAt(i)=='G')g++;
			if(s.charAt(i)=='C')c++;
		}
		System.out.println(a+" "+c+" "+g+" "+t);
	}
}