class Solution {
    public String solution(String phone_number) {
        String answer = "";
        char []c=phone_number.toCharArray();
        int i=c.length;
        for(int j=0;j<c.length-4;j++){
            c[j]='*';
        }
        for(int j=0;j<c.length;j++){
            answer+=c[j];
        }
        return answer;
    }
}
