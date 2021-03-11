import java.util.HashMap;
import java.util.Map.Entry;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(int i=0;i<clothes.length;i++){
            String key = clothes[i][1];
            map.put(key,map.getOrDefault(key,0)+1);
        }
        for(Entry<String,Integer> entry:map.entrySet()){
            answer*=entry.getValue()+1;
        }
        
        return answer-1;
    }
}
