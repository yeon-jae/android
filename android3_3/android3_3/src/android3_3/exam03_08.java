package android3_3;
import java.lang.Math;

public class exam03_08 {
	public static void main(String args[]) {
	MCar MCar1= new MCar("����",0);
	MCar MCar2= new MCar("�Ķ�",0);
	MCar MCar3= new MCar("�ʷ�",0);			//������ �߰�
	
	System.out.println("����� ���� ���(���� �ʵ�) ==> " + MCar.carCount);
	System.out.println("����� ���� ���(���� �޼ҵ�) ==> " + MCar.currentCarCount());
	System.out.println("���� �ְ� ���� �ӵ� ==> " + MCar.MAXSPEED);
	System.out.println("PI�� ��==> " + Math.PI);		//mathŬ������ ��� �ʵ��� ���̸� ���
	System.out.println("3�� 5����==> " + Math.pow(3,5));	//mathŬ������ �����޼ҵ��� pow �Լ� ���
	
}
}