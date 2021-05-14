package android3_3;
import java.lang.Math;

public class exam03_08 {
	public static void main(String args[]) {
	MCar MCar1= new MCar("빨강",0);
	MCar MCar2= new MCar("파랑",0);
	MCar MCar3= new MCar("초록",0);			//생성자 추가
	
	System.out.println("생산된 차의 대수(정적 필드) ==> " + MCar.carCount);
	System.out.println("생산된 차의 대수(정적 메소드) ==> " + MCar.currentCarCount());
	System.out.println("차의 최고 제한 속도 ==> " + MCar.MAXSPEED);
	System.out.println("PI의 값==> " + Math.PI);		//math클래스의 상수 필드인 파이를 출력
	System.out.println("3의 5제곱==> " + Math.pow(3,5));	//math클래스의 정적메소드인 pow 함수 사용
	
}
}