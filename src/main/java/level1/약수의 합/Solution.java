import java.util.*;
public int Solution(int n){
      int answer=0;
      for(int i=1;i<=n/2;i++){//정숫값이 큰게 들어오면 런타임 에러가 나올수 있으므로 n/2를 한다
          if(n%i==0){
              answer+=i;
          }
      }
      answer+=n;
      return answer;
}
