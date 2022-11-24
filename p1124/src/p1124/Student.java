package p1124;

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
	
//	public String toString() {
//		return ""+stuNum +","+name;
//	}
	
	

}
