class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;
        for(int i = 0; i < s.length(); i++) {
            switch(s.charAt(i)){
                case 'P':case 'p':
                      p++;
                      break;
                case 'Y':case 'y':
                      y++;
                      break;
            }
        }
        if(p==y)  {
            return answer = true;
        } else {
          return answer = false;  
        } 
    }
}
