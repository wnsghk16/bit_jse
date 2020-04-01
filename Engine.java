package com.jse.app;
import java.util.Random;
import java.util.Scanner;

public class Engine {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("\n아래의 숫자중에서 선택해주세요.");
			System.out.println("0.종료 1.가위바위보 2.주사위 홀짝맞추기 3.1부터n까지합 4.성별체크 5.별만들기");
			int flag = scanner.nextInt();
			switch(flag) {
			case 0: System.out.println("종료합니다."); 
				return;
			case 1: game();
				break;
			case 2: dice();
				break;
			case 3: sum();
				break;
			case 4: find();
				break;
			case 5:
				star();
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
	
		if(dice%2==0){
			result="짝";
		}else{
			result="홀";
		}
		System.out.println(String.format("결과값은 %s수입니다.",result));
			
		String fin = "오답";
		if(choice.equals(result)) {	
			fin = "정답";
		}
		System.out.println(String.format("%s입니다.",fin));			
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
	static void sum() {
		System.out.println("1부터 n까지 합 구하기");
		System.out.println("n을 입력해 주세요");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int sum=0;
		
		for(int i=1;i<=n;i++) {
			sum += i;
		}
		
		System.out.println(String.format("1부터 %d까지 합 = %d", n, sum));
		
	}
	static void find() {
		System.out.println("주민번호를 입력하세요 ex)900101-123456");
		Scanner scanner = new Scanner(System.in);
		String ssn = scanner.next();//"900101-123456"
		System.out.println(String.format("당신의 주민번호는 %s입니다.",ssn));
		char ch = ssn.charAt(7);
		
		String gender="";
		switch(ch) {
		case '1': case'3':
			gender = "남성";//1,3
			break;
		case '2': case'4':
			gender = "여성";//2,4
			break;
		case '5': case'6':
			gender = "외국인";//5,6
			break;
		default:
			gender = "잘못입력한 값";//0,7,8,9
			break;			
		}
		
		System.out.println(String.format("당신은 %s입니다.",gender));
					
	}
	static void star() {
		System.out.print("n입력 : ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		for(int i=0; i<n/2+1; i++) {
			for(int j=n/2+1; j>i; j--) {
				System.out.print(" ");	
			}
			for(int k=1; k<=(2*i+1); k++) {
				System.out.print("*");	
			}			
			System.out.print("\n");
			
		}
		for(int i=n; i>n/2+1; i--) {
			for(int j=i-1; j<=n; j++) {
				System.out.print(" ");	
			}
			for(int k=n; k<=(2*i-3); k++) {
				System.out.print("*");	
			}			
			System.out.print("\n");
		}		
	}
}
