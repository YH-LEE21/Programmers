import java.util.*;

class Soultion{
    public int solution(int[] board,int[] moves){
          int answer = 0;
          Stack<Integer> stack = new Stack<Integer>();
          for(int move : moves){
              int m = move - 1;
              for(int i=0;i<board.length;i++){
                  int x = board[i][m];
                  if(x == 0)continue;
                  if(!stack.isEmpty&&stack.peek()==x){
                      stack.pop();
                      answer++;//터진 횟수
                  }
                  else{
                      stack.push();
                  }
                  board[i][m] = 0;
                  break;
              }
          }
          return answer*2;//터진횟수에 x2 를 해주어 몇개가  확인한다.
    }
}
