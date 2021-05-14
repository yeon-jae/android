package android3_4;

public class Automobile extends Car{ 		//car클래스로부터 상속받음을 의미
	Automobile(String color, int speed) {
		super(color, speed);
		// TODO Auto-generated constructor stub
	}
	//automobile클래스 고유의 필드와 메소드를 선언.
	int seatNum;
	
	int getSeatNum() {
		return seatNum;
	}
	void upSpeed(int value) {
		if(speed+value>=300)
			speed=300;
		else
			speed=speed+(int)value;
	}
}
