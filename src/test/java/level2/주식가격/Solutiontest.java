class Solution {
    public int[] solution(int[] prices) {
        int priceslength=prices.length;
        int[] answer =new int[priceslength];
        int time=0;
        for(int i=0;i<priceslength;i++){
            for(int j=i+1;j<priceslength;j++){
                if(prices[i]<=prices[j]){
                    time++;
                }
                else{
                    time++;
                    break;
                }
            }
            answer[i]=time;
            time=0;
        }
        return answer;
    }
}
