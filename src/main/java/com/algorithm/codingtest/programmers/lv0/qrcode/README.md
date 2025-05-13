- [QR Code](https://school.programmers.co.kr/learn/courses/30/lessons/181903)

```java
for (int i = 0; i < code.length(); i++) {
        if (i % q == r) {
        sb.append(code.charAt(i));
        }
}

// ↓
        
for (int i = r; i < code.length(); i += q) {
        sb.append(code.charAt(i));
}
```
- for문의 초기식, 증감식을 위와 같이 설정하면 if문을 사용하지 않아도 됨.
  - `0 ~ code.length()`까지 순차적으로 증가하고, `동일한 수(q)`로 나누기 때문에 규칙성이 생기기 때문.