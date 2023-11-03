package android3_4;

public class Car{			//자동차의 색상과 속성 필드를 정의 
	String color;
	int speed=0;
	
	
	//생성자 추가
	Car(String color, int speed){
		this.color=color;
		this.speed=speed;
	}
	
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
