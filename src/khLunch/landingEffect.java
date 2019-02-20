package khLunch;

import java.util.concurrent.TimeUnit;

class landingEffect {
	
	public void selection() {
		System.out.print("======================================" + "\nㅐ 1번. 그래 골라줘 || 2번. 괜찮아 사양할게. ㅐ" + "\n======================================"+" \n  너의 선택은?  ");
	}
	
	public void countDown(int num) throws InterruptedException {
		// 입력값으로 받은 시간만큼 카운트다운 
		String emp = "";
		for(int i=num; i>0; i--) {
			for(int j=0; j<num; j++) {
				emp += " ";
			}
			System.out.println(emp+(i));
			TimeUnit.MICROSECONDS.sleep(900000);
		}
	}
	
	public void welcome() throws InterruptedException {
		String[] arr = new String[5];
		arr[0] = "__        __   _";
		arr[1] = "\\ \\      / /__| | ___ ___  _ __ ___   ___ ";
		arr[2] = " \\ \\ /\\ / / _ \\ |/ __/ _ \\| '_ ` _ \\ / _ \\";
		arr[3] = "  \\ V  V /  __/ | (_| (_) | | | | | |  __/";
		arr[4] = "   \\_/\\_/ \\___|_|\\___\\___/|_| |_| |_|\\___|";
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			TimeUnit.MICROSECONDS.sleep(500000);
		}
		System.out.println("==========================================");
	}
}
