package khLunch;

import java.util.Scanner;
import java.util.Random;
import khLunch.landingEffect;
import khLunch.ob_restaurants;

public class Run {
	
	public static void main(String[] args) throws InterruptedException {

		// Objects what I used.
		landingEffect ct = new landingEffect();
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		ob_restaurants pick = new ob_restaurants();
		
		// local variables
		int boot;
		
		// program begins
		ct.intro();
		
		// request user a selection
		ct.selection();		
		
		// input user's selection to local variable
		boot = sc.nextInt();
		
		// conditional for execute or quit
		if(boot==1) {
			// if user wants execute program
			System.out.println("\n좋았어 기대해~");
			
			// time delay to show count down
			ct.delay(500000);
			
			// show count down
			ct.countDown(5);
			
			// generate random number as integer
			int ranNum = ran.nextInt(5);
			
			// show easter egg
			ct.welcome();
			
			// store a random number to String 'go'
			String go = pick.randomPick(ranNum);
			
			// happy lunch
			System.out.println("\n오늘의 점심은 \""+go+"\" 으로 선정되었어.\n즐거운 점심 되길 바란다.");
			
			
		} else {
			// if user wants quit program
			System.out.println("\n그래 잘가라.\n비싸고 맛없는 집을 가길 바랄게.");
		}
		
	}
}
