class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {0,0};
        
        
        int round = brown/2+2;
        int sum = brown+yellow;
        int width =  (int)(round/2.f +Math.sqrt((float)(round*round/4.f - sum)));
        int height = round - width;
        if(width >= height){
            answer[0]=width;
            answer[1]=height;
        }
        else{
            answer[0] = height;
            answer[1] = width;
        }
        return answer;
    }
}
