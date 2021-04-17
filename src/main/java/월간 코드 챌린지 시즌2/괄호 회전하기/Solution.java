import java.util.Stack;
class Solution {
    public int solution(String s) {
        Stack<Character> stack = new Stack<Character>();
        int answer =0;
        
        boolean[] tf = new boolean[s.length()];
        boolean check = true;
      
        for(int i=0;i<s.length();i++){
        	char c=s.charAt(s.length()-1);
            if(s.charAt(0) == '}' ||s.charAt(0) == ')' ||s.charAt(0) == ']') {
            	tf[i]=false;
            }
            else {
            for(int j =0 ;j<s.length();j++) {
            	if(s.charAt(j)=='('||s.charAt(j) == '{' || s.charAt(j) == '['){
                    stack.push(s.charAt(j));
                }
                else{
                    if(stack.isEmpty()) {
                    	tf[i] = false;
                    }
                    else if(stack.peek() == '{'&&s.charAt(j)=='}'||stack.peek() == '('&&s.charAt(j)==')'||stack.peek() == '['&&s.charAt(j)==']'){
                    	stack.pop();
                    }
                }
            }
            
            tf[i] = (stack.isEmpty()) ? true:false;
            stack.clear();
            if(tf[i] == true) {
            	answer++;
            }
           }
            s=c+s.substring(0,s.length()-1);
       }
        return answer;
    }
}
