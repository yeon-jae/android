package android3_4;
interface  clickListener{
	public void print();	//click�������̽� ����
}
public class exam03_13 {
	public static void main(String args[]) {
		clickListener listener=
				//�͸� ���� Ŭ������ ����
				(new clickListener() {
					public void print() {
						System.out.println("Ŭ�� �������Դϴ�.");
					}
				});
		listener.print(); //����Ʈ �޼ҵ� ȣ��
	}
}
