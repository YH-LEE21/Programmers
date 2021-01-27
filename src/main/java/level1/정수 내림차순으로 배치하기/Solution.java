import java.util.Arrays;
import java.util.Collections;
class Solution {
    public long solution(long n) {
       long answer;
		int l=Long.toString(n).split("").length;
		
		String[] array=new String[l];
		array=Long.toString(n).split("");
		
		String tmp="";
		
		Arrays.sort(array,Collections.reverseOrder());
		
		for(int i=0;i<l;i++) {
			tmp+=(long)Integer.parseInt(array[i]);
		}
		answer=Long.parseLong(tmp);
		return answer;
    }
}
