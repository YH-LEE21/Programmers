import java.util.ArrayList;
class Solution {
    public long[] solution(long n) {
        String s=String.valueOf(n);
        ArrayList<Long> list = new ArrayList<Long>();
        for(int i=0;i<s.length();i++){
            if(n!=0){
                long a=n%10;
                list.add(a);
                n=n/10;
            }
        }
        long[] answer =new long[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
}
