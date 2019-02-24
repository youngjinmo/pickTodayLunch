# 점심 메뉴 골라주는 프로그램

*190221*

## ver 1.0.0

일단 식당이 항상 같은 곳만 출력되는 문제를 해결했다. 

int형 램던 난수를 switch문으로 받아서 String형의 식당이름을 출력했는데, 각 case별로 `break`를 걸어두지 않아서 발생한 버그였다. 해결.

### Demo

[![](https://lh3.googleusercontent.com/5uC4QFlQHD6aI3pv2qMISC2McEz-A2gqQZeb5cBZ_eHS7HIp0yozgYzr-yRG1ecSJs03iskGYdPsVJb48hUzgfs_uvzRIz-nTw9YGTrApUYPf8tMAWDpK0UTE4zKBde1fXfAmFwyrOJknWOB3DWGvOnGYr3nWeejNjI6N2DmdBSRBbQw1VhhwgUC3AWyuaMqfvk2wE0bLVJHjSxYxEgHNFg7cT6PISsWwbaTaFVG2POdzqfsyHAwC5lgp9U9Jdf8JB_4YQYgv77OQbaJKQearfEZ0Q0jTtpKuU_PVLTVBDACFghd9zjv6sYmtgp2wGHhFYBqeQ0i0oX8lYtjnlGIt7m-SPQNJ2Zzj4-VheMIblNbjk3z898tWuORg9spnqdTNY8nMHB3QTiGnqFDRc94GDMCJrf6yyIdObIrmBTQjr6U7FkMVaFYpmVotO5_uXY77gLKB9iXORIz0HYlevcH7BUbOzLhHBXvu0oP3m3cM3x2KBGilBBH6D5iJytwAqTkl8kKbpRgWaaW-knSyO8v-7RrPql3JWlCpzcXwpOxIfCTOJzmgbOGvkW4OpCpeA2KcY7OA_K3lHBaY_A3bBq5Jaf-euLxdmoZbuI7Ig0Y27pts-gqki6dP3PxZJsQ-5mxwFML8TxOpSyE-WoQlFB3S9ZTmHmrKWp1=w998-h430-no)](https://youtu.be/sHPZaSA48Yg)



<br>

### Issue

Not yet.

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