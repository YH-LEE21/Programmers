class Solution {
    public int solution(long num) {
        int answer = 0;
        for(int i=0;i<=500;i++){
            if(num==1)break;
            else if(num%2==0)num/=2;
            else if(num%2==1)num=(num*3)+1;
            answer++;
            if(i==500)answer=-1;
        }
        return answer;
    }
}
