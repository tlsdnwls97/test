package kr.java.chapter9;

import java.util.Scanner;

public class ExMorse2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] nick = {"White","Black","Bear","Sesame","Gift"};
		String[] name = {"흰둥이","까만콩","곰돌이","깨소금","복돌이"};
		
		System.out.println("이름을 입력해주세요.");
		String str = sc.nextLine();
		
		for(int i = 0; i < 5; i++) {
			
			if(str.equals(name[i])) {
			System.out.println("> " + nick[i]);
			}
			
		
		}
		

	}
}