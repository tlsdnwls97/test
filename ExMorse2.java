package kr.java.chapter9;

import java.util.Scanner;

public class ExMorse2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] nick = {"White","Black","Bear","Sesame","Gift"};
		String[] name = {"�����","���","������","���ұ�","������"};
		
		System.out.println("�̸��� �Է����ּ���.");
		String str = sc.nextLine();
		
		for(int i = 0; i < 5; i++) {
			
			if(str.equals(name[i])) {
			System.out.println("> " + nick[i]);
			}
			
		
		}
		

	}
}