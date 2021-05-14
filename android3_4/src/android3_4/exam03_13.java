package android3_4;
interface  clickListener{
	public void print();	//click인터페이스 생성
}
public class exam03_13 {
	public static void main(String args[]) {
		clickListener listener=
				//익명 내부 클래스를 생성
				(new clickListener() {
					public void print() {
						System.out.println("클릭 리스너입니다.");
					}
				});
		listener.print(); //프린트 메소드 호출
	}
}
