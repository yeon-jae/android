package android3;

public class exam03_04 {
	public static void main(String args[]) {
		int one[]=new int[3];		//3개의 정수형 배열을 선언
		for(int i=0; i<one.length;i++)
		{
			one[i]=10*i;	
		}
		String two[]= {"하나","둘","셋"};	//배열에 two룰 선언하고 직접 값을 3개 대입
		
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
