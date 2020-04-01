package com.jse.app;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		System.out.println("1.덧셈 2.뺄셈 3.곱셈 4.나눗셈");
		System.out.println("선택해주세요: ");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		
		if(choice<1 | choice>4) {
			System.out.println("잘못입력했습니다.");
			return;
		}
		
		float sum=0;//초기화
		System.out.println("첫번째 수를 입력하시오 : ");
		float a = scanner.nextFloat();
		System.out.println("두번째 수를 입력하시오 : ");
		float b = scanner.nextFloat();
		
		switch(choice) {
		case 1:
			sum = add(a,b);
			System.out.println("두수를 더한 값은 " + sum);
			break;
		case 2:
			sum = min(a,b);
			System.out.println("두수를 뺀 값은 " + sum);
			break;
		case 3:
			sum = mul(a,b);
			System.out.println("두수를 곱한 값은 " + sum);
			break;
		case 4:
			sum = div(a,b);
			System.out.println("두수를 나눈 값은 " + sum);
			break;
		default:
			System.out.println("잘못입력했습니다.");
			break;
		}	
		
	}
	
	static float add(float a, float b) {
		float sum = a + b;
		return sum;
	}
	static float min(float a, float b) {
		float sum = a - b;
		return sum;
	}
	static float mul(float a, float b) {
		float sum = a * b;
		return sum;
	}
	static float div(float a, float b) {
		float sum = a / b;
		return sum;
	}
}

