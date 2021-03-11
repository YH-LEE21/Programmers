import java.util.Map;
import java.util.HashMap;
import java.util.Arrays; 

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        Map<String,String> map = new HashMap<String,String>();

        for(String number : phone_book){
            map.put(number, map.getOrDefault(number, number));
            if(!(map.get(number).equals(phone_book[0]))){
                if( map.get(number).startsWith(phone_book[0]) ){
                    answer = false;    
                }
            }
        }
        return answer;
    }
}
