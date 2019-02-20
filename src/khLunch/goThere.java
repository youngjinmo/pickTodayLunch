package khLunch;

import java.util.Random;
import java.util.Scanner;
import khLunch.countTime;

public class goThere {
	
	public static void main(String[] args) throws InterruptedException {

		countTime ct = new countTime();
		Random rd = new Random();
		
		int go = rd.nextInt(5);
		
		Scanner sc = new Scanner(System.in);
		int boot;
		
		System.out.println("밥고르기 힘들지? 시간도 없는데..\n내가 골라줄테니까 이제 생산적인 고민만 하자.");
		System.out.println("1. 그래 골라줘~\n2. 고맙지만 사양할게.");
		boot = sc.nextInt();
		
		if(boot==1) {
			System.out.println("좋았어 기대해~");
			ct.countDown(5);
			
		} else {
			System.out.println("그래 잘가라.\n비싸고 맛없는 집을 가길 바랄게.");
		}
		
	}
}
