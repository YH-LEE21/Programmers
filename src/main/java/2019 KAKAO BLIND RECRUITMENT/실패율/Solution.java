import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[] result = new double[N+1];
        Arrays.sort(stages);
        ArrayList<Integer> list =new ArrayList<Integer>();
        HashMap<Integer,Double> map = new HashMap<Integer,Double>();
        for(int i:stages){
            list.add(i);
        }
        int size = list.size();
        int cnt=0;
        for(int i=1;i<=N;i++){
            int count=0;
            for(int j=0;j<list.size();j++){
                if(i==list.get(j)){
                    count++;
                    cnt++;
                }
            }
            result[i] = (double)count/size;
            if(count==0){
                result[i]=0.0;
            }
            size=list.size()-cnt;
            count=0;
        }
        for(int i=1;i<result.length;i++){
            map.put(i,result[i]);
        }
        list.clear();
        list= new ArrayList<>(map.keySet());
        Collections.sort(list, (o1, o2) -> (map.get(o2).compareTo(map.get(o1))));
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
}
