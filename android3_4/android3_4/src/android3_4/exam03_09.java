package android3_4;

public class exam03_09 {
	public static void main(String args[]) {
		Automobile auto= new Automobile(null, 0); 
		
		auto.upSpeed(250); //�������̵��� upSpeed�� ����ȴ�.
		System.out.println("�¿����� �ӵ��� "+auto.getSpeed()+"km�Դϴ�.");
	}
}
