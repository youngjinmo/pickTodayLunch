package khLunch;

import java.util.concurrent.TimeUnit;

class landingEffect {
	
	// created delay()
	// time delay applied to printout
	public void delay(int num) throws InterruptedException {
		TimeUnit.MICROSECONDS.sleep(num);
	}
	
	// intro 
	// tried to look like conversation ;)
	public void intro() throws InterruptedException {
		System.out.println("밥고르기 힘들지?"); 
		delay(1000000);
		System.out.println("시간도 없는데..");
		delay(1000000);
		System.out.println("내가 골라줄테니까 이제 생산적인 고민만 하자");
		delay(1000000);
	}
	
	// request user a selection
	public void selection() throws InterruptedException {
		System.out.print("======================================" + "\nㅐ 1번. 그래 골라줘 || 2번. 괜찮아 사양할게. ㅐ" + "\n======================================");
		delay(1500000);
		System.out.print(" \n  너의 선택은?  ");
	}
	
	// show count down beginning of program as fun
	public void countDown(int num) throws InterruptedException {
		
		// initialized variable 'emp'
		// just for visible effect
		String emp = "";
		
		// printout count down number with minor effect
		for(int i=num; i>0; i--) {
			for(int j=0; j<num; j++) {
				emp += " ";
			}
			// printout
			System.out.println(emp+(i));
			
			// time delay applied to printout for count down
			delay(900000);
		}
	}
	
	// just fun
	public void welcome() throws InterruptedException {
		
		// array for storing String variable for each line
		String[] arr = new String[5];
		arr[0] = "__        __   _";
		arr[1] = "\\ \\      / /__| | ___ ___  _ __ ___   ___ ";
		arr[2] = " \\ \\ /\\ / / _ \\ |/ __/ _ \\| '_ ` _ \\ / _ \\";
		arr[3] = "  \\ V  V /  __/ | (_| (_) | | | | | |  __/";
		arr[4] = "   \\_/\\_/ \\___|_|\\___\\___/|_| |_| |_|\\___|";
		
		// printout welcome
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			
			// time delay applied to printout 
			// for look like classic printer
			delay(500000);
		}
		
		// divide all effects from real program
		System.out.println("==========================================");
	}
}
