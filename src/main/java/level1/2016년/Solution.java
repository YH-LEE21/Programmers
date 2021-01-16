import java.util.Date;
class Solution {
    public String solution(int a, int b) {
        String answer ="";
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] s={"THU","FRI","SAT","SUN","MON","TUE","WED"};
        int sum=0;
        for(int i=0;i<a-1;i++){
            sum+=month[i];
        }
        sum+=b;
        answer=s[sum%7];
        return answer;
    }
}
