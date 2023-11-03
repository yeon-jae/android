package android3;

public class exam03_06 {
	static int var=100;
	public static void main(String args[]) {
		int num1=100, num2=0;
		try {
			System.out.println(num1/num2);
		}
		catch(java.lang.ArithmeticException e) {
			System.out.println("계산에 문제가 있습니다.");		//문제가 발생하면 빠져나옴
		}
	}
}
