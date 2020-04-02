package com.jse.app;
import java.util.Random;

public class Dice {
	private String expect;
	private int dice;
	
	public void setExpect(String expect) {
		this.expect = expect;
	}
	public String getExpect() {
		return expect;
	}
	public void setDice() {
		Random random = new Random();
		this.dice = random.nextInt(6)+1;
	}
	public int getDice() {
		return this.dice;
	}
	public String dice() {
		String result="홀";
		String fin = "오답";
		
		if(dice%2==0){
			result="짝";
		}
				
		if(expect.equals(result)) {	
			fin = "정답";
		}
		return fin;
	}
}
