package android3_3;

public class exam03_07 {
	public static void main(String args[]) {
		Car myCar1= new Car("����",0);
		Car myCar2= new Car("�Ķ�",0);
		Car myCar3= new Car("�ʷ�",0);			//������ �߰��ؼ� ������ �κ�
		
		/*Car myCar1= new Car();		//myCar �ν��Ͻ��� �����ϰ� ����� �ӵ��� ����
		myCar1.color="����";
		myCar1.speed=0;
		
		Car myCar2= new Car();		//myCar �ν��Ͻ��� �����ϰ� ����� �ӵ��� ����
		myCar2.color="�Ķ�";
		myCar2.speed=0;
	
		Car myCar3= new Car();		//myCar �ν��Ͻ��� �����ϰ� ����� �ӵ��� ����
		myCar3.color="�ʷ�";
		myCar3.speed=0;*/
	
		myCar1.upSpeed(50);
		myCar2.downSpeed(20);
		myCar3.upSpeed(250);
		System.out.println("�ڵ��� 1�� ������ "+ myCar1.getColor()+"�̸�, �ӵ��� "+myCar1.getSpeed()+" km �Դϴ�.");
		System.out.println("�ڵ��� 2�� ������ "+ myCar2.getColor()+"�̸�, �ӵ��� "+myCar2.getSpeed()+" km �Դϴ�.");
		System.out.println("�ڵ��� 3�� ������ "+ myCar3.getColor()+"�̸�, �ӵ��� "+myCar3.getSpeed()+" km �Դϴ�.");
	}
}
