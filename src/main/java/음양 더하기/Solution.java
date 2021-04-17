class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i=0;i<absolutes.length;i++){
            int sum = (!signs[i]) ? -(absolutes[i]) : absolutes[i];
            answer += sum;
        }
        return answer;
    }
}
