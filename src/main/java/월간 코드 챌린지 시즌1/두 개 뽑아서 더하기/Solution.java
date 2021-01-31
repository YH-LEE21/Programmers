import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<numbers.length;i++){
            for(int j=numbers.length-1;j>i;j--){
                int z=numbers[i]+numbers[j];
                if(list.indexOf(z)<0){
                    list.add(z);
                }
            }
        }
        list.sort(null);
        int[] answer = new int[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
}
