package p1107;

public class Stu {

	void print(int i,String name,int kor,int eng) {
		System.out.printf("[ 학생 %d ]\n",i+1);
		System.out.printf("이름 : %s\n",name);
		System.out.printf("국어점수 : %d\n",kor);
		System.out.printf("영어점수 : %d\n",eng);
		int total = kor+eng;
		double avg = total/2.0;
		System.out.printf("합계 : %d\n",total);
		System.out.printf("평균 : %.2f\n",avg);
	}
}
