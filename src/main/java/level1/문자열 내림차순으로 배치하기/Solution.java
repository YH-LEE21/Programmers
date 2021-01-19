import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String answer = "";
        char[] alpahbets = new char[s.length()];
        for(int i=0;i<s.length();i++){
            alpahbets[i] = s.charAt(i);
        }
        Arrays.sort(alpahbets);
        for(int i=alpahbets.length-1;i>=0;i--){
            answer+=alpahbets[i];
        }
        return answer;
    }
}
