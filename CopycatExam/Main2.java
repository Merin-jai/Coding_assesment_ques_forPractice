import java.util.*;

public class Main2
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 =sc.nextLine().toLowerCase();
		String s2 = sc.nextLine().toLowerCase();
		int[] freq = new int[26];
		for(char c : s1.toCharArray()) freq[c-'a']++;
		for(char c : s2.toCharArray()) freq[c-'a']--;
		for(int i=0;i<26;i++)
		{
		    if(freq[i]!=0)
		    {
		        System.out.println("0");
		        return;
		    }
		}
		System.out.println("1");
		
	}
}
