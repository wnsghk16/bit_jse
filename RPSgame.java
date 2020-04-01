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
		swcom(user,com,flag);
				
		switch(flag) {
		case 0:
			System.out.println("비겼습니다.");
			break;
		case 1: 
			System.out.println("당신이 이겼습니다.");
			break;
		case 2: 
			System.out.println("당신이 졌습니다.");
			break;
		}		
	}
	static int swcom(int user, int com, int flag) {
		if(user==1) {
			switch(com) {
			case 1:
				flag = 0; // 비김
				break;
			case 2:
				flag = 1; //짐
				break;
			case 3:
				flag = 2; //이김
				break;
			default:
				System.out.println("잘못입력했습니다.");
				break;
			}
		}else if(user==2) {
			switch(com) {
			case 1:
				flag = 2;
				break;
			case 2:
				flag = 0;
				break;
			case 3:
				flag = 1;
				break;
			default:
				System.out.println("잘못입력했습니다.");
				break;
			}
		}else if(user==3) {
			switch(com) {
			case 1:
				flag = 1;
				break;
			case 2:
				flag = 2;
				break;
			case 3:
				flag = 0;
				break;
			default:
				System.out.println("잘못입력했습니다.");
				break;
			}
		}else {
			System.out.println("잘못입력했습니다.");
		}
		return flag;
	}
}
