package khLunch;

public class ob_restaurants {
	public String randomPick(int ran) {
		// initialized String pick
		String pick = "";
		
		switch(ran) {
		case 0: 
			pick =  "리틀하노이(쌀국수)"; 
			break;
		case 1: 
			pick = "역삼735(이자카야)"; 
			break;
		case 2: 
			pick = "담소사골순대(순대국)"; 
			break;
		case 3: 
			pick = "봉된장(한정식)"; 
			break;
		case 4: 
			pick = "명동칼국수"; 
			break;
		case 5: 
			pick = "조샌드위치(커피)"; 
			break;
		}
		
		return pick;
	}
}
