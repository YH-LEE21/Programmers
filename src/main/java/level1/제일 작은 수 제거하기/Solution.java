import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList <Integer> list = new ArrayList<Integer>();
        for(int i:arr){
            list.add(i);
        }
        if(list.size()==1){
            int [] answer={-1};
            return answer;
        }
        else{
            int c=list.get(0);
            int b=0;
            for(int i=1;i<list.size();i++){
                if(list.get(i)<c){
                    c=list.get(i);
                    b=i;
                }
            }
            list.remove(b);
           
        }
        int[] answer = new int[list.size()];
            for(int i=0;i<answer.length;i++){
                answer[i]=list.get(i);
            }
        return answer;
    }
}
