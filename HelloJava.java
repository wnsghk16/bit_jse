package com.jse.app;
import java.util.Scanner;

public class HelloJava {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름이 뭐에요? ");
		String name = scanner.next();
		System.out.println("안녕하세요 " + name + "씨.");
		System.out.println("어디 사세요? ");
		String place = scanner.next();
		System.out.println("아 " + place +" 좋은곳이죠.");
		System.out.println("몇살이세요? ");
		int age = scanner.nextInt();
		System.out.println(age + "살이시군요.");
		System.out.println("키는 몇이고, 몸무게는 몇키로에요?");
		float height = scanner.nextFloat();
		double weight = scanner.nextDouble();
		System.out.println("키는" + height + "cm고, 몸무게는" + weight + "kg이군요.");
		System.out.println("혈액형이 뭐에요?");
		char bloodType = scanner.next().charAt(0);
		System.out.println("혈액형은 " + bloodType + "형이군요.");
	}
}