package android3_3;

public class MCar {
	String color;
	int speed=0;
	static int carCount=0;    //���� �ʵ� ����, ���� ���� ���� 
	final static int MAXSPEED=200;	//��� �ʵ� ����
	final static int MISSPEED=0;
	
	static int currentCarCount() {
		return carCount;	//���� �޼ҵ� ����, �޼ҵ� ȣ�� �Ϸ��� Car.currentCarCount()������ �̿�
	}
	
	//������ �߰�
	MCar(String color, int speed){
		this.color=color;
		this.speed=speed;
		carCount++;		//�ν��Ͻ��� �����Ǹ� ���� �ʵ��� carCount�� �ϳ��� ������Ų��.
	}
	MCar(int speed){
		this.speed=speed;
		
	}
	MCar(){}
	
					//3���� ������ �߰� 
	
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
