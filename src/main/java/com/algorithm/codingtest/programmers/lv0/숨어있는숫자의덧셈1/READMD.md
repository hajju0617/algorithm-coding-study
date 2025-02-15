- <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120851">숨어있는 숫자의 덧셈(1)</a>

- n은 char 타입이라 문자로 저장된 숫자는 아스키 코드 값을 가짐.
  - `Ex)` '0'의 아스키 코드 값은 48, '1'의 아스키 코드 값은 49임.
  - 따라서 answer += n;은 단순한 숫자 합이 아니라 아스키 코드 값을 더하는 오류를 발생시켰음.
    - `n - '0'`을 사용해서 변환.
    - `Character.getNumericValue(n)`을 사용하면 `char -> int`로 변환할 수 있음.
      - 위 메서드는 유니코드까지 지원.