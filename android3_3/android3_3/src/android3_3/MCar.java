package android3_3;

public class MCar {
	String color;
	int speed=0;
	static int carCount=0;    //정적 필드 선언, 차의 개수 세기 
	final static int MAXSPEED=200;	//상수 필드 선언
	final static int MISSPEED=0;
	
	static int currentCarCount() {
		return carCount;	//정적 메소드 정의, 메소드 호출 하려면 Car.currentCarCount()형식을 이용
	}
	
	//생성자 추가
	MCar(String color, int speed){
		this.color=color;
		this.speed=speed;
		carCount++;		//인스턴스가 생성되면 정적 필드인 carCount를 하나씩 증가시킨다.
	}
	MCar(int speed){
		this.speed=speed;
		
	}
	MCar(){}
	
					//3개의 생성자 추가 
	
	int getSpeed() {
		return speed;		//현재 속도를 얻는 메소드 
	}
	
	void upSpeed(int value) {
		if(speed+value>=200) 		//추가 속도를 얻는 메소드: 최대 200까지 증폭 가능
			speed=200;	
		else
			speed=speed+value;
		}
	
	void downSpeed(int value)
	{
		if(speed-value<=0)
			speed=0;
		else
			speed=speed-value;
	}
	String getColor() {
		return color;
	
	}
}
