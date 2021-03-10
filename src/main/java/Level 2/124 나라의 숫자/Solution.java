class Solution {
    public String solution(int n) {
        String answer = "";
        int refund=-1;
        int share=n;
        while(share!=0){
            refund=share%3;
            share=share/3;
            if(refund==0){
                answer="4"+answer;
                share--;
            }
            else if(refund==1){
                answer="1"+answer;
            }
            else if(refund==2){
                answer="2"+answer;
            }
        }
        return answer;
    }
}
