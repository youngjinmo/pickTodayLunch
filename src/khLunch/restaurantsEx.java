package khLunch;

import khLunch.Restaurants;

public class restaurantsEx {
	public static void main(String[] args) {
		Restaurants[] bobzip = new Restaurants[7];
		
		bobzip[0] = new Restaurants("리틀하노이(쌀국수)", "Noodles", 7000, "우리은행 테헤란로 금융센터 지하");
		bobzip[1] = new Restaurants("역삼735", "Japanese", 7000, "CU편의점 옆");
		bobzip[2] = new Restaurants("담소사골순대", "Korean", 7000, "CU편의점 옆옆");
		bobzip[3] = new Restaurants("조샌드위치", "Desert", 5500, "CU편의점 옆옆옆");
		bobzip[4] = new Restaurants("명동칼국수", "Noodles", 6000, "우리은행 테헤란로 금융센터 지하");
		bobzip[5] = new Restaurants("북경", "Chinese", 7000, "우리은행 테헤란로 금융센터 지하");
		bobzip[6] = new Restaurants("봉된장", "Korean", 8000, "서울특별시 강남구 테헤란로10길 25");
		
	}
}
