package android3_4;

public class Automobile extends Car{ 		//carŬ�����κ��� ��ӹ����� �ǹ�
	Automobile(String color, int speed) {
		super(color, speed);
		// TODO Auto-generated constructor stub
	}
	//automobileŬ���� ������ �ʵ�� �޼ҵ带 ����.
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
