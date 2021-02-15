package programing;
import java.util.ArrayList;

class Answer{
	public String soultion(String s) {
		String answer ="";
		String[] array = s.split(" ");
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<array.length;i++) {
			int z = Integer.parseInt(array[i]);
			list.add(z);
		}
		list.sort(null);
		answer +=list.get(0);
		answer +=" "+list.get(list.size()-1); 
		return answer;
	}
}
public class Solution {

    public static void main(String[] args) {
    	Answer a = new Answer();
    	String s = "-1 -2 -3 -4";
    	System.out.println(a.soultion(s));
    }
}
