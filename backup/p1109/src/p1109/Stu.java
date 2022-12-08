package p1109;

public class Stu {
	
	String name;
	int kor;
	int eng;
	int total;
	double avg;
	
	// 기본생성자
	Stu(){}
	
	Stu(String name,int kor,int eng){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.total = kor+eng;
		this.avg = this.total/2.0;
	}
	

}
