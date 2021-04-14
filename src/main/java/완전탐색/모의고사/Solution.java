import java.util.ArrayList;
class Solution {
    public int[] solution(int[] answers) {
        int []a1 = {1,2,3,4,5};
        int []a2 = {2,1,2,3,2,4,2,5};
        int []a3 = {3,3,1,1,2,2,4,4,5,5};
        int []count={0,0,0};
        ArrayList <Integer> list = new ArrayList<Integer>();
        for(int i=0;i<answers.length;i++){
            if(a1[i%5]==answers[i]){
                count[0]++;
            }
            if(a2[i%8]==answers[i]){
                count[1]++;
            }
            if(a3[i%10]==answers[i]){
                count[2]++;
            }
        }
        int max=count[0];
        for(int i=1;i<count.length;i++){
            if(max<count[i]){
                max=count[i];
            }
        }
        for(int i=0;i<count.length;i++){
            if(max==count[i]){
                list.add(i+1);
            }
        }
        int[] answer= new int[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
}
