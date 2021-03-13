import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> Q = new LinkedList<Integer>(); 
        int sum=0;
        for(int i : truck_weights){
            for(;;){
                if(Q.isEmpty()){
                    Q.add(i);
                    sum+=i;
                    answer++;
                    break;
                }
                else if(Q.size()==bridge_length){
                    sum-=Q.poll();
                }
                else{
                    if(sum+i>weight){
                        answer++;
                        Q.add(0);
                    }
                    else{
                        Q.add(i);
                        sum+=i;
                        answer++;
                        break;
                    }
                }
            }
        }
        return answer+bridge_length;
    }
}
