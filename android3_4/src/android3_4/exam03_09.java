package android3_4;

public class exam03_09 {
	public static void main(String args[]) {
		Automobile auto= new Automobile(null, 0); 
		
		auto.upSpeed(250); //오버라이딩한 upSpeed가 실행된다.
		System.out.println("승용차의 속도는 "+auto.getSpeed()+"km입니다.");
	}
}
