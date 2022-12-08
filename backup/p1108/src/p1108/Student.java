package p1108;

public class Student {
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	
	Student(){}
	Student(String n,int k,int e,int m){
		name = n;
		kor = k;
		eng = e;
		math = m;
		total = k + e + m;
		avg = total/3.0;
	}

}
