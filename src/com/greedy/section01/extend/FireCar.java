package com.greedy.section01.extend;

public class FireCar extends Car {
	
	public FireCar() {
		/* 부모생성자 호출 구문
		 * 모든 생성자 맨 첫 줄에 super()를 컴파일러가 자동 추가한다.
		 * */
		super();
		System.out.println("FireCar 클래스의 기본 생성자 호출됨...");
	}
	
	
	/* @Override 이노테이션
	 * JDK 1.5부터 추가된 문법으로 오버라이딩 성립 요건을 체크하여 성립되지 않는 경우 컴파일 에러를 방생시킨다.
	 * */
//	@Override
	public void soundHorn() {
		
		/* super.
		 * 부모 인스턴스의 주소를 조정허눈 레퍼런스 변수이다.
		 * this.은 자동으로 컴파일러가 추가해주지만 명시적으로 부모가 가진 멤버에 접근해야 하는 경우 super.을 명시해야 한다.
		 * */
		if(super.isRunning) {
			System.out.println("빠아아아아아아아앙!");
		} else {
			System.out.println("소방차가 앞으로 갈 수 없습니다~ 비키세요~");
		}
	}
	
	public void sprayWater() {
		
		System.out.println("불난 곳을 발견했습니다. 물을 뿌립니다. ===============");
	}
}
