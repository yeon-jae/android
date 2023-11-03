package android3_4;

class Tiger extends Animal {	//animal class를 상속받아 이 클래스를 정의한다.
	int age;
	@Override
	void move() {	//animal클래스의 추상메소드인 부분을 구현한다.
		// TODO Auto-generated method stub
		System.out.println("네발로 이동한다.");
	}
	
}
