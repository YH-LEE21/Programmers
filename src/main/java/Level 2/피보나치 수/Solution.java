class Solution {
    public int solution(int n) {
        int answer = 0;
        int n1=0;
        int n2=1;
        if(n==0){
            answer=n1;
        }
        else if(n==1){
            answer=n2;
        }
        else{//n=2 이상 일때
            for(int i=1;i<=n;i++){
                answer=((n1%1234567)+(n2%1234567))%1234567;
                n2=n1;
                n1=answer;
            }
        }
        return answer;
    }
}
