package khLunch;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class goThere {
	
	public static void countTime() throws InterruptedException {
		for(int i=0; i<5; i++) {
			System.out.println((i+1));
			TimeUnit.SECONDS.sleep(1);
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		Random rd = new Random();
		int go = rd.nextInt(5);
		
		Scanner sc = new Scanner(System.in);
		int boot;
		
		System.out.println("밥고르기 힘들지? 시간도 없는데..\n내가 골라줄테니까 이제 생산적인 고민만 하자.");
		System.out.println("1. 그래 골라줘~\n2. 고맙지만 사양할게.");
		boot = sc.nextInt();
		
//		if(boot_usr == 'Y') {
//			boot = true;
//		} else { boot = false; }
//		
//		while(!boot) {
//			System.out.println("다시 생각해봐. 정말 너가 잘 고를 수 있을거라고 생각해? ");
//		}
		
		
		
		
	}
}
