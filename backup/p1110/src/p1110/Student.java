package p1110;

public class Student {
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	
	Student(){} //기본생성자
	Student(String name,int kor,int eng,int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		this.avg = this.total/3.0;
	}
	

}
