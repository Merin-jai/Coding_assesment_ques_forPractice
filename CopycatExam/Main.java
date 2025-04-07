// using approach 1 sorting the strings and comparing them
// Time complexity is O(nlogn) and space complexity is O(n)for sorting  

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 =sc.nextLine();
		String s2 = sc.nextLine();
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		char a1[] = s1.toCharArray();
		char a2[] = s2.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(a2);
		String rs1= new String(a1);
		String rs2= new String(a2);
		System.out.println(rs1 + " " + rs2);
		if(rs1.equals(rs2))
		  System.out.println("0");
		else
		  System.out.println("1");
	}
}