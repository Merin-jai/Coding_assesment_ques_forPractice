import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int n=sc.nextInt();
		int[] space = new int[n];
		int i,min,max;
		for(i=0;i<n;i++)
		 space[i]=sc.nextInt();
		min=Integer.MAX_VALUE;
		max=Integer.MIN_VALUE;
		for(i=0;i<n-x;i++)
		{
		    min=Integer.MAX_VALUE;
		    for(int j=i;j<i+x;j++)
		    {
		        min=Math.min(min,space[j]);
		    }
		    max=Math.max(max,min);
		}
		System.out.println(max);
	}
}
// Time Complexity: O(n^2)
// Space Complexity: O(1)
