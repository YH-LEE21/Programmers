import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
         Map<String, Integer> cache = new HashMap<>();
        for (int i = 0; i < participant.length; i++) {
            if (0 < cache.getOrDefault(participant[i], 0)) {
                cache.replace(participant[i], cache.get(participant[i]) + 1);
            }else {
                cache.put(participant[i], 1);
            }
        }
        for (int i = 0; i < completion.length; i++) {
            if (0 < cache.get(completion[i])) {
                cache.replace(completion[i], cache.get(completion[i]) - 1);
            }
        }
        for (Map.Entry<String, Integer> item : cache.entrySet()) {
            if (0 < item.getValue()) 
                return item.getKey();
        }
        return null;
    }
}
