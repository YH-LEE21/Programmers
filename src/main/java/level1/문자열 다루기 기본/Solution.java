class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if(4==s.length()||s.length()==6){
           for(int i=0;i<s.length();i++){
               if(48>s.charAt(i)||s.charAt(i)>57){
                   answer=false;
               }
           }
        }
        else{
            answer=false;
        }
        return answer;
    }
}
