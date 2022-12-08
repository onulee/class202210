package p1121_03;

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
	
	Student(){
		count++;
		stuNum = String.format("s%04d", count);
	}
	
	Student(String name,int kor,int eng,int math){
		count++;
		stuNum = String.format("s%04d", count);
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = this.total/3.0;
	}
	
	public Student(String stuNum, String name, int kor, int eng, int math, int total, double avg, int rank) {
		this.stuNum = stuNum;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = total;
		this.avg = avg;
		this.rank = rank;
	}
	public String toString() {
		return ""+stuNum +","+name;
	}
	
	

}
