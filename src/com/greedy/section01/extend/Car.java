package com.greedy.section01.extend;

public class Car {
	
	protected boolean isRunning;
	
	public Car() {
		System.out.println("Car 클래스의 기본 생성자 호출됨...");
	}
	
	public void run() {
		isRunning = true;
		System.out.println("자동차가 달립니다.");
	}
	
	public void soundHorn() {
		
		if(isRunning) {
			System.out.println("빵!빵!");
		}else {
			System.out.println("주행중이 아닌 상태에서는 경적을 울릴 수 없습니다.");
		}
	}
	
	public void stop() {
		isRunning = false;
		System.out.println("자동차가 멈춥니다.");
	}
	
	protected boolean isRunning() {
		return isRunning;
	}
	
}
