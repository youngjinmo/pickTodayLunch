# 점심 메뉴 골라주는 프로그램

*190221*

## ver 1.0.0

일단 식당이 항상 같은 곳만 출력되는 문제를 해결했다. 

int형 램던 난수를 switch문으로 받아서 String형의 식당이름을 출력했는데, 각 case별로 `break`를 걸어두지 않아서 발생한 버그였다. 해결.

### Demo

https://youtu.be/sHPZaSA48Yg

<br>

### Issue

Not still raised.

<br>

<br>

---

<br>

*190220*

## ver 0.9.0

프로그램의 본질과 무관한 Landing 효과에 주력했다. 왜냐고? 재밌었다. 만드는 사람이 재밌어야 프로그램을 만들 수 있다. 만드는 사람이 재미없어하면 재미없는 프로그램이 완성된다.   *그럴듯하지?*

### Demo

https://youtu.be/WxTExfJuKB0

<br>

### Issue

치명적인 버그가 있다. 랜덤 함수를 generate했는데도, 계속 조샌드위치만 나온다. 랜덤하수의 boundary를 6으로 지정했는데, 왜 마지막 수만 계속 추출하는지 모르겠다. 이 부분만 수정하고 ver 1.0.0 으로 업데이트 할 예정.