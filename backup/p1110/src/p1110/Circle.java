package p1110;

public class Circle extends Shape {
	Point p; //원점
	int r;   //반지름
	
	Circle(){ //기본생성자
		this.r = 100;
	}
	Circle(Point p,int r){ //생성자 매개변수2개
		this.p = p;
		this.r = r;
	}

}
