import java.util.Stack;
class Solution {
    public int solution(int n) {
        int answer = 0;
        int divide;
        int lastValue;
        Stack <Integer> s = new Stack<Integer>();
        
        for(;;){
            divide=n/3;
            lastValue=n%3;
            s.push(lastValue);
            n=divide;
            if(n==0)break;
        }
        long length=s.stream().count();
        for(int i=0;i<length;i++){
            answer+=s.pop()*Math.pow(3,i);
        }
        return answer;
    }
}
