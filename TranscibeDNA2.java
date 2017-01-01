import java.util.*;

public class TranscibeDNA2	{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		String s = sc.next();
		StringBuffer rna = new StringBuffer();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='T'){
				rna.append('U');
			}
			else rna.append(s.charAt(i));
		}
		System.out.println(rna);
	}
}