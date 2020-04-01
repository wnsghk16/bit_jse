package com.jse.app;
import java.util.Random;
import java.util.Scanner;

public class Engine {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("0.종료 1.가위바위보 게임 2.주사위 홀짝 게임");
			int flag = scanner.nextInt();
			switch(flag) {
			case 0: System.out.println("종료"); 
					return;
			case 1: System.out.println("계산기");
					break;
			case 2: dice();
					break;
			
			}
		}
	}
	static void dice() {
		System.out.println("주사위 홀짝 맞추기 게임");
		System.out.println("기대하는 값 홀/짝을 입력해 주세요");
		Scanner scanner = new Scanner(System.in);
		String choice = scanner.next();
		System.out.println(String.format("당신의 예상값 : %s", choice));
		
		Random random = new Random();
		int dice = random.nextInt(6)+1;
		System.out.println(String.format("실제 주사위값 : %d",dice));
		
		String result="";
		switch(dice) {
		case 2: case 4: case 6:
			result="짝";
			break;
		case 1: case 3: case 5:
			result="홀";
			break;
		}
		System.out.println(String.format("결과값은 %s수입니다.",result));
		/*
		if(dice%2==0){
			result="짝";
		}else{
			result="홀";
		}
		System.out.println(String.format("결과값은 %s수입니다.",result));
		 */		
		String fin = "오답";
		if(choice.equals(result)) {	
			fin = "정답";
		}
		System.out.println(String.format("%s입니다.",fin));			
	}
}
