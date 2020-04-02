package com.jse.app;
import java.util.Random;

public class RPSgame {
	private int user;
	private int com;
	
	
	public void setUser(int user) {
		this.user = user;
	}
	public int getUser() {
		return user;
	}
	public void setCom() {
		Random random = new Random();
		com = random.nextInt(3)+1;
	}
	public int getCom() {
		return com;
	}
	
	public int game() {
		
		int flag = 0;
		
		if(user == com) {
			flag = 0;
		}else if((user==1&&com==2) | (user==2&&com==3) | (user==3&&com==1)) {
			flag = 1;
		}else if((user==1&&com==3) | (user==2&&com==1) | (user==3&&com==2)) {
			flag = 2;
		}
		return flag;	
	}
}