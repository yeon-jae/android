package android3_4;

public class Car{			//�ڵ����� ����� �Ӽ� �ʵ带 ���� 
	String color;
	int speed=0;
	
	
	//������ �߰�
	Car(String color, int speed){
		this.color=color;
		this.speed=speed;
	}
	
	int getSpeed() {
		return speed;		//���� �ӵ��� ��� �޼ҵ� 
	}
	
	void upSpeed(int value) {
		if(speed+value>=200) 		//�߰� �ӵ��� ��� �޼ҵ�: �ִ� 200���� ���� ����
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
