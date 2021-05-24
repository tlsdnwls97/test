package kr.java.chapter8;

public class StudentMain3 {

	public static void main(String[] args) {
		// Student2, Score2 이용.
		// 홍길동/구로구/3학년, 수학 100, 국어 90
		// 고길동/영등포/3학년, 수학 70, 국어 80
		
		Student2 student = new Student2();
		student.studentName = "홍길동";
		student.address = "구로구";
		student.grade = 3;
		student.subj1 = new Score2();
		student.subj2 = new Score2();
		student.subj1.subject = "국어";
		student.subj1.score = 90;
		student.subj2.subject = "수학";
		student.subj2.score = 100;
		
		System.out.println(student.studentName + " " + " " + student.address + " "
							+ " " + student.grade+ "학년 " + " 국어: " + student.subj1.score + " "
							+ " 수학: " + student.subj2.score);
		
		System.out.println("");
		
		student.studentName1 = "고길동";
		student.address1 = "영등포구";
		student.grade1 = 3;
		student.subj1 = new Score2();
		student.subj2 = new Score2();
		student.subj1.subject = "국어";
		student.subj1.score = 80;
		student.subj2.subject = "수학";
		student.subj2.score = 70;
		
		System.out.println(student.studentName1 + " " + " " + student.address1 + " "
				+ " " + student.grade1 + "학년 " + " 국어: " + student.subj1.score + " "
				+ " 수학: " + student.subj2.score);

		/*for(int i = 0; i < students.length; i++) {
			Student2 student = students[i];
			System.out.println(student.studentName);
		}
		
		for(Student2 student : students) {
			System.out.println(student.studentName);
		}*/
	}

}
