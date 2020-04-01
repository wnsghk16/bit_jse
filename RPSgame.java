package com.jse.app;
import java.util.Scanner;
import java.util.Random;

public class RPSgame {
	public static void main(String[] args) {
		game();
	}
	static void game() {
		System.out.println("가위1, 바위2, 보3을 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int user = scanner.nextInt();
		
		System.out.println(String.format("사용자의 값은 %d입니다.", user));
		
		Random random = new Random();
		int com = random.nextInt(3)+1;
		System.out.println(String.format("컴퓨터의 값은 %d입니다.", com));

		int flag = 0;
		
		if(user == com) {
			flag = 0;
		}else if((user==1&&com==2) | (user==2&&com==3) | (user==3&&com==1)) {
			flag = 1;
		}else if((user==1&&com==3) | (user==2&&com==1) | (user==3&&com==2)) {
			flag = 2;
		}else {
			System.out.println("잘못입력했습니다.");
			return;
		}
	
		switch(flag) {
		case 0:
			System.out.println("비겼습니다.");
			break;
		case 1: 
			System.out.println("당신이 졌습니다.");
			break;
		case 2: 
			System.out.println("당신이 이겼습니다.");
			break;
		}		
	}
}