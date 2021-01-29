class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int max = Math.max(n,m);
            // int max= n>m ? n: m
        for(int i=1;i<=max;i++){
            if(n%i==0&&m%i==0){
                answer[0]=i;
            }
        }
        answer[1]=(n*m)/answer[0];
        return answer;
    }
}
