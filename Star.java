package com.jse.app;
import java.util.Scanner;

public class Star {
	public static void main(String[] args) {
		star();
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
