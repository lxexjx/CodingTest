# Do it 자바 알고리즘

### 1. 배열의 역순
교환 횟수 : 갯수/2 (홀수배열은 나머지 버림)



## 투포인터


[Opatoinal<T>]



T타입 객체의 래퍼클래스  Opatoinal<T> 어떤 타입이던 지정 가능(모든 종류의 객체, null 저장 가능)



1) null을 직접 다루는 것은 위험해서 null을 간접적으로 다루기(NullPointException).

2) nulll 체크 (if문 필수 )



null을 Optional객체에 넣어서 담긴 값이 null인 거지 주소는 존재.



                  □                      □    0x100  

result        0x100      →     null

null을 직접 다루는게 아닌 optional객체 안에 넣으면 결과가 널이더라도 result의 결과는 항상 null이 아님(주소 존재).



∴  NullPointException가 발생하지 않고 코드가 간결해짐
