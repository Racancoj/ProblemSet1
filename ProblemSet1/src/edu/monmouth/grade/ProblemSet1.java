package edu.monmouth.grade;

public class ProblemSet1 {

	public static void main(String[] args) {
		Grade grade = new Grade();
		System.out.println(grade.getGradeLetter());
		grade.setGradeLetter('A');
		System.out.println(grade.getGradeLetter());
		
		Grade myGrade = new Grade('B');
		System.out.println(myGrade.getGradeLetter());
		myGrade.setGradeLetter('C');
		System.out.println(myGrade.getGradeLetter());

	}
	
}
