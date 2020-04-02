package com.jse.app;

public class Account {
	private int pocket;
	
	public Account() {
		pocket = 0;
	}
	public void addPocket(int money) {
		if(money<0) {
			System.out.println("잘못입력했습니다.");
			return;
		}
		pocket += money;
	}
	public void minPocket(int money) {
		if(money<0) {
			System.out.println("잘못입력했습니다.");
			return;
		}
		pocket -= money;
	}
	public int getPocket() {
		return pocket;
	}
}
