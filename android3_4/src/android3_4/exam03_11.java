package android3_4;

public class exam03_11 {
	public static void main(String args[])
	{
		Animal animal;	//클래스 변수를 선언한다.
		
		animal= new Tiger();	
		animal.move();
		animal= new Eagle();
		animal.move();
	}
}
//다형헝: 자신의 서브 클래스에서 생성한 인스턴스도 클래스 변수에 대입할 수 있는 것을 말한다.
// 하나의 변수에 여러 종류의 인스턴스를 대입할 수 있다.