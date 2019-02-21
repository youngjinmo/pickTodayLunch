package khLunch;

import java.util.concurrent.TimeUnit;

class landingEffect {
	
	// created delay()
	// time delay applied to printout
	public static void delay(int num) throws InterruptedException {
		TimeUnit.MICROSECONDS.sleep(num);
	}


	// set of printout for String array 
	// purpose looks like conversations.
	public void print_chat(String[] arr) throws InterruptedException{
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
			delay(60000);
		}
	}

	// String array for 밥고르기 힘들지?\n
	public void chat_0() throws InterruptedException {
		String arr[] = new String[10];
			arr[0]="밥"; arr[1]="고"; arr[2]="르";
			arr[3]="기"; arr[4]=" "; arr[5]="힘";
			arr[6]="들"; arr[7]="지"; arr[8]="?";
			arr[9] = "\n";
		print_chat(arr);
	}

	// String array for  시간도 없는데..\n
	public void chat_1() throws InterruptedException {
		String arr[] = new String[11];
			arr[0] = ""; arr[1]="시"; arr[2]="간"; 
			arr[3]="도"; arr[4]=" "; arr[5]="없"; 
			arr[6]="는"; arr[7]="데"; arr[8]="."; 
			arr[9]="."; arr[10] = "\n";
		print_chat(arr);
	}

	// String array for  내가 골라줄테니까 이제 생산적인 고민만 하자!\n
	public void chat_2() throws InterruptedException {
		String arr[] = new String[26];
			arr[0] = "내"; arr[1]="가"; arr[2]=" "; 
			arr[3]="골"; arr[4]="라"; arr[5]="줄"; 
			arr[6]="테"; arr[7]="니"; arr[8]="까"; 
			arr[9]=" "; arr[10]="이"; arr[11]="제";
			arr[12]=" "; arr[13]="생"; arr[14]="산";
			arr[15]="적"; arr[16]="인"; arr[17]=" ";
			arr[18]="고"; arr[19]="민"; arr[20]="만";
			arr[21]=" "; arr[22]="하"; arr[23]="자";
			arr[24]="!"; arr[25] = "\n";
		print_chat(arr);
	}

	// set of conversation of intro
	// tried to look like conversation ;)
	public void intro() throws InterruptedException {
		chat_0();
		chat_1();
		chat_2();
	}
	
	// last question for execute or quit
	public void chat_4() throws InterruptedException {
		String arr[] = new String[13];
			arr[0] = "\n"; 
			arr[1] = " "; arr[2]="어"; arr[3]="때"; 
			arr[4]=" "; arr[5]="추"; arr[6]="천"; 
			arr[7]="받"; arr[8]="아"; arr[9]="볼"; 
			arr[10]="래"; arr[11]="?"; arr[12]="  ";
		print_chat(arr);
	}
	
	// request user a selection
	public void selection() throws InterruptedException {
		delay(500000);
		System.out.print("======================================" + "\nㅐ 1번. 그래 골라줘 || 2번. 괜찮아 사양할게. ㅐ" + "\n======================================");
		delay(1500000);
		chat_4();
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
