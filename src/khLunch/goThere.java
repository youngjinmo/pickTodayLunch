package khLunch;

import java.util.Scanner;
import khLunch.landingEffect;

public class goThere {
	
	public static void main(String[] args) throws InterruptedException {

		// Objects what I used.
		landingEffect ct = new landingEffect();
		Scanner sc = new Scanner(System.in);
		
		// local variables
		int boot;
		
		// program begins
		System.out.println("밥고르기 힘들지? 시간도 없는데..\n내가 골라줄테니까 이제 생산적인 고민만 하자.");
		// request user a selection
		ct.selection();		
		
		// input user's selection to local variable
		boot = sc.nextInt();
		
		// conditional for execute or quit
		if(boot==1) {
			// if user wants execute program
			System.out.println("\n좋았어 기대해~");
			ct.countDown(5);
			ct.welcome();
			
		} else {
			// if user wants quit program
			System.out.println("\n그래 잘가라.\n비싸고 맛없는 집을 가길 바랄게.");
		}
		
	}
}
