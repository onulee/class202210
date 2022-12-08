package p1122_04;

public class Student {
	static int count;
	String stuNum;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	
	//초기화블럭
	{
		count++;
		stuNum = String.format("s%04d", count);
	}
	Student(){}
	Student(String name,int kor,int eng,int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = this.total/3.0;
	}
	
	Student(Student s){
		this.stuNum = s.stuNum;
		this.name = s.name;
		this.kor = s.kor;
		this.eng = s.eng;
		this.math = s.math;
		this.total = s.total;
		this.avg = s.avg;
		this.rank = s.rank;
	}
	
	//equals 메소드 호출
	public boolean equals(Student s) {
		if(stuNum.equals(s.stuNum)) {
			return true;
		}else {
			return false;
		}
	}
	
//	public String toString() {
//		return ""+stuNum +","+name;
//	}
	
	

}
