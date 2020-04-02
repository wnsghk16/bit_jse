package com.jse.app;
import java.util.Random;
import java.util.Scanner;
import com.jse.app.Member;
import com.jse.app.Calculator;
import com.jse.app.Account;
import com.jse.app.Dice;
import com.jse.app.RPSgame;

public class Engine {
	static String test;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Member member = new Member();
		Calculator cal = new Calculator();
		Account acc = new Account();
		Dice dice = new Dice();
		RPSgame rps = new RPSgame();
		int choice=0;
		int pocket = 0;
		
		while(true) {
			System.out.println("\n아래의 숫자중에서 선택해주세요.");
			System.out.println("0.종료 "
					+ "1.회원가입 "
					+ "2.로그인 "
					+ "3.계산기 "
					+ "4.계좌관리 "
					+ "5.홀짝게임 "
					+ "6.가위바위보");
			int flag = scanner.nextInt();
			switch(flag) {
			case 0: 
				System.out.println("종료합니다."); 
				return;
			case 1: 
				System.out.println("회원가입");
				System.out.println("ID입력");
				String userid = scanner.next();
				member.setID(userid);
				System.out.println(String.format("%s님 가입에 성공했습니다.",userid));
				break;
			case 2: 
				System.out.println("로그인");
				System.out.println("ID입력");
				String id2 = scanner.next();
				String returnId = member.getID();
				if(id2.equals(returnId)) {
					System.out.println("로그인성공");
					System.out.println("로그인된 아이디 : "+ returnId);
				}else {
					System.out.println("로그인 실패");
				}
				break;
			case 3:
				System.out.println("계산기");
				System.out.println("1.덧셈 2.뺄셈 3.곱셈 4.나눗셈");
				System.out.print("선택해주세요: ");
				choice = scanner.nextInt();
				if(choice<1 | choice>4) {
					System.out.println("잘못입력했습니다.");
					break;
				}
				cal.setChoice(choice);
				System.out.print("첫번째 수를 입력하시오 : ");
				float num1 = scanner.nextFloat();
				System.out.print("두번째 수를 입력하시오 : ");
				float num2 = scanner.nextFloat();
				cal.setNum1(num1);
				cal.setNum2(num2);
				float result = cal.calculate();
				System.out.println("값은: "+ result);
				break;		
			case 4:
				System.out.println("계좌관리");
				System.out.println("1.잔액확인 2.입금 3.출금");
				System.out.print("선택해주세요: ");
				choice = scanner.nextInt();
				switch(choice) {
				case 1:
					acc.getPocket();
					pocket = acc.getPocket();
					break;
				case 2:
					System.out.println("입금할 금액을 입력해 주세요.");
					int money = scanner.nextInt();
					acc.addPocket(money);
					pocket = acc.getPocket();
					break;
				case 3:
					System.out.println("출금할 금액을 입력해 주세요.");
					money = scanner.nextInt();
					acc.minPocket(money);
					pocket = acc.getPocket();
					break;
				default:
					System.out.println("잘못입력했습니다.");
					break;
				}
				System.out.println(String.format("잔액은 %d입니다.",pocket));
				break;
			case 5:
				System.out.println("홀짝게임");
				System.out.println("주사위 홀짝 맞추기 게임");
				System.out.println("기대하는 값 홀/짝을 입력해 주세요");
				String expect = scanner.next();
				dice.setExpect(expect);
				if(!(expect.equals("홀") | expect.equals("짝"))) {
					System.out.println("잘못입력했습니다.");
					break;
				}
				System.out.println(String.format("당신의 예상값 : %s", dice.getExpect()));
				dice.setDice();
				System.out.println(String.format("실제 주사위값 : %d",dice.getDice()));
				System.out.println(String.format("%s입니다.",dice.dice()));	
				break;
			case 6:
				System.out.println("가위1, 바위2, 보3을 입력하세요");
				int user = scanner.nextInt();
				if(user>3) {
					System.out.println("잘못입력했습니다.");
					break;
				}
				rps.setUser(user);				
				System.out.println(String.format("사용자의 값은 %d입니다.",rps.getUser()));
				rps.setCom();
				System.out.println(String.format("컴퓨터의 값은 %d입니다.", rps.getCom()));
				int flag2 = rps.game();
								
				switch(flag2) {
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
				break;				
			default:
				System.out.println("잘못입력했습니다.");
				break;					
			}
		}
	}
	
}
