package android3;

public class exam03_04 {
	public static void main(String args[]) {
		int one[]=new int[3];		//3���� ������ �迭�� ����
		for(int i=0; i<one.length;i++)
		{
			one[i]=10*i;	
		}
		String two[]= {"�ϳ�","��","��"};	//�迭�� two�� �����ϰ� ���� ���� 3�� ����
		
		for(String str:two) {
			System.out.println(str);
		}
		int j=0;
		while(j<one.length)
		{
			System.out.println(one[j]);
			j++;
		}
	}
}
