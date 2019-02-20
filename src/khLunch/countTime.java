package khLunch;

import java.util.concurrent.TimeUnit;

class countTime {
	public void countDown(int num) throws InterruptedException {
		// 입력값으로 받은 시간만큼 카운트다운 
		for(int i=num; i>0; i--) {
			System.out.println((i));
			TimeUnit.SECONDS.sleep(1);
		}
	}
}
