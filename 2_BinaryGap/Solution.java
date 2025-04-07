import java.util.*;
class Solution {
    public int solution(int N) {
    //    convert it to binary
    String binary = Integer.toBinaryString(N);
    
    int currentGap=0, maxGap=0;
    boolean counting=false;
    for(int i=0;i<binary.length();i++)
    {
        char c=binary.charAt(i);
        if(c=='1')
        {
            if(counting)
            {
                maxGap=Math.max(maxGap,currentGap);
            }
            counting=true;
            currentGap=0;
        }
        else if(counting)
        {
            currentGap++;
        }
    }
    // System.out.println(N+" "+binary+" "+maxGap);
    return maxGap;
    }
}