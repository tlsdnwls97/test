package kr.java.chapter8;

import java.util.Scanner;

public class StudentMain4 {

	public static void main(String[] args) {
		// Student2, Score2 이용.
		// 홍길동/구로구/3학년, 수학 100, 국어 90
		// 고길동/영등포/3학년, 수학 70, 국어 80
		
		Scanner sc = new Scanner(System.in);
		
		
		Student2 student = new Student2();
		student.studentName = "홍길동";
		student.address = "구로구";
		student.grade = 3;
		student.subj1 = new Score2();
		student.subj2 = new Score2();
		student.subj3 = new Score2();
		student.subj1.subject = "수학";
		System.out.println("수학의 점수를 입력하세요.");
		student.subj1.score = sc.nextInt();
		
		student.subj2.subject = "과학";
		System.out.println("과학의 점수를 입력하세요.");
		student.subj2.score = sc.nextInt();
		
		student.subj3.subject = "영어";
		System.out.println("영어의 점수를 입력하세요.");
		student.subj3.score = sc.nextInt();
		
		System.out.println(student.studentName + " " + " " + student.address + " "
							+ " " + student.grade+ "학년 " + " 수학: " + student.subj1.score + " "
							+ " 과학: " + student.subj2.score + " 영어: " + student.subj3.score);
		
		System.out.println("");
		
		student.studentName1 = "고길동";
		student.address1 = "영등포구";
		student.grade1 = 3;
		student.subj4 = new Score2();
		student.subj5 = new Score2();
		student.subj6 = new Score2();
		student.subj1.subject = "수학";
		System.out.println("수학의 점수를 입력하세요.");
		student.subj4.score = sc.nextInt();
		

		student.subj2.subject = "과학";
		System.out.println("과학의 점수를 입력하세요.");
		student.subj5.score = sc.nextInt();
		
		student.subj3.subject = "영어";
		System.out.println("영어의 점수를 입력하세요.");
		student.subj6.score = sc.nextInt();
		
		System.out.println(student.studentName1 + " " + " " + student.address1 + " "
				+ " " + student.grade1 + "학년 " + " 수학: " + student.subj4.score + " "
				+ " 과학: " + student.subj5.score + " 영어: " + student.subj6.score);
		
		System.out.println("---------------------------------");
		
		System.out.println("수학의 총 합은 : " + (student.subj1.score+student.subj4.score) + " 수학의 평균은 : " + ((student.subj1.score+student.subj4.score)/2));
		System.out.println("과학의 총 합은 : " + (student.subj2.score+student.subj5.score) + " 과학의 평균은 : " + ((student.subj2.score+student.subj5.score)/2));
		System.out.println("영어의 총 합은 : " + (student.subj3.score+student.subj6.score) + " 영어의 평균은 : " + ((student.subj3.score+student.subj6.score)/2));

		/*for(int i = 0; i < students.length; i++) {
			Student2 student = students[i];
			System.out.println(student.studentName);
		}
		
		for(Student2 student : students) {
			System.out.println(student.studentName);
		}*/
	}

}
