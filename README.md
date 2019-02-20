# 점심 메뉴 골라주는 프로그램

[TOC]



## Ver 0.9.0

프로그램의 본질과 무관한 Landing 효과에 주력했다. 왜냐고? 재밌었다. 만드는 사람이 재밌어야 프로그램을 만들 수 있다. 만드는 사람이 재미없어하면 재미없는 프로그램이 완성된다.   *그럴듯하지?*

### Demo

 <iframe width="560" height="315" src="https://www.youtube.com/embed/WxTExfJuKB0" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

<br>

### Issue

치명적인 버그가 있다. 랜덤 함수를 generate했는데도, 계속 조샌드위치만 나온다. 랜덤하수의 boundary를 6으로 지정했는데, 왜 마지막 수만 계속 추출하는지 모르겠다. 이 부분만 수정하고 ver 1.0.0 으로 업데이트 할 예정.