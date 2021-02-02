import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
class Solution {
    public String solution(String new_id) {
        String answer = "";
        ArrayList<Character> list = new ArrayList<Character>(); 
		Queue<Character> queue = new LinkedList<Character>();
        String id = new_id.toLowerCase();
        id = id.replaceAll("[^0-9 a-z\\.\\_\\-]","");
        for(int i=0;i<id.length();i++){
            char now = id.charAt(i);
            queue.offer(now);
        }
        while(!queue.isEmpty()){
            char c = queue.poll();
            while(true){
                if(queue.peek()==null)break;
                if(queue.peek()=='.'&&c=='.'){
                    c=queue.peek();
                    queue.poll();
                }
                else break;
            }
            list.add(c);
        }
        if(list.get(0)=='.'){
            list.remove(0);
        }
        if(list.size()>0&&list.get(list.size()-1)=='.'){
            list.remove(list.size()-1);
        }
        if(list.size()==0){
            list.add('a');
        }
        while(list.size()>=16){
                list.remove(list.size()-1);
        }
        if(list.get(list.size()-1)=='.') list.remove(list.size()-1);
        while(list.size()<=2){
                list.add(list.get(list.size()-1));
        }
        for(char a:list){
            answer+=a;
        }
        return answer;
    }
}
